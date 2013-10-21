package player;

import sound.MusicPlayer;
import utils.Fraction;

/**
 * Basic ADT that represents a single pitch.
 * 
 * It has a value -- A,B,C,D,E,F,G
 * 
 * octave -- the offset from the standard octave (e.g. +1 for "a,b,c.." octave);
 * 
 * length -- the fraction of default note
 * 
 * accidental -- 1 for sharp and -2 for flat.
 * 
 */
public class Pitch implements MusicSymbol {
	private final char value;
	private final Fraction length;
	private final int octave;
	private final int accidental;

	/**
	 * An object representative of a pitch.
	 * 
	 * @param length
	 *            the fraction of default note
	 * @param value
	 *            A,B,C,D,E,F,G
	 * @param octave
	 *            the offset from the standard octave (e.g. +1 for "a,b,c.."
	 *            octave)
	 * @param accidental
	 *            1 for sharp and -2 for flat.
	 */
	public Pitch(Fraction length, char value, int octave, int accidental) {
		this.length = length;
		this.value = value;
		this.octave = octave;
		this.accidental = accidental;
	}

	@Override
	public void addNote(MusicPlayer player, String syllable) {

		sound.Pitch pitch = new sound.Pitch(value);
		pitch = pitch.transpose(accidental).octaveTranspose(octave);

		player.addNote(pitch.toMidiNote(), length);
		player.addTime(length);

		if (!syllable.isEmpty()) {
			player.addLyric(syllable);
		}
	}

	/**
	 * Creates a copy of the note with length multiplied by factor
	 * 
	 * @param factor
	 *            is a valid Fraction
	 * @return note with the new length
	 */
	public Pitch multiplyLength(Fraction factor) {
		Fraction newLength = length.multiply(factor);
		return new Pitch(newLength, value, octave, accidental);
	}

	public Fraction getLength() {
		return length;
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
		if (!(_that instanceof Pitch)) {
			return false;
		}
		// if they are, cast the Object into a Pitch object and check for
		// equality recursively on length only, the rest are primitives so use
		// standard equality check
		Pitch that = (Pitch) _that;
		return (this.value == that.value && this.length.equals(that.length)
				&& this.octave == that.octave && this.accidental == that.accidental);
	}

	/**
	 * TODO: I don't think I'm implementing this correctly. This is just a
	 * skeleton. It should be fitted to whatever format we need later on, ie.
	 * this.accidental is a value but we may put a conditional which prints a #
	 * if it's a 1 or b if it's a -2
	 */
	public String toString() {
		StringBuilder readablePitch = new StringBuilder();
		readablePitch.append(this.accidental);
		readablePitch.append(this.value);
		readablePitch.append(this.length);
		return readablePitch.toString();
	}

	public int hashCode() {
		return this.value + this.length.hashCode() + this.octave
				+ this.accidental;
	}

}
