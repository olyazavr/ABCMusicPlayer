package player;

/**
 * Basic ADT that represents a single rest. It has a weight (quarter note,
 * eighth note...)
 * 
 */
public class Rest implements MusicSymbol {
    private final float weight;

    public Rest(float weight) {
        this.weight = weight;
    }

}
