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
    /**
     * Contains Signature and MusicPiece
     */
    private Stack<Object> finalStack = new Stack<Object>();

    /**
     * Stacks to combine smaller objects into larger ones
     */
    private Stack<MusicSymbol> musicSymbolStack = new Stack<MusicSymbol>();
    private Stack<Lyric> lyricStack = new Stack<Lyric>();

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
    private Map<String, List<Measure>> voiceRepeatMeasures = new HashMap<String, List<Measure>>();
        
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
        // Obtain the musicSymbols and Lyric to add to the new Measure
        List<MusicSymbol> musicSymbols = new ArrayList<MusicSymbol>(musicSymbolStack);

        // Lyics may be empty if the piece doesn't have words
        Lyric lyrics;
        if (!lyricStack.empty()) {
            lyrics = lyricStack.pop();
        } else {
            lyrics = new Lyric(new ArrayList<String>());
        }
        musicSymbolStack.clear();

        Measure measure = new Measure(musicSymbols, lyrics);

        // Find the current Voice stack
        Stack<Measure> currentVoiceStack = voices.get(currentVoice);

        // don't repeat if there's a one-repeat
        if (ctx.ONE_REPEAT() == null) {
            voiceRepeatMeasures.get(currentVoice).add(measure);
        }


        // clear and restart repeatedMeasures
        if (ctx.END_NOTES() != null) {
        	voiceRepeatMeasures.get(currentVoice).clear();
        }

        System.out.println("adding Measure with " + musicSymbols.size() + " notes");
        currentVoiceStack.push(measure);
        
          
        // add all the recorded repeatedMeasures if there's a repeat
        if (ctx.RREPEAT() != null) {
            currentVoiceStack.addAll(voiceRepeatMeasures.get(currentVoice));
            System.out.println("adding " + voiceRepeatMeasures.get(currentVoice).size() + " repeated Measures");
            voiceRepeatMeasures.get(currentVoice).clear();
        }
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

        System.out.println("adding MusicPiece with " + voicesList.size() + " voices");
        finalStack.push(musicPiece);
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

            // add a new Voice stack if needed, containsKey() doesn't work here
            // for some reason
            boolean voiceExists = false;
            for (String name : voices.keySet()) {
                if (name.equals(voiceName)) {
                    // this voice already exists
                    voiceExists = true;
                    break;
                }
            }
            if (!voiceExists) { // add new Voice stack
                Stack<Measure> stack = new Stack<Measure>();
                System.out.println("adding Voice stack " + voiceName);
                voices.put(voiceName, stack);
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
        }

        Signature signature = new Signature(t, c, l, m, q, key, v);
        System.out.println("adding Signature with key " + key);
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

        // I need the number of notes, so I split around them, and the number of
        // notes will be 1 less than the number of chunks
        String[] chordsSplit = chordText.split("[A-Ga-g]");
        int numNotes = chordsSplit.length - 1;

        List<Pitch> notes = new ArrayList<Pitch>(numNotes);

        // pop notes and add them to a list
        for (int i = 0; i < numNotes; ++i) {
            notes.add((Pitch) musicSymbolStack.pop());
        }

        Chord chord = new Chord(notes);
        musicSymbolStack.push(chord);
    }

    /**
     * Pop notes, modify their length, add new notes back. This way, they will
     * be played as a Tuplet.
     */
    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
    	//stack to store changed notes
    	Stack<MusicSymbol> currentStack= new Stack<MusicSymbol>();
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
        //put changed notes back in the stack
        for (int i = 0; i < tupletNumber; ++i) {
        	musicSymbolStack.push(currentStack.pop());
        }
    }

    /**
     * Add Rest.
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
            System.out.println(lengthString);
            length = new Fraction(lengthString);
        }

        // if the note doesn't set its own accidental, try taking the
        // measure's accidental, and then the key's accidental
        if (accidental == 0) {
            if (accidentals.containsKey(noteOctave)) {
                accidental += accidentals.get(noteOctave);
            } else {
                accidental += Scales.adjustKey(noteOctave, key);
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
        System.out.println("skipping lyrics!");
        /*
         * System.out.println("entering lyric " + ctx.getText()); // Create a
         * stream of tokens using the lexer. CharStream stream = new
         * ANTLRInputStream(ctx.getText()); LyricsLexer lexer = new
         * LyricsLexer(stream); lexer.reportErrorsAsExceptions(); TokenStream
         * tokens = new CommonTokenStream(lexer); // List<? extends Token>
         * actualTokens = lexer.getAllTokens();
         * 
         * // Feed the tokens into the parser. LyricsParser parser = new
         * LyricsParser(tokens); parser.reportErrorsAsExceptions();
         * 
         * // Generate the parse tree using the starter rule. ParseTree tree;
         * tree = parser.lyric(); // "abc_tune" is the starter rule. //
         * ((RuleContext) tree).inspect(parser);
         * 
         * // Walk the tree with the listener. ParseTreeWalker walker = new
         * ParseTreeWalker(); LyricsListener listener = new LyricsListener();
         * walker.walk(listener, tree); Lyric lyric = listener.getLyric();
         * 
         * System.out.println("adding Lyric " + lyric); lyricStack.push(lyric);
         */
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