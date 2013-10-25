package player;

import sound.MusicPlayer;

/**
 * Interface that represents any music part. This could be a MusicPiece, a
 * Measure, or a Voice. a The objects are immutable. The equals, toString, and
 * hashCode methods work recursively and individually different from each class
 * extending Music. Read their documentation for full specs.
 * 
 **/

/*
 * Representation MusicPart = MusicPiece(signature: Signature, voices:
 * List<Voice>) + Measure(notes: List<MusicSymbol>, lyrics: Lyric) + Voice(name:
 * String, measures: List<Measure>)
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
     * Calculates the required number of ticks per beat, so that each note can
     * be represented as an integer number of ticks.
     * 
     * @return integer representing number of ticks per beat.
     */
    @Override
    public int calculateTicksPerBeat();

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
