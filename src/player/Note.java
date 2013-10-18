package player;

/**
 * Basic ADT that represents a single note. It has a value (A, B, C...), an
 * octave, and a weight (quarter note, eighth note...)
 * 
 * Accidentals modify the value.
 * 
 */
public class Note implements MusicSymbol {
    private final String value;
    private final String octave;
    private final float weight;

    public Note(String value, String octave, float weight) {
        this.value = value;
        this.octave = octave;
        this.weight = weight;
    }

}
