package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

public class Chord implements MusicSymbol {
	private final List<Pitch> notes;

	public Chord(List<Pitch> notes) {
		this.notes = new ArrayList<Pitch>(notes);
	}
	
	public void addNote(MusicPlayer player, int ticksPerBeat, String syllable) {		
		int ticks=notes.get(0).getLength().multiply(ticksPerBeat).getDenominator();
		
		for (Pitch pitch:notes){
			pitch.addNotes(player,ticksPerBeat, new String());
		}
		player.addTime(-ticks*(notes.size()-1));
		
		if (!syllable.isEmpty()){
			player.addLyric(syllable);
		}
	}
	
	public int calculateTicksPerBeat(){
    	int LCM=1;
    	for (Pitch pitch:notes){
    		LCM=num.lcm(LCM, pitch.calculateTicksPerBeat());
    	}
    	return LCM;
    }

}
