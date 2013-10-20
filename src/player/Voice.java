package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents a voice. It has a name and a list of measures
 * 
 * By default, there is one voice, but there can be multiple. This is used to
 * have several melodies play at once.
 * 
 */
public class Voice implements MusicPart{
    private final String name;
    private final List<MusicSymbol> notes;
    private List<Lyric> lyrics;
    
    public Voice(String name, List<MusicSymbol> notes, List<Lyric> lyrics) {
        this.name = name;
        this.notes = new ArrayList<MusicSymbol>(notes);
        this.lyrics = new ArrayList<Lyric>(lyrics);
    }
    
    public void addNotes(MusicPlayer player, int ticksPerBeat){
    	for (int i=0; i<notes.size();i++){
    		notes.get(i).addNote(player, ticksPerBeat, lyrics.get(i).getName());
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

    public MusicSymbol pop() {
        MusicSymbol last = notes.get(notes.size() - 1);
        notes.remove(notes.size() - 1);
        return last;
    }

    public void addLyric(Lyric lyric) {
        lyrics.add(lyric);
    }
}
