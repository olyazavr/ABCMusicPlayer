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
     * Simply returns the syllable at the index requested.
     * 
     * @param i
     *            index of syllable to return
     * @return the syllable String
     */
    public String getSyllable(int i) {
        return syllables.get(i);
    }

    /**
     * @param _that
     *            the object which we check equality against this
     */
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

    /**
     * Returns a string of the entire lyrics
     */
    public String toString() {
        return this.toString();
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
