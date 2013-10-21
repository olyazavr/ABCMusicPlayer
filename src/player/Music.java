package player;



/**
 * Interface that represents any music item. MusicSymbol and MusicPart extend
 * this. Thus, a Music could be a MusicPiece, a Voice, a Chord, a Lyric, a
 * Pitch, or a Rest. a The objects are immutable.
 * 
 **/

/*
 * Representation Music = MusicPiece(signature:Signature, voices:List<Voice>) +
 * Voice(notes: List<MusicSymbol>, lyrics: Lyric) + Chord(notes: List<Pitch>)+ +
 * Lyric(syllables: List<String>) + Pitch(value: string, octave: int, length:
 * int) + Rest(length: int)
 */ 

public interface Music {	
	   
	   /**
	    * Calculates the required number of ticks per beat, so that
	    * each note can be represented as an integer number of ticks.
	    * @return integer representing number of ticks per beat.
	    */
	   public int calculateTicksPerBeat();
}
