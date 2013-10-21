package player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sound.MusicPlayer;
import utils.Scales;
import utils.num;

/**
 * ADT that represents a measure. It has a list of MusicSymbols, a Lyric, and a
 * Map of accidentals to find which notes in the measure have accidentals (since
 * they persist throughou the measure).
 * 
 * This class is primarily used to ensure the correct number of syllables in the
 * lyrics
 * 
 */
public class Measure implements MusicPart{
    private final List<MusicSymbol> notes;
    private Lyric lyrics;
    // this keeps track of which notes in the measure have sharps or flats
    private Map<String, Integer> accidentals;
    
    public Measure(List<MusicSymbol> notes, Lyric lyrics, Map<String, Integer> accidentals) {
        this.notes = new ArrayList<MusicSymbol>(notes);
        this.lyrics = lyrics;
        this.accidentals = new HashMap<String, Integer>(accidentals);
    }

    /**
     * Add an entry to accidentals
     * 
     * @param pitch
     *            the pitch that has the accidental
     * @param accidental
     *            1 for sharp, -2 for flat
     */
    public void addAccidental(String pitch, int accidental) {
        accidentals.put(pitch, accidental);
    }

    /**
     * Returns the accidental if the pitch has one. If no accidental is set in
     * the measure, return the accidental for the key.
     * 
     * @param pitch
     *            the pitch to check for
     * @param key
     *            the key the measure is in
     * @return 1 for sharp, -2 for flat, 0 for none
     */
    public int getAccidental(String pitch, String key) {
        if (accidentals.containsKey(pitch)) {
            return accidentals.get(pitch);
        }
        return Scales.adjustKey(pitch, key);
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

    /**
     * Checks whether or not Lyrics is empty (has no syllables)
     * 
     * @return if Lyrics is empty
     */
    public boolean hasLyrics() {
        return lyrics.isEmpty();
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
