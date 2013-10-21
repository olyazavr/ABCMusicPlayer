package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents a voice. It has a name, and a list of Measures.
 * 
 * By default, there is one voice, but there can be multiple. This is used to
 * have several melodies play at once.
 * 
 */
public class Voice implements MusicPart{
    private final String name;
    private final List<Measure> measures;
    
    public Voice(String name, List<Measure> measures) {
        this.name = name;
        this.measures = new ArrayList<Measure>(measures);
    }
    
    public void addNotes(MusicPlayer player){
    	for (int i=0; i<notes.size();i++){
    		notes.get(i).addNote(player, lyrics.getSyllable(i));
    	}
    }
    
    public int calculateTicksPerBeat(){
    	int LCM=1;
    	for (MusicSymbol symbol:notes){
    		LCM=num.lcm(LCM, symbol.calculateTicksPerBeat());
    	}
    	return LCM;
    }

    public void addMusicSymbol(MusicSymbol musicSymbol) {
        notes.add(musicSymbol);
    }

    public MusicSymbol popMusicSymbol() {
        MusicSymbol last = notes.get(notes.size() - 1);
        notes.remove(notes.size() - 1);
        return last;
    }

    public void addLyric(String lyric) {
        lyrics.addSyllable(lyric);
    }
}
