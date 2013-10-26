package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import lyrics.LyricsLexer;
import lyrics.LyricsParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import utils.Fraction;
import utils.Scales;

/**
 * Walks the tree, creates a MusicPiece object with Notes and Syllables
 * 
 * getMusic() return the final MusicPiece
 * 
 */
public class Listener extends ABCMusicBaseListener {
    /**
     * Contains Signature and MusicPiece
     */
    private Stack<Object> finalStack = new Stack<Object>();

    /**
     * Stacks to combine smaller objects into larger ones
     */
    private Stack<MusicSymbol> musicSymbolStack = new Stack<MusicSymbol>();
    private Stack<List<MusicSymbol>> musicSymbolPerMeasure = new Stack<List<MusicSymbol>>();
    private List<ArrayList<String>> lyricStack = new ArrayList<ArrayList<String>>();

    /**
     * A way to locate each Voice stack from its name, and a variable to keep
     * track of which voice we're in
     */
    private Map<String, Stack<Measure>> voices = new HashMap<String, Stack<Measure>>();
    private String currentVoice = "defaultVoice";

    /**
     * Notes need to know what key they're in. The dictionary keeps track of
     * what notes have sharps or flats in each measure. Scale has a dictionary
     * of key signatures.
     */
    private String key = "";
    private Map<String, Integer> accidentals = new HashMap<String, Integer>();
    Scales scale;

    /**
     * Keep a list of measures that could possibly be repeated from the
     * beginning or from after a repeat, or from after an end notes symbol
     */
    private Map<String, List<List<MusicSymbol>>> voiceRepeatMeasures = new HashMap<String, List<List<MusicSymbol>>>();

