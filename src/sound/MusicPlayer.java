package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import utils.Fraction;

public class MusicPlayer {
	private SequencePlayer player;
	private int currentTick;
	private final int ticksPerBeat;

	public MusicPlayer(int tempo, int ticksPerBeat) {
		LyricListener listener = new LyricListener() {
			public void processLyricEvent(String text) {
				System.out.println(text);
			}
		};		
		try {
			this.player = new SequencePlayer(tempo, ticksPerBeat, listener);
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		this.currentTick = 0;
		this.ticksPerBeat = ticksPerBeat;
	}

	public void addNote(int note, Fraction noteLength) {
		player.addNote(note, currentTick,
				currentTick
						+ noteLength.multiply(ticksPerBeat).getNumerator());
	}

	public void addTime(Fraction length) {
		currentTick += length.multiply(ticksPerBeat).getNumerator();
	}

	public void addLyric(String lyric) {
		player.addLyricEvent(lyric, currentTick);
	}

	public void resetTime() {
		currentTick = 0;
	}

	public void play() {
		try {
			player.play();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}

}
