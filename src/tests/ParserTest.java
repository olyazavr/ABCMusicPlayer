package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import player.Chord;
import player.Lyric;
import player.Main;
import player.Measure;
import player.MusicPiece;
import player.MusicSymbol;
import player.Pitch;
import player.Rest;
import player.Signature;
import player.Voice;
import utils.Fraction;

/**
 * Tests the Parser, ensures that it returns the right objects. Tests basic and
 * extended headers, single and multiple measures and voices, comments, and all
 * kinds of notes (chords, notes with repeats, tuplets, notes with different
 * octaves, notes with accidentals).
 * 
 * Testing strategy: Test first the simple cases, then increasingly more
 * complicated and more prone to parsing error cases. Make sure all objects
 * consist of the right objects/components and in the right order.
 * 
 */
public class ParserTest {

    @Test
    public void basicHeaderOneMeasureTest() {
        // Tests only the basic header necessities and one simple measure
        String input = "X: 1 \r\n T:Piece No.1 \r\n K:C \r\n C C C3/4 D/4 E \r\n";

        // because java wants music symbols in the music symbol list
        MusicSymbol pitch = new Pitch(new Fraction(1), 'C', 0, 0);
        List<MusicSymbol> notes = Arrays.asList(pitch, new Pitch(new Fraction(1), 'C',
                0, 0), new Pitch(new Fraction(3, 4), 'C', 0, 0), new Pitch(new Fraction(1, 4), 'D', 0, 0), new Pitch(
                new Fraction(1), 'E', 0, 0));

        List<Measure> measures = Arrays.asList(new Measure(notes, new Lyric(new ArrayList<String>())));
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Piece No.1", "Unknown", new Fraction(1, 8), new Fraction(
                4, 4), new Fraction(100, 8), "C", voiceNames), voices);

        MusicPiece output = Main.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void extendedHeaderOneMeasureTest() {
        // tests the full possible header
        String input = "X: 1 \r\n T:Piece No.1 \r\n C: Me \r\n M:4/4 \r\n L:1/4 \r\n Q:1/4=140 \r\n K:C \r\n C C C3/4 D/4 E \r\n";

        // because java wants music symbols in the music symbol list
        MusicSymbol pitch = new Pitch(new Fraction(1), 'C', 0, 0);
        List<MusicSymbol> notes = Arrays.asList(pitch, new Pitch(new Fraction(1), 'C',
                0, 0), new Pitch(new Fraction(3, 4), 'C', 0, 0), new Pitch(new Fraction(1, 4), 'D', 0, 0), new Pitch(
                new Fraction(1), 'E', 0, 0));

        List<Measure> measures = Arrays.asList(new Measure(notes, new Lyric(new ArrayList<String>())));
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Piece No.1", "Me", new Fraction(1, 4), new Fraction(
                4, 4), new Fraction(140, 4), "C", voiceNames), voices);

        MusicPiece output = Main.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void lyricsMultMeasuresTest() {
        // Tests lyrics and multiple measures
        String input = "X: 3 \r\n T:Piece No.3 \r\n M:3/4 \r\n L:1/8 \r\n Q:1/8=100 \r\n K: C \r\n "
                + "z4 D2 | G4 BG |] \r\n w: A | ma-zing | \r\n ";

        // measure 1
        List<MusicSymbol> notes1 = Arrays.asList(new Rest(new Fraction(4)), new Pitch(new Fraction(2), 'D', 0, 0));
        List<String> syllables1 = Arrays.asList("A");
        Measure measure1 = new Measure(notes1, new Lyric(syllables1));

        // measure 2
        MusicSymbol pitch = new Pitch(new Fraction(4), 'G', 0, 0);
        List<MusicSymbol> notes2 = Arrays.asList(pitch, new Pitch(new Fraction(1), 'B', 0, 0), new Pitch(
                new Fraction(1), 'G', 0, 0));
        List<String> syllables2 = Arrays.asList("ma-", "zing");
        Measure measure2 = new Measure(notes2, new Lyric(syllables2));

        List<Measure> measures = Arrays.asList(measure1, measure2);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Piece No.3", "Unknown", new Fraction(1, 8), new Fraction(
                3, 4), new Fraction(100, 8), "C", voiceNames), voices);

        MusicPiece output = Main.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void octavesAccidentalsRepeatsTest() {
        // Test modifiers of notes and repeats (repeated measures should be
        // added twice)
        String input = "X: 1 \r\n T:Bagatelle No.25 in A, WoO.59 \r\n C:Ludwig van Beethoven "
                + "\r\n M:3/8 \r\n L:1/16 \r\n Q:1/8=140 \r\n K:Am \r\n "
                + "\r\n E,,E,^G, z z2|[1A,,E,A, z :| \r\n ";

        // measure 1, this is repeated
        List<MusicSymbol> notes1 = Arrays.asList(new Pitch(new Fraction(1), 'E', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'G', 0, 1), new Rest(new Fraction(1)),
                new Rest(new Fraction(2)));
        Measure measure1 = new Measure(notes1, new Lyric(new ArrayList<String>()));

        // measure 2
        List<MusicSymbol> notes2 = Arrays.asList(new Pitch(new Fraction(1), 'A', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'A', -1, 0), new Rest(new Fraction(1)));
        Measure measure2 = new Measure(notes2, new Lyric(new ArrayList<String>()));

        List<Measure> measures = Arrays.asList(measure1, measure2, measure1);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Bagatelle No.25 in A, WoO.59", "Ludwig van Beethoven",
                new Fraction(1, 16), new Fraction(
                        3, 8), new Fraction(140, 8), "Am", voiceNames), voices);

        MusicPiece output = Main.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void multVoicesTest() {
        // Test multiple voices
        String input = "X: 1 \r\n T:Bagatelle No.25 in A, WoO.59 \r\n C:Ludwig van Beethoven "
                + "\r\n V:1 \r\n V:2 \r\n M:3/8 \r\n L:1/16 \r\n Q:1/8=140 \r\n K:Am \r\n "
                + "V:1 \r\n E,,E,^G, z z2| \r\n V:2 \r\n A,,E,A, z | \r\n ";

        // measure 1, this is repeated
        List<MusicSymbol> notes1 = Arrays.asList(new Pitch(new Fraction(1), 'E', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'G', 0, 1), new Rest(new Fraction(1)),
                new Rest(new Fraction(2)));
        Measure measure1 = new Measure(notes1, new Lyric(new ArrayList<String>()));

        // measure 2
        List<MusicSymbol> notes2 = Arrays.asList(new Pitch(new Fraction(1), 'A', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'A', -1, 0), new Rest(new Fraction(1)));
        Measure measure2 = new Measure(notes2, new Lyric(new ArrayList<String>()));

        List<Measure> measures = Arrays.asList(measure1);
        List<Measure> measures2 = Arrays.asList(measure2);
        List<Voice> voices = Arrays.asList(new Voice("1", measures), new Voice("2", measures2));
        List<String> voiceNames = Arrays.asList("1", "2");
        MusicPiece expected = new MusicPiece(new Signature("Bagatelle No.25 in A, WoO.59", "Ludwig van Beethoven",
                new Fraction(1, 16), new Fraction(
                        3, 8), new Fraction(140, 8), "Am", voiceNames), voices);

        MusicPiece output = Main.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void chordsTupletsTest() {
        // Test chords and tuplets (comments are also present, but ignored)
        // Tuplets are turned into Pitches wih modified duration
        String input = "X:8628 \r\n T:Prelude BWV 846 no. 1 \r\n C:Johann Sebastian Bach "
                + "\r\n M:4/4 \r\n L:1/16 \r\n Q:1/4=70 \r\n K:C \r\n "
                + "% \r\n (2AB B dfdB dBGB DFED|[E16G16c16]|] \r\n";

        // measure 1
        MusicSymbol pitch = new Pitch(new Fraction(3, 2), 'A', 0, 0);
        List<MusicSymbol> notes1 = Arrays.asList(pitch, new Pitch(new Fraction(3, 2), 'B', 0, 0), new Pitch(
                new Fraction(1), 'B', 0, 0), new Pitch(new Fraction(1), 'D', 1, 0), new Pitch(new Fraction(1), 'F', 1,
                0), new Pitch(new Fraction(1), 'D', 1, 0), new Pitch(new Fraction(1), 'B', 0, 0), new Pitch(
                new Fraction(1), 'D', 1, 0), new Pitch(new Fraction(1), 'B', 0, 0), new Pitch(new Fraction(1), 'G', 0,
                0), new Pitch(new Fraction(1), 'B', 0, 0), new Pitch(new Fraction(1), 'D', 0, 0), new Pitch(
                new Fraction(1), 'F', 0, 0), new Pitch(new Fraction(1), 'E', 0, 0), new Pitch(new Fraction(1), 'D', 0,
                0));
        Measure measure1 = new Measure(notes1, new Lyric(new ArrayList<String>()));

        // measure 2
        List<Pitch> pitches = Arrays.asList(new Pitch(new Fraction(16), 'C', 1, 0), new Pitch(new Fraction(16), 'G', 0,
                0), new Pitch(new Fraction(16), 'E', 0, 0));
        MusicSymbol chord = new Chord(pitches);
        List<MusicSymbol> notes2 = Arrays.asList(chord);
        Measure measure2 = new Measure(notes2, new Lyric(new ArrayList<String>()));

        List<Measure> measures = Arrays.asList(measure1, measure2);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Prelude BWV 846 no. 1", "Johann Sebastian Bach",
                new Fraction(1, 16), new Fraction(
                        4, 4), new Fraction(70, 4), "C", voiceNames), voices);

        MusicPiece output = Main.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

}
