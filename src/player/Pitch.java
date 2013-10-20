package player;




/**
 * Basic ADT that represents a single pitch. It has a value (A, B, C...), an
 * octave, and a length (quarter note, eighth note...)
 * 
 * Accidentals modify the value.
 * 
 */
public class Pitch implements Note {
	private final char value;
    private final Fraction length;
    private final int octave;
    private final int accidental; 
    
    public Pitch(Fraction length, char value, int octave, int accidental) {
        this.length = length;
        this.value=value;
        this.octave=octave;
        this.accidental=accidental;         
    }   
        
    public boolean isRest(){
    	return false;
    }
    
    public int endTime(int startTime){
    	return length.add(startTime);
    }
    
    /**
     * Produces a sound.Pitch object which can be 
     * converted into a midiNote 
     * @return the current pitch converted to sound.Pitch object
     */
    public sound.Pitch makePitch(){
    	sound.Pitch note=new sound.Pitch(value);
    	note.transpose(accidental);
    	note.octaveTranspose(octave);
    	return note;
    }
}
