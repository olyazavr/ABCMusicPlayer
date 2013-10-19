package player;

/**
 * ADT that represents a signature. It has a title, composer, length, meter,
 * tempo, and key.
 * 
 * Default composer is "Unknown". Default meter is 4/4. Default length is 1/16
 * if meter < 3/4 and 1/8 if meter>= 3/4. Default tempo is length notes = 100.
 * 
 */
public class Signature {
    private final String title;
    private final String composer;
    private final float length;
    private final String meter;
    private final String tempo;
    private final String key;

    public Signature(String title, String composer, float length, String meter, String tempo, String key) {
        this.title = title;
        this.composer = composer;
        this.length = length;
        this.meter = meter;
        this.tempo = tempo;
        this.key = key;
    }

}
