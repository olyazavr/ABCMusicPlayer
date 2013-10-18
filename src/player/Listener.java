package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.Stack;

public class Listener extends ABCMusicBaseListener {
    private Stack<MusicPiece> stack = new Stack<MusicPiece>();

    @Override
    public void exitNote_length_strict(ABCMusicParser.Note_length_strictContext ctx) {
    }

    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
    }

    @Override
    public void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx) {
    }

    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
    }

    @Override
    public void exitMulti_note(ABCMusicParser.Multi_noteContext ctx) {
    }

    @Override
    public void exitTempo(ABCMusicParser.TempoContext ctx) {
    }

    @Override
    public void exitNote_element(ABCMusicParser.Note_elementContext ctx) {
    }

    @Override
    public void exitNote_length(ABCMusicParser.Note_lengthContext ctx) {
    }

    @Override
    public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
    }

    @Override
    public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
    }

    @Override
    public void exitMeter(ABCMusicParser.MeterContext ctx) {
    }

    @Override
    public void exitMeter_fraction(ABCMusicParser.Meter_fractionContext ctx) {
    }

    @Override
    public void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx) {
    }

    @Override
    public void exitKey(ABCMusicParser.KeyContext ctx) {
    }

    @Override
    public void exitNote(ABCMusicParser.NoteContext ctx) {
    }

    @Override
    public void exitKeynote(ABCMusicParser.KeynoteContext ctx) {
    }

    @Override
    public void exitField_tempo(ABCMusicParser.Field_tempoContext ctx) {
    }

    @Override
    public void exitElement(ABCMusicParser.ElementContext ctx) {
    }

    @Override
    public void exitLyrical_element(ABCMusicParser.Lyrical_elementContext ctx) {
    }

    @Override
    public void exitMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx) {
    }

    @Override
    public void exitEnd_of_line(ABCMusicParser.End_of_lineContext ctx) {
    }

    @Override
    public void exitAbc_line(ABCMusicParser.Abc_lineContext ctx) {
    }

    @Override
    public void exitTuplet_spec(ABCMusicParser.Tuplet_specContext ctx) {
    }

    @Override
    public void exitField_composer(ABCMusicParser.Field_composerContext ctx) {
    }

    @Override
    public void exitOctave(ABCMusicParser.OctaveContext ctx) {
    }

    @Override
    public void exitNote_or_rest(ABCMusicParser.Note_or_restContext ctx) {
    }

    @Override
    public void exitBarline(ABCMusicParser.BarlineContext ctx) {
    }

    @Override
    public void exitLyric(ABCMusicParser.LyricContext ctx) {
    }

    @Override
    public void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx) {
    }

    @Override
    public void exitKey_accidental(ABCMusicParser.Key_accidentalContext ctx) {
    }

    @Override
    public void exitMode_minor(ABCMusicParser.Mode_minorContext ctx) {
    }

    @Override
    public void exitField_meter(ABCMusicParser.Field_meterContext ctx) {
    }

    @Override
    public void exitField_number(ABCMusicParser.Field_numberContext ctx) {
    }

    @Override
    public void exitRest(ABCMusicParser.RestContext ctx) {
    }

    @Override
    public void exitComment(ABCMusicParser.CommentContext ctx) {
    }

    @Override
    public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
    }

    @Override
    public void exitPitch(ABCMusicParser.PitchContext ctx) {
    }

    @Override
    public void exitNth_repeat(ABCMusicParser.Nth_repeatContext ctx) {
    }

    @Override
    public void exitField_voice(ABCMusicParser.Field_voiceContext ctx) {
    }

    /**
     * Gives the final MusicPiece object made from the file inputted
     * 
     * @return MusicPiece
     */
    protected MusicPiece getMusic() {
        return stack.get(0);
    }

}
