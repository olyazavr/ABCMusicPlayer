package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.NumberTheory;

/**
 * ADT that represents a measure. It has a list of MusicSymbols and a Lyric.
 * 
 * This class is primarily used to ensure the correct number of syllables in the
 * lyrics
 * 
 */
public class Measure implements MusicPart {
	private final List<MusicSymbol> notes;
	private Lyric lyrics;

	/**
	 * Creates a Measure object with notes and lyrics
	 * 
	 * @param notes
	 *            a list of MusicSymbols in the measure
	 * @param lyrics
	 *            a Lyric object with syllables that are in this measure
	 */
	public Measure(List<MusicSymbol> notes, Lyric lyrics) {
		this.notes = new ArrayList<MusicSymbol>(notes);
		this.lyrics = lyrics;
	}

    @Override
	public void addNotes(MusicPlayer player) {
		String syllable = new String();
		for (int i = 0; i < notes.size(); i++) {
			if (!lyrics.isEmpty()) {
				syllable = lyrics.getSyllable(i);
			}
			notes.get(i).addNote(player, syllable);
		}
	}

	/**
	 * Returns the number of notes in this measure, excluding rests. Use this
	 * for ensuring the right number of syllables.
	 * 
	 * @return number of notes
	 */
	public int notesPerMeasure() {
		int counter = 0;
		for (MusicSymbol note : notes) {
			if (!(note instanceof Rest)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Checks whether or not Lyrics is full (contains enough syllables to fit
	 * each note)
	 * 
	 * @return if Lyrics is full
	 */
	public boolean hasEnoughLyrics() {
		return lyrics.getNumberOfSyllables() == notesPerMeasure();
	}

    @Override
	public int calculateTicksPerBeat() {
		int LCM = 1;
		for (MusicSymbol symbol : notes) {
			LCM = NumberTheory.lcm(LCM, symbol.calculateTicksPerBeat());
		}
		return LCM;
	}

    @Override
    public boolean equals(Object _that) {
        // two objects can only be equal if they are of the same type
        if (!(_that instanceof Measure)) {
            return false;
        }
        Measure that = (Measure) _that;
        return this.notes.equals(that.notes) && this.lyrics.equals(that.lyrics);
    }
    
    /**
     * Returns the notes, with spaces, followed by a pipe
     * 
     * @return the string representation of a Measure
     */
    @Override
    public String toString(){
    	String measureString=new String(" ");
    	for (MusicSymbol s:notes){
    		measureString+=s.toString();
    		measureString+=" ";
    	}
    	return measureString+"|";
    }

    @Override
    public int hashCode() {
        return notes.hashCode() + lyrics.hashCode();
    }

}
