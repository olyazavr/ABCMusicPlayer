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

    public Signature(String title, String composer, Fraction length, Fraction meter, String tempo,
            String key,
            List<String> voices) {
        this.title = title;
        this.composer = composer;
        this.length = length;
        this.meter = meter;
        this.tempo = tempo;
        this.key = key;
        this.voices = new ArrayList<String>(voices);
    }

}
