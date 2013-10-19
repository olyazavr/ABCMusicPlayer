package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents a voice. It has a name and a list of measures
 * 
 * By default, there is one voice, but there can be multiple. This is used to
 * have several melodies play at once.
 * 
 */
public class Voice {
    private final String name;
    private final List<Note> notes;

    public Voice(String name, List<Note> notes) {
        this.name = name;
        this.notes = new ArrayList<Note>(notes);
    }

}
