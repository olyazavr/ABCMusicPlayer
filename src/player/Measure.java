package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.num;

/**
 * ADT that represents a measure. It has a list of MusicSymbols, and a Lyric.
 * 
 * This class is primarily used to ensure the correct number of syllables in the
 * lyrics
 * 
 */
public class Measure implements MusicPart{
    private final List<MusicSymbol> notes;
    private Lyric lyrics;
    
    public Measure(List<MusicSymbol> notes, Lyric lyrics) {
        this.notes = new ArrayList<MusicSymbol>(notes);
        this.lyrics = lyrics;
    }
    
    public void addNotes(MusicPlayer player){
    	for (int i=0; i<notes.size();i++){
    		notes.get(i).addNote(player, lyrics.getSyllable(i));
    	}
    }
    
    /**
     * Returns the number of notes in this measure, excluding rests. Use this
     * for ensuring the right number of syllables.
     * 
     * @return number of notes
     */
    public int notesPerMeasure() {
        int counter = 0;
        for (MusicSymbol note : notes) {
            if (!(note instanceof Rest)) {
                counter++;
            }
        }
        return counter;
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
