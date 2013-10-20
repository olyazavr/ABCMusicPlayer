package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;

public class Chord implements MusicSymbol {
	private final List<Pitch> notes;

	public Chord(List<Pitch> notes) {
		this.notes = new ArrayList<Pitch>(notes);
	}
	
	public void addNotes(MusicPlayer player, int ticksPerBeat) {
		int ticks=notes.get(0).getLength().multiply(ticksPerBeat).getDenominator();
		for (Pitch pitch:notes){
			pitch.addNotes(player,ticksPerBeat);
		}
		player.addTime(-ticks*(notes.size()-1));		
	}

}
