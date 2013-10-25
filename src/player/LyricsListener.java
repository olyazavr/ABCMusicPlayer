package player;

import java.util.ArrayList;
import java.util.Queue;

import lyrics.LyricsBaseListener;
import lyrics.LyricsParser;

/**
 * Walks the tree, creates a Lyric object
 * 
 * Lyric() return the final Lyric
 * 
 */
public class LyricsListener extends LyricsBaseListener {
	private Queue<Object> queue = new Queue<Object>();
	private int measureNum = 0;

//	@Override
//	public void enterEveryRule(ParserRuleContext ctx) {
//		System.out.println("Enter: " + ctx.getClass().getSimpleName() + ": "
//				+ ctx.getText() + "END");
//	}
//
//	@Override
//	public void exitEveryRule(ParserRuleContext ctx) {
//		System.out.println("Exit: " + ctx.getClass().getSimpleName() + ": "
//				+ ctx.getText() + "END");
//	}

	@Override
	public void enterLyric(LyricsParser.LyricContext ctx) {
	}

	@Override
	public void exitLyric(LyricsParser.LyricContext ctx) {
	}

	@Override
	public void enterMeasure(LyricsParser.MeasureContext ctx) {
		stack.add(new ArrayList<String>());
	}

	@Override
	public void exitMeasure(LyricsParser.MeasureContext ctx) {
	}

	
	@Override
	public void enterSyllable(LyricsParser.SyllableContext ctx) {
	}

	@Override
	public void exitSyllable(LyricsParser.SyllableContext ctx) {
		System.out.println(ctx.getText());
		stack.pop()
	}

	/**
	 * Gives the final MusicPiece object made from the file inputed
	 * 
	 * @return Lyric as measure lyric objects
	 */
	public Lyric getLyric() {
		return (Lyric) stack.get(0);
	}

}
