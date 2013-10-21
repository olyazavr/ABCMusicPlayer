package lyricsParse;

import grammar.ABCMusicBaseListener;

import java.util.Stack;

import player.Lyric;

/**
 * Walks the tree, creates a Lyric object
 * 
 * Lyric() return the final Lyric
 * 
 */
public class LyricsListener extends ABCMusicBaseListener {
    private Stack<Object> stack = new Stack<Object>();

    /**
     * Gives the final MusicPiece object made from the file inputted
     * 
     * @return MusicPiece
     */
    public Lyric getLyric() {
        return (Lyric) stack.get(0);
    }

}
