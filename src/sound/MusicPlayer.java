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
	
	public void addNote(int note, int numTicks){
		player.addNote(note, currentTick, currentTick+numTicks);
	}
	
	public void addTime(int time){
		currentTick+=time;
	}
	
	public void addLyric(String lyric){
		player.addLyricEvent(lyric, currentTick);
	}
	
	public void resetTime(){
		currentTick=0;
	}
	
	public void play() throws MidiUnavailableException{
		player.play();
	}
	
	
}
