package player;


/**
 * Basic ADT that represents a single syllable. It has a value (the string that
 * will be sung), and a weight (quarter note, eighth note..)
 * 
 */
public class Syllable implements Lyric {
    private final String value;
    private final float weight;

    public Syllable(String value, float weight) {
        this.value = value;
        this.weight = weight;
    }

}
