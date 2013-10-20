package player;


/**
 * Basic ADT that represents a single pitch. It has 
 * *a value -- A,B,C,D,E,F,G
 * *an octave -- the offset from the standard octave 
 * 					(e.g. +1 for "a,b,c.." octave)
 * *length -- the fraction of default note
 * *accidental -- 1 for sharp and -2 for flat.
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
    	return startTime+length;
    }
    
    /**
     * Produces a sound.Pitch object which can be later
     * converted into a midiNote 
     * @return the current pitch converted to sound.Pitch object
     */
    public sound.Pitch makePitch(){
    	sound.Pitch note=new sound.Pitch(value);
    	note=note.transpose(accidental);
    	note=note.octaveTranspose(octave);
    	return note;
    }
}