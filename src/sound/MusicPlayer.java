package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import utils.Fraction;

public class MusicPlayer {
	private SequencePlayer player;
	private int currentTick;
	private final int ticksPerBeat;

	public MusicPlayer(int tempo, int ticksPerBeat)
			throws MidiUnavailableException, InvalidMidiDataException {
		LyricListener listener = new LyricListener() {
			public void processLyricEvent(String text) {
				System.out.println(text);
			}
		};
		this.player = new SequencePlayer(tempo, ticksPerBeat, listener);
		this.currentTick = 0;
		this.ticksPerBeat = ticksPerBeat;
	}

	public void addNote(int note, Fraction noteLength) {
		player.addNote(note, currentTick,
				currentTick
						+ noteLength.multiply(ticksPerBeat).getDenominator());
	}

	public void addTime(Fraction length) {
		currentTick += length.multiply(ticksPerBeat).getDenominator();
	}

	public void addLyric(String lyric) {
		player.addLyricEvent(lyric, currentTick);
	}

	public void resetTime() {
		currentTick = 0;
	}

	public void play() throws MidiUnavailableException {
		player.play();
	}

}
