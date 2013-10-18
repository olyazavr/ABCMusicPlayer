package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents a tuplet. It has the number of notes and a list of the
 * notes. Only duplets, triplets, and quadruplets are supported.
 * 
 */
public class Tuplet implements MusicSymbol {
    private final int number;
    private final List<Note> notes;

    public Tuplet(int number, List<Note> notes) {
        this.number = number;
        if (notes.size() == 0 || notes.size() > 4) {
            throw new IllegalArgumentException("Notes must have 1-4 elements.");
        }
        this.notes = new ArrayList<Note>(notes);
    }

}
