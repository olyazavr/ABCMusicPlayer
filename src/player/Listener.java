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

    /**
     * A way to locate the Voice object from its name
     */
    private Map<String, Voice> voices = new HashMap<String, Voice>();

    /**
     * Variables to keep track of information shared among measures and notes
     */
    private String key = "";
    private Voice currentVoice;
    private Measure currentMeasure;

    /**
     * do nothing, because the top of the stack should have the node already in
     * it
     */
    @Override
    public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
        assert stack.size() == 1;
    }

    /**
     * Make a new Measure object and set currentMeasure to it
     */
    @Override
    public void enterMeasure(ABCMusicParser.MeasureContext ctx) {
        System.out.println(ctx.getText());

        // TODO: CHECK FOR REPEATS SOMEHOW

        Measure measure = new Measure(new ArrayList<MusicSymbol>(), new Lyric(new ArrayList<String>()),
                new HashMap<String, Integer>());

        System.out.println("adding Measure " + measure);
        currentMeasure = measure;
        currentVoice.addMeasure(measure);
    }

    /**
     * Make actual MusicPiece object
     */
    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
        System.out.println(ctx.getText());

        Signature signature = (Signature) stack.pop();
        List<Voice> voicesList = new ArrayList<Voice>(voices.values());
        MusicPiece musicPiece = new MusicPiece(signature, voicesList);

        System.out.println("adding MusicPiece" + musicPiece);
        stack.push(musicPiece);
    }

    /**
     * Make a new Voice to add Lyrics and Notes to. Set currentVoice to it.
     */
    @Override
    public void enterField_voice(ABCMusicParser.Field_voiceContext ctx) {

        // we could either be in the header or in the body. We only care for the
        // body. If we are not in the header, the stack should have something in
        // it already.
        if (stack.size() > 0) {
            System.out.println(ctx.getText());

            // get voice name sans the "V:"
            String voiceName = ctx.getText().substring(2).trim();
            if (voices.containsKey(voiceName)) {
                currentVoice = voices.get(voiceName);
                System.out.println("switching to Voice" + currentVoice);
            } else {
                Voice voice = new Voice(voiceName, new ArrayList<Measure>());
                System.out.println("adding Voice" + voice);
                voices.put(voiceName, voice);
            }
        }

    }

    /**
     * Store header info in Signature object
     */
    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
        System.out.println(ctx.getText());

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
            Voice defaultVoice = new Voice("defaultVoice", new ArrayList<Measure>());
            v.add("defaultVoice");
            currentVoice = defaultVoice;
        }

        Signature signature = new Signature(t, c, l, m, q, key, v);
        System.out.println("adding Signature " + signature);
        stack.push(signature);
    }

    /**
     * Pop notes, add them to Chord, add Chord to currentVoice. This way all the
     * notes in the Chord will be played at the same time.
     */
    @Override
    public void exitChord(ABCMusicParser.ChordContext ctx) {
        // [ notes ]
        String chordText = ctx.getText();
        System.out.println(chordText);

        // I need the number of notes, so I split around them, and the number of
        // notes will be 1 less than the number of chunks
        String[] chordsSplit = chordText.split("[A-Ga-g]");
        int numNotes = chordsSplit.length - 1;

        List<Pitch> notes = new ArrayList<Pitch>(numNotes);

        // pop notes and add them to a list
        for (int i = 0; i < numNotes; ++i) {
            notes.add((Pitch) currentMeasure.popMusicSymbol());
        }

        Chord chord = new Chord(notes);
        System.out.println("adding Chord " + chord);

        currentMeasure.addMusicSymbol(chord);
    }

    /**
     * Pop notes, modify their length, add new notes back. This way, they will
     * be played as a Tuplet.
     */
    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
        System.out.println(ctx.getText());

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
            Pitch note = (Pitch) currentMeasure.popMusicSymbol();
            // add to the currentVoice the same note with its length multiplied
            // by the multiplicationFactor
            Pitch newNote = note.multiplyLength(multiplicationFactor);

            System.out.println("adding tuplet " + newNote);
            currentMeasure.addMusicSymbol(newNote);
        }

    }

    /**
     * Add Rest.
     */
    @Override
    public void exitRest(ABCMusicParser.RestContext ctx) {
        // duration is right after the 'z'
        Fraction duration = new Fraction(ctx.getText().substring(1));
        Rest rest = new Rest(duration);

        System.out.println(ctx.getText());
        System.out.println("adding Rest " + rest);
        currentMeasure.addMusicSymbol(rest);
    }

    /**
     * Add Pitch
     */
    @Override
    public void exitNote(ABCMusicParser.NoteContext ctx) {
        String text = ctx.getText();
        System.out.println(text);
        char value = 'A';
        Fraction length = new Fraction(1, 1);
        int octave = 0;
        int accidental = 0;
        // this is for storing accidentals for the measure
        String noteOctave = "";

        // split everything so we can deal with modifiers
        String[] splitNote = text.trim().split("");

        for (String s : splitNote) {
            if (s.matches("[A-G]")) { // this is the actual note
                value = s.charAt(0);
                noteOctave += s;
            }
            else if (s.matches("[a-g]")) { // note one octave up
                value = s.toUpperCase().charAt(0);
                noteOctave += s;
                octave++;
            }
            else if (s.equals("'")) { // higher octave
                noteOctave += "'";
                octave++;

            } else if (s.equals(",")) { // lower octave
                noteOctave += ",";
                octave--;

            } else if (s.equals("^")) { // sharp
                accidental++;

            } else if (s.equals("_")) { // flat
                accidental -= 2;
            }
        }

        // if the note doesn't set its own accidental, try taking the
        // measure's accidental
        if (accidental == 0) {
            accidental += currentMeasure.getAccidental(noteOctave, key);
        } else {
            currentMeasure.addAccidental(noteOctave, accidental);
        }

        // now, fix the accidental
        // for every two sharps, move up a pitch
        if (accidental == 2) {
            List<String> adjust = Scales.movePitch(value, 1);
            value = adjust.get(0).charAt(0);
            octave += new Integer(adjust.get(1));
            accidental = 0;

            // for every two flats, move down a pitch
        } else if (accidental == -4) {
            List<String> adjust = Scales.movePitch(value, -1);
            value = adjust.get(0).charAt(0);
            octave += new Integer(adjust.get(1));
            accidental = 0;
        }

        Pitch note = new Pitch(length, value, octave, accidental);

        System.out.println("adding Pitch of " + note);
        currentMeasure.addMusicSymbol(note);

    }

    /**
     * Add syllables to currentVoice's Lyric
     */
    @Override
    public void exitLyric(ABCMusicParser.LyricContext ctx) {
        System.out.println(ctx.getText());

        // remove the initial "w:" and split by spaces
        String[] splitLyrics = ctx.getText().substring(2).trim().split(" ");
        

        for (String s : splitLyrics) {
            if (s.contains("-")) { // breaks word into 2 syllables

            }
        }
    }

    private void addToNextMeasure() {
        // find the measures that need lyrics
        List<Measure> measures = currentVoice.getMeasuresWithoutEnoughLyrics();

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
