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
    private Stack<MusicPiece> stack = new Stack<MusicPiece>();
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
        String q ="";
        String k ="";
        List<String> v = new ArrayList<String>();
        
        // populate fields
        for (String s : lines){
            if (s.startsWith("T:")) {
                t = s.substring(2).trim();
            } else if (s.startsWith("C:")) {
                c = s.substring(2).trim();
            } else if (s.startsWith("M:")) {
                String meterString = s.substring(2).trim();
                String[] meterSplit = m.split("/");
                m = new Fraction(meterSplit[0], meterSplit[1]);
            } else if (s.startsWith("L:")) {
                String lengthString = s.substring(2).trim();
                String[] lengthSplit = m.split("/");
                m = new Fraction(lengthSplit[0], lengthSplit[1]);
            } else if (s.startsWith("Q:")) {
                q = s.substring(2).trim();
            } else if (s.startsWith("K:")) {
                k = s.substring(2).trim();
            } else if (s.startsWith("V:")) {
                v.add(s.substring(2).trim());
            }
        }
            
            // Default length is 1/16 if meter < 3/4 and 1/8 if meter>= 3/4
            if (l.isEmpty()){
                if (meter < .75f) {
                    l = new Fraction(1, 16);
                } else {
                    l = new Fraction(1, 8);
                }
            }

            // Default tempo is length notes = 100
            if (t.isEmpty()) {
                t = l.toString() + "=100";
            }
        stack.push(new Signature(t, c, l, m, q, k));
    }

    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
        // somehow store header info?
    }

    @Override
    public void exitChord(ABCMusicParser.ChordContext ctx) {
        // pop notes, modify them, add notes
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
