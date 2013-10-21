package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents a voice. It has a name, a list of MusicSymbols, and a
 * Lyric.
 * 
 * By default, there is one voice, but there can be multiple. This is used to
 * have several melodies play at once.
 * 
 */
public class Measure implements MusicPart{
    private final String name;
    private final List<MusicSymbol> notes;
    private Lyric lyrics;
    
    public Measure(String name, List<MusicSymbol> notes, Lyric lyrics) {
        this.name = name;
        this.notes = new ArrayList<MusicSymbol>(notes);
        this.lyrics = lyrics;
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
