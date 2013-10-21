package player;

import sound.MusicPlayer;
import utils.Fraction;

/**
 * Basic ADT that represents a single rest. It has a length - the fraction of
 * default note
 * 
 */
public class Rest implements MusicSymbol {
	private final Fraction length;

	public Rest(Fraction length) {
		this.length = length;

	}

	public void addNote(MusicPlayer player, String syllable) {
		player.addTime(length);
		if (!syllable.isEmpty()) {
			player.addLyric(syllable);
		}
	}

	public int calculateTicksPerBeat() {
		return length.getNumerator();
	}

	/**
	 * @param _that
	 *            the object which we check equality against this
	 */
	public boolean equals(Object _that) {
		// two objects can only be equal if they are of the same type
		if (!(_that instanceof Rest)) {
			return false;
		}
		// if they are, cast the Object into a Rest object and check for
		// equality recursively on Fraction length
		Rest that = (Rest) _that;
		return this.length.equals(that.length);
	}

	/**
	 * Returns a string for a rest which is a "z" followed by its length
	 */
	public String toString() {

		return "z" + this.length.toString();
	}

	public int hashCode() {
		return this.length.hashCode();
	}

}
