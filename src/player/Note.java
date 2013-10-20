package player;
import sound.MusicPlayer;
/**
 * Interface that represents a note, which can be either a pitch or a rest. 
 * The objects are immutable.
 * 
 **/

/* Representation
 Note = Pitch(value: string, octave: int, length: int) +
        Rest(length: int) 
*/ 

public interface Note {
   /**
    * Creates a copy of the note with length multiplied by factor  
    * @param factor is a valid Fraction
    * @return note with the new length
    */
	public Note multiplyLength(Fraction factor);
	
	/**
    * Adds the note to the music player given the number of ticks per beat
    * @param player is a valid MusicPlayer
    * @param ticksPerBeat is a valid integer 
    */
   public void addNote(MusicPlayer player, int ticksPerBeat);
}
