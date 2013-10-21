package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import utils.Fraction;
import utils.Scales;

/**
 * Walks the tree, creates a MusicPiece object with Notes and Syllables
 * 
 * getMusic() return the final MusicPiece
 * 
 */
public class Listener extends ABCMusicBaseListener {
    private Stack<Object> stack = new Stack<Object>();
    private String key = "";
    private Map<String, Voice> voices = new HashMap<String, Voice>();
    private Voice currentVoice;

    @Override
    public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
        // do nothing, because the top of the stack should have the node already
        // in it
        assert stack.size() == 1;
    }

    @Override
    public void exitMeasure(ABCMusicParser.MeasureContext ctx) {
        // test for repeats here!
    }

    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
        // make actual MusicPiece object

    }

    @Override
    public void enterField_voice(ABCMusicParser.Field_voiceContext ctx) {
        // Make a new Voice to add Lyrics and Notes to. Set currentVoice to it.

        // we could either be in the header or in the body. We only care for the
        // body. If we are not in the header, the stack should have something in
        // it already.
        if (stack.size() > 0) {
            // get voice name sans the "V:"
            String voiceName = ctx.getText().substring(2).trim();
            if (voices.containsKey(voiceName)) {
                currentVoice = voices.get(voiceName);
            } else {
                Voice voice = new Voice(voiceName, new ArrayList<MusicSymbol>(), new Lyric(new ArrayList<String>()));
                voices.put(voiceName, voice);
            }
        }

    }

    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
        // store header info in Signature object

        String[] lines = ctx.getText().split("/n");
        String t = "";
        String c = "Unknown";
        Fraction m = new Fraction(4, 4);
        // can't leave this null, so initialize to something silly
        Fraction l = new Fraction(0, 1);
        String q = "";
        List<String> v = new ArrayList<String>();

        // populate fields, we don't care about X: whatever
        for (String s : lines) {
            if (s.startsWith("T:")) { // title, mandatory
                t = s.substring(2).trim();
            }
            else if (s.startsWith("C:")) { // composer
                c = s.substring(2).trim();
            }
            else if (s.startsWith("M:")) { // meter
                // make a Fraction object by splitting around the /
                m = new Fraction(s.substring(2).trim());
            }
            else if (s.startsWith("L:")) { // length
                // make a Fraction object by splitting around the /
                l = new Fraction(s.substring(2).trim());
            }
            else if (s.startsWith("Q:")) { // tempo
                q = s.substring(2).trim();
            }
            else if (s.startsWith("K:")) { // key, mandatory
                key = s.substring(2).trim();
            }
            else if (s.startsWith("V:")) { // voices
                v.add(s.substring(2).trim());
            }
        }

        // Default length is 1/16 if meter < 3/4 and 1/8 if meter>= 3/4
        if (l.evaluate() == 0f) { // has not been re-initialized
            if (m.evaluate() < .75) {
                l = new Fraction(1, 16);
            } else {
                l = new Fraction(1, 8);
            }
        }

        // Default tempo is length notes = 100
        if (t.isEmpty()) {
            t = l.toString() + "=100";
        }

        // create a default voice if there are no voices, and it will always be
        // the currentVoice
        if (v.isEmpty()) {
            Voice defaultVoice = new Voice("defaultVoice", new ArrayList<MusicSymbol>(), new Lyric(
                    new ArrayList<String>()));
            v.add("defaultVoice");
            currentVoice = defaultVoice;
        }

        stack.push(new Signature(t, c, l, m, q, key, v));
    }

    @Override
    public void exitChord(ABCMusicParser.ChordContext ctx) {
        // pop notes, add them to Chord, add Chord to currentVoice

        // [ notes ]
        String chordText = ctx.getText();

        // I need the number of notes, so I split around them, and the number of
        // notes will be 1 less than the number of chunks
        String[] chordsSplit = chordText.split("[A-Ga-g]");
        int numNotes = chordsSplit.length - 1;

        List<Pitch> notes = new ArrayList<Pitch>(numNotes);

        // pop notes and add them to a list
        for (int i = 0; i < numNotes; ++i) {
            notes.add((Pitch) currentVoice.popMusicSymbol());
        }

        Chord chord = new Chord(notes);

        currentVoice.addMusicSymbol(chord);
    }

    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
        // pop notes, modify their length, add new notes back

        // determines if duplet, triplet, quadruplet
        int tupletNumber = new Integer(ctx.getText().substring(1, 2));

        // multiply duration of each note by 3/2 if duplet, 2/3 if triplet, 3/4
        // if quadruplet
        Fraction multiplicationFactor = new Fraction(3, 2);
        if (tupletNumber == 3) {
            multiplicationFactor = new Fraction(2, 3);
        }
        else if (tupletNumber == 4) {
            multiplicationFactor = new Fraction(3, 4);
        }

        for (int i = 0; i < tupletNumber; ++i) {
            Pitch note = (Pitch) currentVoice.popMusicSymbol();
            // add to the currentVoice the same note with its length multiplied
            // by the multiplicationFactor
            currentVoice.addMusicSymbol(note.multiplyLength(multiplicationFactor));
        }

    }

    @Override
    public void exitRest(ABCMusicParser.RestContext ctx) {
        // add Rest

        // duration is right after the 'z'
        Fraction duration = new Fraction(ctx.getText().substring(1));

        currentVoice.addMusicSymbol(new Rest(duration));
    }

    @Override
    public void exitNote(ABCMusicParser.NoteContext ctx) {
        // add Pitch

        String text = ctx.getText();
        char value = 'A';
        Fraction length = new Fraction(1, 1);
        int octave = 0;
        int accidental = 0;

        // split everything so we can deal with modifiers
        String[] splitNote = text.trim().split("");

        for (String s : splitNote) {
            if (s.matches("[A-G]")) { // this is the actual note
                value = s.charAt(0);
            }
            else if (s.matches("[a-g]")) { // note one octave up
                value = s.charAt(0);
                octave ++;
            }
            else if (s.equals("'")) { // higher octave
                octave ++;

            } else if (s.equals(",")) { // lower octave
                octave --;

            } else if (s.equals("^")) { // sharp
                accidental ++;

            } else if (s.equals("_")) { // flat
                // flat actually equals -2, but we need this so it can cancel
                // out with the sharp
                accidental--;
            }
        }

        Scales.adjustKey(value, key);

        // now, fix the accidental
        // if there are two flats, move down an octave, keep accidental = -2
        if (accidental == -2) {
            octave -= 1;
        } else if (accidental == -1) { // this is just the format we want
            accidental = -2;
        } else if (accidental == 2) {
            
        }

        currentVoice.addMusicSymbol(new Pitch(length, value, octave, accidental));

    }

    @Override
    public void exitLyric(ABCMusicParser.LyricContext ctx) {
        // do some crazy shit and produce syllables
    }

    /**
     * Gives the final MusicPiece object made from the file inputted
     * 
     * @return MusicPiece
     */
    protected MusicPiece getMusic() {
        return (MusicPiece) stack.get(0);
    }

}
