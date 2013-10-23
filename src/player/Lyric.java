package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents complete lyrics. It has a list of syllables.
 * 
 */
public class Lyric {
    private List<String> syllables;

    /**
     * Creates a Lyric object with syllables
     * 
     * @param syllables
     *            list of strings representative of syllables per measure
     */
    public Lyric(List<String> syllables) {
        this.syllables = new ArrayList<String>(syllables);
    }
    
    /**
     * Checks whether the lyrics are empty
     * @return true if is empty, false otherwise
     */
    
    public boolean isEmpty(){
    	return syllables.isEmpty();
    }

    /**
     * Simply returns the syllable at the index requested.
     * 
     * @param i
     *            index of syllable to return
     * @return the syllable String
     */
    public String getSyllable(int i) {
        return syllables.get(i);
    }

    public boolean equals(Object _that) {
        // two objects can only be equal if they are of the same type
        if (!(_that instanceof Lyric)) {
            return false;
        }
        // if they are, cast the Object into a Lyric object and check for
        // equality recursively
        Lyric that = (Lyric) _that;
        return this.syllables.equals(that.syllables);
    }

    public String toString() {
        return syllables.toString();
    }

    public int hashCode() {
        return this.syllables.hashCode();
    }

    /**
     * Returns how many syllables this Lyric contains
     * 
     * @return number of syllables
     */
    public int getNumberOfSyllables() {
        return syllables.size();
    }

}