    /**
     * do nothing, because the top of the stack should have the node already in
     * it
     */
    @Override
    public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
        assert finalStack.size() == 1;
    }

    /**
     * Clear repeatedMeasures if there is a left repeat
     */
    @Override
    public void enterMeasure(ABCMusicParser.MeasureContext ctx) {
        // clear and restart repeatedMeasures
        if (ctx.LREPEAT() != null) {
            voiceRepeatMeasures.get(currentVoice).clear();
        }
    }

    /**
     * Check for repeats and add all the repeated measures if there is a repeat
     * symbol. Add all the Lyrics and MusicSumbols to make a new Measure object
     * to add to the stack.
     */
    @Override
    public void exitMeasure(ABCMusicParser.MeasureContext ctx) {
        // Obtain the musicSymbols for this measure
        List<MusicSymbol> musicSymbols = new ArrayList<MusicSymbol>(musicSymbolStack);
        musicSymbolStack.clear();
        accidentals.clear(); // clear the accidentals for this measure\

        // don't repeat if there's a one-repeat
        if (ctx.ONE_REPEAT() == null) {
            voiceRepeatMeasures.get(currentVoice).add(musicSymbols);
        }

        // add all the recorded repeatedMeasures if there's a repeat
        if (ctx.RREPEAT() != null) {
            musicSymbolPerMeasure.addAll(voiceRepeatMeasures.get(currentVoice));
            voiceRepeatMeasures.get(currentVoice).clear();
        }

        // clear and restart repeatedMeasures
        if (ctx.END_NOTES() != null) {
            voiceRepeatMeasures.get(currentVoice).clear();
        }

        musicSymbolPerMeasure.add(musicSymbols);

    }

    /**
     * Make actual MusicPiece object
     */
    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {

        // We can finally make all the Voices, since we are done
        // entering/exiting them
        List<Voice> voicesList = new ArrayList<Voice>();
        for (String voiceName : voices.keySet()) {
            List<Measure> measures = new ArrayList<Measure>(voices.get(voiceName));
            voicesList.add(new Voice(voiceName, measures));
        }

        // Find the Signature and make a MusicPiece
        Signature signature = (Signature) finalStack.pop();
        MusicPiece musicPiece = new MusicPiece(signature, voicesList);

        finalStack.push(musicPiece);
    }

    /**
     * Now that we have all the measures and the corresponding lyrics, we can
     * make the Measure objects
     */
    @Override
    public void exitLine(ABCMusicParser.LineContext ctx) {
        System.out.println("exiting line");
        // loop through each measure's worth of MusicSymbols
        for (List<MusicSymbol> musicSymbols : musicSymbolPerMeasure) {

            // find the number of notes that aren't Rests
            int numNotes = 0;
            for (MusicSymbol note : musicSymbols) {
                if (!(note instanceof Rest)) {
                    numNotes++;
                }
            }

            // get the Lyric!
            Lyric lyrics = makeLyric(numNotes);
            // make the actual measure to push to the stack
            Measure measure = new Measure(musicSymbols, lyrics);
            System.out.println("New measure " + musicSymbols);
            System.out.println("with lyrics " + lyrics);

            Stack<Measure> currentStack = voices.get(currentVoice);
            currentStack.push(measure);
        }
    }

    /**
     * Make a new Voice to add Lyrics and Notes to. Set currentVoice to it.
     */
    @Override
    public void enterField_voice(ABCMusicParser.Field_voiceContext ctx) {
        // we could either be in the header or in the body. We only care for the
        // body. If we are not in the header, the stack should have something in
        // it already.
        if (finalStack.size() > 0) {
            // get voice name sans the "V:" and set it to currentVoice
            String voiceName = ctx.getText().substring(2).trim();
            currentVoice = voiceName;

            // add a new Voice stack and repeatMeasure list if needed
            Stack<Measure> voiceExists = voices.get(currentVoice);
            if (voiceExists == null) { // add new Voice stack
                Stack<Measure> stack = new Stack<Measure>();
                List<List<MusicSymbol>> list = new ArrayList<List<MusicSymbol>>();
                voices.put(voiceName, stack);
                voiceRepeatMeasures.put(voiceName, list);
            }
        }
    }

    /**
     * Store header info in Signature object
     */
    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
        // initialize scale
        scale = new Scales();

        String[] lines = ctx.getText().split("\r\n");
        String t = "";
        String c = "Unknown";
        Fraction m = new Fraction(4, 4);
        // can't leave this null, so initialize to something silly
        Fraction l = new Fraction(0, 1);
        Fraction q = new Fraction(0, 1);
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
                String meter = s.substring(2).trim();
                if (meter.equals("C")) { // C = 4/4
                    m = new Fraction(4, 4);
                } else {
                    // make a Fraction object by splitting around the /
                    m = new Fraction(meter);
                }
            }
            else if (s.startsWith("L:")) { // length
                // make a Fraction object by splitting around the /
                l = new Fraction(s.substring(2).trim());
            }
            else if (s.startsWith("Q:")) { // tempo
                // gives "length=number", need length*number
                String[] extracted = s.substring(2).trim().split("=");
                Fraction length = new Fraction(extracted[0]);
                int number = new Integer(extracted[1]);
                q = length.multiply(number);
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
        if (q.evaluate() == 0f) {
            q = l.multiply(100);
        }

        // create a default Voice stack if no Voices are added
        if (v.isEmpty()) {
            Stack<Measure> stack = new Stack<Measure>();
            v.add("defaultVoice");
            voices.put("defaultVoice", stack);
            List<List<MusicSymbol>> list = new ArrayList<List<MusicSymbol>>();
            voiceRepeatMeasures.put(currentVoice, list);
        }

        Signature signature = new Signature(t, c, l, m, q, key, v);
        finalStack.push(signature);
    }

    /**
     * Pop notes, add them to Chord, add Chord to current Voice stack. This way
     * all the notes in the Chord will be played at the same time.
     */
    @Override
    public void exitChord(ABCMusicParser.ChordContext ctx) {
        // [ notes ]
        String chordText = ctx.getText();

        // I need the number of pitches/rests, so I split around them, and the
        // number of notes will be 1 less than the number of chunks
        String[] chordsSplit = chordText.split("[A-Ga-gzZ]");
        int numNotes = chordsSplit.length - 1;

        List<MusicSymbol> notes = new ArrayList<MusicSymbol>(numNotes);

        // pop notes and add them to a list
        for (int i = 0; i < numNotes; ++i) {
            notes.add(musicSymbolStack.pop());
        }

        Chord chord = new Chord(notes);
        musicSymbolStack.push(chord);
    }

    /**
     * Pop notes, modify their length, add new notes back. This way, they will
     * be played as a Duplet.
     */
    @Override
    public void exitDuplet(ABCMusicParser.DupletContext ctx) {
        addTuplet(2);
    }

    /**
     * Pop notes, modify their length, add new notes back. This way, they will
     * be played as a Triplet.
     */
    @Override
    public void exitTriplet(ABCMusicParser.TripletContext ctx) {
        addTuplet(3);
    }

    /**
     * Pop notes, modify their length, add new notes back. This way, they will
     * be played as a Quadruplet.
     */
    @Override
    public void exitQuadruplet(ABCMusicParser.QuadrupletContext ctx) {
        addTuplet(4);
    }

    /**
     * Add Rest
     */
    @Override
    public void exitRest(ABCMusicParser.RestContext ctx) {
        // duration is right after the 'z'
        String durationString = ctx.getText().substring(1);
        Fraction duration;
        // duration may be empty if none specified
        if (!durationString.isEmpty()) {
            duration = new Fraction(durationString);
        } else {
            duration = new Fraction(1, 1);
        }
        Rest rest = new Rest(duration);
        musicSymbolStack.push(rest);
    }

    /**
     * Add Pitch
     */
    @Override
    public void exitNote(ABCMusicParser.NoteContext ctx) {
        String text = ctx.getText();
        char value = 'A';
        Fraction length = new Fraction(1, 1);
        // to calculate real length later, since we split all characters
        String lengthString = "";
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

            } else if (s.equals("=")) { // natural
                accidental = 5; // let 5 represent natural

            } else if (s.equals("^")) { // sharp
                accidental++;

            } else if (s.equals("_")) { // flat
                accidental -= 2;
            } else if (s.matches("[1-9/]")) {
                // note length
                lengthString += s;
            }
        }

        // if we found length, set it
        if (!lengthString.isEmpty()) {
            length = new Fraction(lengthString);
        }

        // if the note doesn't set its own accidental and is not natural, try
        // taking the measure's accidental, and then the key's accidental
        if (accidental == 0) {
            if (accidentals.containsKey(noteOctave)) {
                accidental += accidentals.get(noteOctave);
            } else {
                accidental += Scales.adjustKey(String.valueOf(value), key);
            }
        } else {
            accidentals.put(noteOctave, accidental);
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
        } else if (accidental == 5) {
            // this is a natural, but we had to represent it somehow
            accidental = 0;
        }

        Pitch note = new Pitch(length, value, octave, accidental);
        musicSymbolStack.push(note);
    }

    /**
     * Add syllables to current Voice's stack by passing the lyric text to
     * another parser
     */
    @Override
    public void exitLyric(ABCMusicParser.LyricContext ctx) {
        String lyricText = ctx.getText();
        // remove the w:
        lyricText = lyricText.substring(2).trim();

        // Create a stream of tokens using the lexer.
        CharStream stream = new ANTLRInputStream(lyricText);
        LyricsLexer lexer = new LyricsLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        // List<? extends Token> actualTokens = lexer.getAllTokens();

        // Feed the tokens into the parser.
        LyricsParser parser = new LyricsParser(tokens);
        parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        ParseTree tree = parser.lyric(); // "lyric" is the starter rule.
        // ((RuleContext) tree).inspect(parser);

        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        LyricsListener listener = new LyricsListener();
        walker.walk(listener, tree);
        ArrayList<ArrayList<String>> lyric = listener.getLyric();

        lyricStack.addAll(lyric);
    }

    /**
     * Makes a Lyric object based on the content of lyricStack. There are 3
     * cases:
     * 
     * 1) lyricStack has a number of ArrayLists. This happens when the syllables
     * are separated by bars. Then, we make sure there are not too many or too
     * little syllables (padding with spaces if needed).
     * 
     * 2) lyricStack has one ArrayList. This happens when syllables aren't
     * separated, so they are given to us in one huge chunk. Then we grab the
     * number we need, deleteing them from the stack.
     * 
     * 3) There are no syllables. This is when there are no words to a song. We
     * just make an empty Lyric.
     * 
     * This mutates the lyricStack.
     * 
     * @param numNotes
     *            number of notes in the measure that aren't Rests
     * @return the new Lyric object with the right number of syllables
     */
    private Lyric makeLyric(int numNotes) {
        if (lyricStack.size() > 1) {
            // if the lyrics have bars, they will be separated into multiple
            // ArrayLists
            ArrayList<String> lyricList = lyricStack.get(0);
            lyricStack.remove(0);

            // pad the measure with spaces to fill up to numNotes
            while (lyricList.size() < numNotes) {
                lyricList.add(" ");
            }
            // remove excess syllables to fit into numNotes
            while (lyricList.size() > numNotes) {
                lyricList.remove(lyricList.size() - 1);
            }

            return new Lyric(lyricList);

        } else if (lyricStack.size() == 1) {
            // if no bars, we get a single ArrayList with all the syllables
            ArrayList<String> lyricList = new ArrayList<String>();
            ArrayList<String> lyricListFromStack = lyricStack.get(0);

            // get the syllables we need and delete them from the stack
            for (int i = 0; i <= numNotes && !lyricListFromStack.isEmpty(); ++i) {
                lyricList.add(lyricListFromStack.get(0));
                lyricListFromStack.remove(0);
            }

            // pad the measure with spaces to fill up to numNotes
            while (lyricList.size() < numNotes) {
                lyricList.add(" ");
            }

            return new Lyric(lyricList);
        }
        // lyricStack may be empty if the piece doesn't have words
        return new Lyric(new ArrayList<String>());
    }

    /**
     * Pops notes in the tuplet out of the stack, multiplied their duration, and
     * adds the new notes back to the stack. Only Pitches and Chords allowed in
     * a tuplet.
     * 
     * Duration of each note is multiplied by 3/2 if duplet, 2/3 if triplet, 3/4
     * if quadruplet
     * 
     * @param tupletNumber
     *            2 for duplet, 3 for triplet, 4 for quadruplet
     */
    private void addTuplet(int tupletNumber) {
        // stack to store changed notes
        Stack<MusicSymbol> currentStack = new Stack<MusicSymbol>();

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
            // add to the stack the same note with its length multiplied by the
            // multiplicationFactor

            // Can be Pitch or Chord (not Rest)
            MusicSymbol musicSymbol = musicSymbolStack.pop();
            if (musicSymbol instanceof Pitch) {
                Pitch newMusicSymbol = ((Pitch) musicSymbol).multiplyLength(multiplicationFactor);
                currentStack.push(newMusicSymbol);

            } else if (musicSymbol instanceof Chord) {
                Chord newMusicSymbol = ((Chord) musicSymbol).multiplyLength(multiplicationFactor);
                currentStack.push(newMusicSymbol);
            }
        }
        // put new notes back in the stack
        for (int i = 0; i < tupletNumber; ++i) {
            musicSymbolStack.push(currentStack.pop());
        }
    }

    /**
     * Gives the final MusicPiece object made from the file inputted
     * 
     * @return MusicPiece
     */
    protected MusicPiece getMusic() {
        return (MusicPiece) finalStack.get(0);
    }

}