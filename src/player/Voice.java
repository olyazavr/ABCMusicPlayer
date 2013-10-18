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
public class Voice implements MusicPiece {
    private final String name;
    private final List<Measure> measures;

    public Voice(String name, List<Measure> measures) {
        this.name = name;
        this.measures = new ArrayList<Measure>(measures);
    }

}
