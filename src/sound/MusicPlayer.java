package sound;


import javax.sound.midi.InvalidMidiDataException;

import javax.sound.midi.MidiUnavailableException;


public class MusicPlayer {
	private SequencePlayer player;
	private int currentTick;
	
	public MusicPlayer(int tempo, int ticksPerBeat) throws MidiUnavailableException, InvalidMidiDataException{
		 LyricListener listener = new LyricListener() {
             public void processLyricEvent(String text) {
                 System.out.println(text);
             }
         };
         player=new SequencePlayer(tempo,ticksPerBeat,listener);
         currentTick=0;
	}
	
	public void addNote(int note, int startTick, int numTicks){
		player.addNote(note, startTick, numTicks);
	}
	
	public void addTime(int time){
		currentTick+=time;
	}
	
	public void addLyric(String lyric, int startTick){
		player.addLyricEvent(lyric, startTick);
	}
	
	public void play() throws MidiUnavailableException{
		player.play();
	}
	
	
}
