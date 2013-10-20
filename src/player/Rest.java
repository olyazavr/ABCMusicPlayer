package player;
import sound.MusicPlayer;
import utils.Fraction;

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
       
    public void addNote(MusicPlayer player, int ticksPerBeat, String syllable){
    	Fraction ticks=length.multiply(ticksPerBeat);
    	player.addTime(ticks.getDenominator());
    	if (!syllable.isEmpty()) {
			player.addLyric(syllable);
		}
    }
    
    public int calculateTicksPerBeat(){
    	return length.getNumerator();
    }

}
