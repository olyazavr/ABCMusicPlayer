package player;

/**
 * Interface that represents a note, which can be either a pitch or a rest. 
 * 
 **/

/* Representation
 Note = Pitch(value: string, octave: int, length: int) +
        Rest(length: int) 
*/ 

/**
 * Basic ADT that represents a single note: either a Pitch or a Rest. 
 * It has a value (A, B, C...) for a Pitch, and z for a Rest.
 * octave, and a weight (quarter note, eighth note...)
 * 
 * Accidentals modify the value.
 * 
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
