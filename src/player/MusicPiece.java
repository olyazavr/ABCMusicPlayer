package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents the complete music piece. It has a Signature and and list
 * of Voices. The Voices then have the notes and lyrics.
 * 
 */
public class MusicPiece implements MusicPart {
	private final Signature signature;
	private final List<Voice> voices;

	/**
	 * TODO: description of constructor
	 */
	public MusicPiece(Signature signature, List<Voice> voices) {
		this.signature = signature;
		this.voices = new ArrayList<Voice>(voices);
	}

	/**
	 * Adds a note to the ongoing MusicPlayer object
	 * 
	 * @param player
	 *            the MusicPlayer object being built note by note
	 * 
	 */
	public void addNotes(MusicPlayer player) {
		for (Voice voice : voices) {
			voice.addNotes(player);
			player.resetTime();
		}

	}

	@Override
	public int calculateTicksPerBeat() {
		int LCM = 1;
		for (Voice voice : voices) {
			LCM = num.lcm(LCM, voice.calculateTicksPerBeat());
		}
		return LCM;
	}

	/**
	 * @param _that
	 *            the object which we check equality against this
	 */
	public boolean equals(Object _that) {
		// two objects can only be equal if they are of the same type
		if (!(_that instanceof MusicPiece)) {
			return false;
		}
		// if they are, cast the Object into a MusicPiece object and check for
		// equality recursively
		MusicPiece that = (MusicPiece) _that;
		return this.signature.equals(that.signature)
				&& this.voices.equals(that.voices);
	}

	/**
	 * Returns a string recursively, implementing terminal class toString
	 * methods.
	 */
	public String toString() {
		return this.toString();
	}

	public int hashCode() {
		return this.signature.hashCode() + this.voices.hashCode();
	}

}
