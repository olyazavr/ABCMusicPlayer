package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents complete lyrics. It has a list of syllables.
 * 
 */
public class Lyric {
	private List<String> syllables;

	public Lyric(List<String> syllables) {
		this.syllables = new ArrayList<String>(syllables);
	}

	/**
	 * Adds a syllable to the ongoing Lyric object
	 * 
	 * @param syllable
	 *            a string representing the entire piece of text being connected
	 *            to its corresponding note
	 */
	public void addSyllable(String syllable) {
		syllables.add(syllable);
	}

	/**
	 * Simply returns the syllable at the index requested.
	 * 
	 * @param i
	 *            index of syllable to return
	 * @return the syllable String
	 */
	public String getSyllable(int i) {
		return syllables.get(i);
	}

	/**
	 * Returns whether or not there are any syllables
	 * 
	 * @return if the syllables are empty
	 */
	public boolean isEmpty() {
		return syllables.isEmpty();
	}

	/**
	 * @param _that
	 *            the object which we check equality against this
	 */
	public boolean equals(Object _that) {
		// two objects can only be equal if they are of the same type
		if (!(_that instanceof Lyric)) {
			return false;
		}
		// if they are, cast the Object into a Lyric object and check for
		// equality recursively
		Lyric that = (Lyric) _that;
		return this.syllables.equals(that.syllables);
	}

	/**
	 * Returns a string of the entire lyrics
	 */
	public String toString() {
		return this.toString();
	}

	public int hashCode() {
		return this.syllables.hashCode();
	}
    /**
     * Returns how many syllables this Lyric contains
     * 
     * @return number of syllables
     */
    public int getNumberOfSyllables() {
        return syllables.size();
    }

}
