package player;

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
	 * Tells whether the note is a rest
	 * @return true is the note is a rest and false otherwise
	 */
   public boolean isRest();
   
   /**
    * Given the starting tick of the note, calculates the ending tick
    * @return the integer representing the ending tick of the note
    */
   public int endTime(int startTime);
}
