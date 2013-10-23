package player;

import java.util.ArrayList;
import java.util.List;

import sound.MusicPlayer;
import utils.Fraction;
import utils.num;

/**
 * ADT that represents a chord. It contains a list of Pitches, which are all
 * played at the same time. No rests or Tuplets are allowed.
 * 
 */
public class Chord implements MusicSymbol {
    private final List<Pitch> notes;

    /**
     * Creates a Chord object with notes
     * 
     * @param notes
     *            list of Pitches in the Chord (no Rests or tuplets or other
     *            Chords)
     */
    public Chord(List<Pitch> notes) {
        this.notes = new ArrayList<Pitch>(notes);
    }

    /**
     * TODO: description of method
     */
    public void addNote(MusicPlayer player, String syllable) {

        for (Pitch pitch : notes) {
            pitch.addNote(player, new String());
        }
        player.addTime(notes.get(0).getLength().multiply(1 - notes.size()));

        if (!syllable.isEmpty()) {
            player.addLyric(syllable);
        }
    }

    /**
     * TODO: description of method
     */
    public int calculateTicksPerBeat() {
        int LCM = 1;
        for (Pitch pitch : notes) {
            LCM = num.lcm(LCM, pitch.calculateTicksPerBeat());
        }
        return LCM;
    }

    /**
     * Creates a copy of the Chord with lengths of notes multiplied by factor
     * 
     * @param factor
     *            is a valid Fraction
     * @return Chord with the new length
     */
    public Chord multiplyLength(Fraction factor) {
        List<Pitch> newNotes = new ArrayList<Pitch>(notes.size());
        for (Pitch p : notes) {
            newNotes.add(p.multiplyLength(factor));
        }
        return new Chord(newNotes);
    }

    public boolean equals(Object _that) {
        // two objects can only be equal if they are of the same type
        if (!(_that instanceof Chord)) {
            return false;
        }
        // if they are, cast the Object into a Chord object and check for
        // equality recursively
        Chord that = (Chord) _that;
        return this.notes.equals(that.notes);
    }

    /**
     * Returns a string of chords in the format: "[" followed by notes with
     * spaces between them and ending with a "]"
     */
    public String toString() {
        StringBuilder readableChords = new StringBuilder();
        readableChords.append("[");
        for (Pitch note : this.notes) {
            readableChords.append(note);
            // if it's the last note, don't add a space
            if (!note.equals(this.notes.get(this.notes.size() - 1))) {
                readableChords.append("");
            }
        }
        readableChords.append("]");
        return readableChords.toString();
    }

    public int hashCode() {
        return this.notes.hashCode();
    }

}
