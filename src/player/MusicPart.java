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

    /**
     * Tests the equality of one MusicPart to to another, such that two
     * expressions with equal attributes (observationally indistinguishable) are
     * considered equal
     * 
     * @param _that
     *            expression to compare to
     * @return whether or not the two MusicParts are equal
     */
    @Override
    public boolean equals(Object _that);

    /**
     * Returns the string representation of the MusicPart
     * 
     * @returns the MusicPart as a string
     */
    @Override
    public String toString();

    /**
     * Calculates the hashcode for this MusicPart. HashCode for two equal
     * MusicParts will be identical.
     * 
     * @return the hashcode for the MusicPart
     */
    @Override
    public int hashCode();
}
