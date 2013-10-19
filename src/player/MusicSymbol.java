package player;

import java.util.List;

/**
 * Interface that represents the basic symbols of music. Everything will be
 * immutable.
 * 
 * 
 * MusicSymbol = Note(value: string, octave: int, weight: float) + Rest(weight:
 * int) + Tuplet(number: int, notes: ArrayList<Note>) + Chord(notes:
 * ArrayList<Note>)
 * 
 */
public interface MusicSymbol {
	
	/**
	 * Transform a Music Symbol into a list of simple notes: either pitch or rest
	 * @return
	 */
	public List<Note> getNotes();
	
}
