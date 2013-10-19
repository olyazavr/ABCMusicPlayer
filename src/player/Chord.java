package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents a chord. It has a list of notes in the chord.
 * 
 */
public class Chord implements MusicSymbol {
    private final List<Note> notes;

    public Chord(List<Note> notes) {
        this.notes = new ArrayList<Note>(notes);
    }

}
