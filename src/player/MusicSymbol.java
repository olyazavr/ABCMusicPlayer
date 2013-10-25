package player;

import sound.MusicPlayer;

/**
 * Interface that represents a music symbol, which can be either a pitch, a rest
 * or a chord. The objects are immutable. The equals, toString, and hashCode
 * methods work recursively and individually different from each class extending
 * Music. Read their documentation for full specs.
 * 
 **/

/*
 * Representation MusicSymbol = Chord(notes: List<Pitch>) + Pitch(value: string,
 * octave: int, length: int) + Rest(length: int)
 */

public interface MusicSymbol extends Music {
    /**
     * Adds the note and the associated given lyric to the music player given
     * the number of ticks per beat
     * 
     * @param player
     *            is a valid MusicPlayer
     * 
     */
    public void addNote(MusicPlayer player, String syllable);

    /**
     * Calculates the required number of ticks per beat, so that each note can
     * be represented as an integer number of ticks.
     * 
     * @return integer representing number of ticks per beat.
     */
    public int calculateTicksPerBeat();

    /**
     * Tests the equality of one MusicSymbol to to another, such that two
     * expressions with equal attributes (observationally indistinguishable) are
     * considered equal
     * 
     * @param _that
     *            expression to compare to
     * @return whether or not the two MusicSymbols are equal
     */
    @Override
    public boolean equals(Object _that);

    /**
     * Returns the string representation of the MusicSymbol
     * 
     * @returns the MusicSymbol as a string
     */
    @Override
    public String toString();

    /**
     * Calculates the hashcode for this MusicSymbol. HashCode for two equal
     * MusicSymbols will be identical.
     * 
     * @return the hashcode for the MusicSymbol
     */
    @Override
    public int hashCode();
}
