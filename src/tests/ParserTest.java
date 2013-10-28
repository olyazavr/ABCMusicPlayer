package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import player.Chord;
import player.Lyric;
import player.Measure;
import player.MusicPiece;
import player.MusicSymbol;
import player.Pitch;
import player.Play;
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

        MusicPiece output = Play.stringToMusicPiece(input);

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

        MusicPiece output = Play.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void lyricsMultMeasuresTest() {
        // Tests lyrics and multiple measures
        String input = "X:1 \r\n T:Alphabet Song \r\n C:Traditional Kid's Song \r\n M:4/4 \r\n L:1/4 \r\n Q:1/4=100 \r\n K:D \r\n "
                + "  A A G F | F F E2|A       A  G  G | F F E2| \r\n "
                + "w:Q R S *   T U V  W~(dou-ble u) | X Y Z \r\n ";

        // measure 1
        MusicSymbol pitch = new Pitch(new Fraction(1), 'A', 0, 0);
        List<MusicSymbol> notes1 = Arrays.asList(pitch, new Pitch(new Fraction(1), 'A', 0, 0), new Pitch(
                new Fraction(1), 'G', 0, 0), new Pitch(new Fraction(1), 'F', 0, 1));
        List<String> syllables1 = Arrays.asList("Q", "R", "S", "");
        Measure measure1 = new Measure(notes1, new Lyric(syllables1));

        // measure 2
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'F', 0, 1);
        List<MusicSymbol> notes2 = Arrays.asList(pitch2, new Pitch(new Fraction(1), 'F', 0, 1), new Pitch(
                new Fraction(2), 'E', 0, 0));
        List<String> syllables2 = Arrays.asList("T", "U", "V");
        Measure measure2 = new Measure(notes2, new Lyric(syllables2));

        // measure 3
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'A', 0, 0);
        List<MusicSymbol> notes3 = Arrays.asList(pitch3, new Pitch(new Fraction(1), 'A', 0, 0), new Pitch(
                new Fraction(1), 'G', 0, 0), new Pitch(new Fraction(1), 'G', 0, 0));
        List<String> syllables3 = Arrays.asList("W (dou-", "ble", "u)", "");
        Measure measure3 = new Measure(notes3, new Lyric(syllables3));

        // measure 4
        MusicSymbol pitch4 = new Pitch(new Fraction(1), 'F', 0, 1);
        List<MusicSymbol> notes4 = Arrays.asList(pitch4, new Pitch(new Fraction(1), 'F', 0, 1), new Pitch(
                new Fraction(2), 'E', 0, 0));
        List<String> syllables4 = Arrays.asList("X", "Y", "Z");
        Measure measure4 = new Measure(notes4, new Lyric(syllables4));

        List<Measure> measures = Arrays.asList(measure1, measure2, measure3, measure4);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Alphabet Song", "Traditional Kid's Song",
                new Fraction(1, 4), new Fraction(4, 4), new Fraction(100, 4), "D", voiceNames), voices);

        MusicPiece output = Play.stringToMusicPiece(input);

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
                'E', -1, 0), new Pitch(new Fraction(1), 'G', -1, 1), new Rest(new Fraction(1)),
                new Rest(new Fraction(2)));
        Measure measure1 = new Measure(notes1, new Lyric(new ArrayList<String>()));

        // measure 2
        List<MusicSymbol> notes2 = Arrays.asList(new Pitch(new Fraction(1), 'A', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'A', -1, 0), new Rest(new Fraction(1)));
        Measure measure2 = new Measure(notes2, new Lyric(new ArrayList<String>()));

        List<Measure> measures = Arrays.asList(measure1, measure1, measure2);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Bagatelle No.25 in A, WoO.59", "Ludwig van Beethoven",
                new Fraction(1, 16), new Fraction(
                        3, 8), new Fraction(140, 8), "Am", voiceNames), voices);

        MusicPiece output = Play.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void repeatedMeasuresLyricsTest() {
        // Test repeated measures that have lyrics
        String input = "X: 1 \r\n T:Bagatelle No.25 in A, WoO.59 \r\n C:Ludwig van Beethoven "
                + "\r\n M:3/8 \r\n L:1/16 \r\n Q:1/8=140 \r\n K:Am \r\n "
                + "\r\n  E,,E,^G, z z2 |] \r\n w: I play once. \r\n"
                + " A,,E,A, z :| \r\n  w:I re peat. \r\n";

        // measure 1, this is repeated
        List<MusicSymbol> notes1 = Arrays.asList(new Pitch(new Fraction(1), 'E', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'G', -1, 1), new Rest(new Fraction(1)),
                new Rest(new Fraction(2)));
        List<String> syllables1 = Arrays.asList("I", "play", "once.");
        Measure measure1 = new Measure(notes1, new Lyric(syllables1));

        // measure 2
        List<MusicSymbol> notes2 = Arrays.asList(new Pitch(new Fraction(1), 'A', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'A', -1, 0), new Rest(new Fraction(1)));
        List<String> syllables2 = Arrays.asList("I", "re", "peat.");
        Measure measure2 = new Measure(notes2, new Lyric(syllables2));

        List<Measure> measures = Arrays.asList(measure1, measure2, measure2);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Bagatelle No.25 in A, WoO.59", "Ludwig van Beethoven",
                new Fraction(1, 16), new Fraction(
                        3, 8), new Fraction(140, 8), "Am", voiceNames), voices);

        MusicPiece output = Play.stringToMusicPiece(input);

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
                'E', -1, 0), new Pitch(new Fraction(1), 'G', -1, 1), new Rest(new Fraction(1)),
                new Rest(new Fraction(2)));
        Measure measure1 = new Measure(notes1, new Lyric(new ArrayList<String>()));

        // measure 2
        List<MusicSymbol> notes2 = Arrays.asList(new Pitch(new Fraction(1), 'A', -2, 0), new Pitch(new Fraction(1),
                'E', -1, 0), new Pitch(new Fraction(1), 'A', -1, 0), new Rest(new Fraction(1)));
        Measure measure2 = new Measure(notes2, new Lyric(new ArrayList<String>()));

        List<Measure> measures = Arrays.asList(measure1);
        List<Measure> measures2 = Arrays.asList(measure2);
        List<Voice> voices = Arrays.asList(new Voice("2", measures2), new Voice("1", measures));
        List<String> voiceNames = Arrays.asList("1", "2");
        MusicPiece expected = new MusicPiece(new Signature("Bagatelle No.25 in A, WoO.59", "Ludwig van Beethoven",
                new Fraction(1, 16), new Fraction(
                        3, 8), new Fraction(140, 8), "Am", voiceNames), voices);

        MusicPiece output = Play.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

    @Test
    public void chordsTupletsTest() {
        // Test chords and tuplets (comments are also present, but ignored)
        // Tuplets are turned into Pitches with modified duration
        String input = "X:8628 \r\n T:Prelude BWV 846 no. 1 \r\n C:Johann Sebastian Bach "
                + "\r\n M:4/4 \r\n L:1/16 \r\n Q:1/4=70 \r\n K:C \r\n "
                + "% \r\n (2AB B dfdB dBGB DFED|[Z16G16c16]|] \r\n";

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
        // notes inside chords get added backwards (doesn't matter because they
        // all play at once)
        List<MusicSymbol> pitches = Arrays.asList(new Pitch(new Fraction(16), 'C', 1, 0), new Pitch(new Fraction(16),
                'G', 0, 0), new Rest(new Fraction(16)));
        MusicSymbol chord = new Chord(pitches);
        List<MusicSymbol> notes2 = Arrays.asList(chord);
        Measure measure2 = new Measure(notes2, new Lyric(new ArrayList<String>()));

        List<Measure> measures = Arrays.asList(measure1, measure2);
        List<Voice> voices = Arrays.asList(new Voice("defaultVoice", measures));
        List<String> voiceNames = Arrays.asList("defaultVoice");
        MusicPiece expected = new MusicPiece(new Signature("Prelude BWV 846 no. 1", "Johann Sebastian Bach",
                new Fraction(1, 16), new Fraction(
                        4, 4), new Fraction(70, 4), "C", voiceNames), voices);

        MusicPiece output = Play.stringToMusicPiece(input);

        assertEquals(expected, output);
    }

}
