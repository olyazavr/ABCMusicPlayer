package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents a line of syllables. It has a list of syllables.
 * 
 */
public class Lyric {
    private final List<String> syllables;

    public Lyric(List<String> syllables) {
        this.syllables = new ArrayList<String>(syllables);
    }
    
    // not really sure what this was supposed to be
    // public String getName(){
    // return value;
    // }

}
