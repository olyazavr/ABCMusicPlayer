package player;

import sound.MusicPlayer;

/**
 * Interface that represents music.
 * It can be either a music piece, a voice, or a music symbol. 
 * The objects are immutable.
 * 
 **/

/* Representation
Music = MusicPiece(voices:List<Pitch>)+
		Voice(notes: List<MusicSymbol>, lyrics:List<Syllables>) +
        MusicSymbol(*described in its interface*) 
*/ 

public interface Music {	
	   
	   /**
	    * Calculates the required number of ticks per beat, so that
	    * each note can be represented as an integer number of ticks.
	    * @return integer representing number of ticks per beat.
	    */
	   public int calculateTicksPerBeat();
}
