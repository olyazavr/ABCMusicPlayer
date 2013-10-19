package player;

import java.util.ArrayList;
import java.util.List;

/**
 * ADT that represents a measure. It has a list of symbols and a list of
 * syllables that are in that measure.
 * 
 */
public class Measure implements MusicPiece {
    private final List<MusicSymbol> symbols;
    private final List<SyllableMeasure> syllables;

    public Measure(List<MusicSymbol> symbols, List<SyllableMeasure> syllables) {
        this.symbols = new ArrayList<MusicSymbol>(symbols);
        this.syllables = new ArrayList<SyllableMeasure>(syllables);
    }

}
