package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.Stack;

/**
 * Walks the tree, creates a MusicPiece object with Notes and Syllables
 * 
 * getMusic() return the final MusicPiece
 * 
 */
public class Listener extends ABCMusicBaseListener {
    private Stack<MusicPiece> stack = new Stack<MusicPiece>();

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
