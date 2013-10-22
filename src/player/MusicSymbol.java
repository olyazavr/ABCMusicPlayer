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
     * @param ticksPerBeat
     *            is a valid integer
     */
    public void addNote(MusicPlayer player, String syllable);

    public boolean equals(Object _that);

    public String toString();

    public int hashCode();
}
