package player;
import sound.MusicPlayer;

/**
 * Basic ADT that represents a single pitch. It has 
 * *a value -- A,B,C,D,E,F,G
 * *an octave -- the offset from the standard octave 
 * 					(e.g. +1 for "a,b,c.." octave)
 * *length -- the fraction of default note
 * *accidental -- 1 for sharp and -2 for flat.
 * 
 */
public class Pitch implements MusicSymbol {
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
    
    public void addNotes(MusicPlayer player, int ticksPerBeat){
    	int ticks=length.multiply(ticksPerBeat).getDenominator();
    	sound.Pitch pitch=new sound.Pitch(value);
    	pitch=pitch.transpose(accidental).octaveTranspose(octave);
    	player.addNote(pitch.toMidiNote(), ticks);
    	player.addTime(ticks);    	
    }
    
    /**
     * Creates a copy of the note with length multiplied by factor  
     * @param factor is a valid Fraction
     * @return note with the new length
     */
    public Pitch multiplyLength(Fraction factor){
    	Fraction newLength=length.multiply(factor);
    	return new Pitch(newLength,value,octave,accidental);
    }
    
    public Fraction getLength(){
    	return length;
    }
    
}
