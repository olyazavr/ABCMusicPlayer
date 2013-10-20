package player;
import sound.MusicPlayer;
/**
 * Basic ADT that represents a single rest. It has a length 
 * - the fraction of default note
 * 
 */
public class Rest implements Note {
    private final Fraction length;

    public Rest(Fraction length) {
        this.length = length;
      
    }     
    
    public Note multiplyLength(Fraction factor){
    	Fraction newLength=length.multiply(factor);
    	return new Rest(newLength);
    }
    
    public void addNote(MusicPlayer player, int ticksPerBeat){
    	new Fraction ticks=length.multiply(ticksPerBeat);
    	player.addTime(ticks.getDenominator());
    }

}
