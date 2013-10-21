package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents a chord. It contains a list of Pitches, which are all
 * played at the same time. No rests or Tuplets are allowed.
 * 
 */
public class Chord implements MusicSymbol {
	private final List<Pitch> notes;

	public Chord(List<Pitch> notes) {
		this.notes = new ArrayList<Pitch>(notes);
	}

	/**
	 * TODO: description of method
	 */
	public void addNote(MusicPlayer player, String syllable) {

		for (Pitch pitch : notes) {
			pitch.addNote(player, new String());
		}
		player.addTime(notes.get(0).getLength().multiply(1 - notes.size()));

		if (!syllable.isEmpty()) {
			player.addLyric(syllable);
		}
	}

	/**
	 * TODO: description of method
	 */
	public int calculateTicksPerBeat() {
		int LCM = 1;
		for (Pitch pitch : notes) {
			LCM = num.lcm(LCM, pitch.calculateTicksPerBeat());
		}
		return LCM;
	}

}
