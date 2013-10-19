package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

import java.util.Stack;

public class Listener extends ABCMusicBaseListener {
    private Stack<MusicPiece> stack = new Stack<MusicPiece>();

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
    public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
    }

    @Override
    public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
    }


    @Override
    public void exitField_tempo(ABCMusicParser.Field_tempoContext ctx) {
    }

    @Override
    public void exitField_composer(ABCMusicParser.Field_composerContext ctx) {
    }

    @Override
    public void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx) {
    }

    @Override
    public void exitField_meter(ABCMusicParser.Field_meterContext ctx) {
    }

    @Override
    public void exitField_number(ABCMusicParser.Field_numberContext ctx) {
    }

    @Override
    public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
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
