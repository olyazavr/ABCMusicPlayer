package player;

import java.util.ArrayList;
import java.util.List;

import utils.Fraction;

/**
 * ADT that represents a signature. It has a title, composer, length, meter,
 * tempo, key, and voices.
 * 
 * Default composer is "Unknown". Default meter is 4/4. Default length is 1/16
 * if meter < 3/4 and 1/8 if meter>= 3/4. Default tempo is length notes = 100.
 * If no voice is provided, a default voice is added.
 * 
 */
public class Signature {
    private final String title;
    private final String composer;
    private final Fraction length;
    private final Fraction meter;
    private final String tempo;
    private final String key;
    private final List<String> voices;

    /**
     * Creates a Signature object with music information
     * 
     * @param title
     *            title of the MusicPiece (mandatory)
     * @param composer
     *            composer of MusicPiece
     * @param length
     *            default length of a note
     * @param meter
     *            sum of lengths of all notes in a measure
     * @param tempo
     *            number of given length notes to play in a minute (format
     *            "length=tempo")
     * @param key
     *            key signature
     * @param voices
     *            list of voices in the MusicPiece
     */
    public Signature(String title, String composer, Fraction length,
            Fraction meter, String tempo, String key, List<String> voices) {
        this.title = title;
        this.composer = composer;
        this.length = length;
        this.meter = meter;
        this.tempo = tempo;
        this.key = key;
        this.voices = new ArrayList<String>(voices);
    }

    /**
     * @param _that
     *            the object which we check equality against this
     */
    public boolean equals(Object _that) {
        // two objects can only be equal if they are of the same type
        if (!(_that instanceof Signature)) {
            return false;
        }
        // if they are, cast the Object into a Signature object and check for
        // equality recursively on all attributes
        Signature that = (Signature) _that;
        return (this.title.equals(that.title)
                && this.composer.equals(that.composer)
                && this.length.equals(that.length)
                && this.meter.equals(that.meter)
                && this.tempo.equals(that.tempo) && this.key.equals(that.key) && this.voices
                    .equals(that.voices));
    }

    /**
     * Header string output written in the order listed in the ABC Subset for
     * 6.005
     */
    public String toString() {
        return "T: " + this.title.toString() + "\n" + "C: "
                + this.composer.toString() + "\n" + "M: "
                + this.meter.toString() + "\n" + "L: " + this.length.toString()
                + "\n" + "Q: " + this.tempo.toString() + "\n" + "V: "
                + this.voices.toString() + "\n" + "K: " + this.key.toString()
                + "\n";
    }

    public int hashCode() {
        return this.title.hashCode() + this.composer.hashCode()
                + this.length.hashCode() + this.meter.hashCode()
                + this.tempo.hashCode() + this.key.hashCode()
                + this.voices.hashCode();
    }

}
