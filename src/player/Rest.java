package player;
import sound.MusicPlayer;
/**
 * Basic ADT that represents a single rest. It has a length 
 * - the fraction of default note
 * 
 */
public class Rest implements MusicSymbol {
    private final Fraction length;

    public Rest(Fraction length) {
        this.length = length;
      
    }         
       
    public void addNotes(MusicPlayer player, int ticksPerBeat){
    	Fraction ticks=length.multiply(ticksPerBeat);
    	player.addTime(ticks.getDenominator());
    }

}
