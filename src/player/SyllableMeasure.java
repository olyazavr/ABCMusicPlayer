package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents the syllables in a measure. It has a list of syllables.
 * 
 */
public class SyllableMeasure implements Lyric {
    private final List<Syllable> syllables;

    public SyllableMeasure(List<Syllable> syllables) {
        this.syllables = new ArrayList<Syllable>(syllables);
    }

}
