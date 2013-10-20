package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Walks the tree, creates a MusicPiece object with Notes and Syllables
 * 
 * getMusic() return the final MusicPiece
 * 
 */
public class Listener extends ABCMusicBaseListener {
    private Stack<Object> stack = new Stack<Object>();
    private String key;

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

        String[] lines = ctx.getText().split("/n");
        String t = "";
        String c = "Unknown";
        Fraction m;
        Fraction l;
        String q = "";
        String k = "";
        List<String> v = new ArrayList<String>();

        // populate fields
        for (String s : lines) {
            if (s.startsWith("T:")) {
                t = s.substring(2).trim();
            } else if (s.startsWith("C:")) {
                c = s.substring(2).trim();
            } else if (s.startsWith("M:")) {
                // make a Fraction object by splitting around the /
                String meterString = s.substring(2).trim();
                String[] meterSplit = meterString.split("/");
                m = new Fraction(new Integer(meterSplit[0]), new Integer(meterSplit[1]));
            } else if (s.startsWith("L:")) {
                // make a Fraction object by splitting around the /
                String lengthString = s.substring(2).trim();
                String[] lengthSplit = lengthString.split("/");
                m = new Fraction(new Integer(lengthSplit[0]), new Integer(lengthSplit[1]));
            } else if (s.startsWith("Q:")) {
                q = s.substring(2).trim();
            } else if (s.startsWith("K:")) {
                k = s.substring(2).trim();
            } else if (s.startsWith("V:")) {
                v.add(s.substring(2).trim());
            }
        }

        // Default length is 1/16 if meter < 3/4 and 1/8 if meter>= 3/4
        if (l == null) {
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

        stack.push(new Signature(t, c, l, m, q, k, v));
    }

    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
        // somehow store header info?
    }

    @Override
    public void exitChord(ABCMusicParser.ChordContext ctx) {
        // pop notes, add them to a list to be played at once

        // [ notes ]
        String chord = ctx.getText();

        // I need the number of notes, so I split around them, and the number of
        // notes will be 1 less than the number of chunks
        String[] chordsSplit = chord.split("[A-Ga-g]");
        int numNotes = chordsSplit.length - 1;

        List<Note> notes = new ArrayList<Note>(numNotes);

        // pop notes and add them to a list
        for (int i = 0; i <= numNotes; ++i) {
            notes.add(stack.pop());
        }

        stack.push(notes);
    }

    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
        // pop notes, modify them, add notes
    }

    @Override
    public void exitRest(ABCMusicParser.RestContext ctx) {
        // add rest
    }

    @Override
    public void exitNote(ABCMusicParser.NoteContext ctx) {
        // add note
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
        return stack.get(0);
    }

}
