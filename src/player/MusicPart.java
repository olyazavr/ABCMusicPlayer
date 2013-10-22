package player;

import sound.MusicPlayer;

/**
 * Interface that represents any music part. This could be a MusicPiece or a
 * Voice. a The objects are immutable. The equals, toString, and hashCode
 * methods work recursively and individually different from each class extending
 * Music. Read their documentation for full specs.
 * 
 **/

/*
 * Representation MusicPart = MusicPiece(signature:Signature,
 * voices:List<Voice>) + Voice(notes: List<MusicSymbol>, lyrics: Lyric)
 */
public interface MusicPart extends Music {
    /**
     * Adds the containing notes to the music player given the number of ticks
     * per beat
     * 
     * @param player
     *            is a valid MusicPlayer
     * @param ticksPerBeat
     *            is a valid integer
     */
    public void addNotes(MusicPlayer player);

    public boolean equals(Object _that);

    public String toString();

    public int hashCode();
}
