package player;
import sound.MusicPlayer;
/**
 * Interface that represents a music symbol, 
 * which can be either a pitch, a rest or a cord. 
 * The objects are immutable.
 * 
 **/

/* Representation
 MusicSymbol = Chord(notes:List<Pitch>)+
 		Pitch(value: string, octave: int, length: int) +
        Rest(length: int) 
*/ 

public interface MusicSymbol extends Music {   
	
		
}
