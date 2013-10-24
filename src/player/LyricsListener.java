package player;

import java.util.Stack;

import lyrics.LyricsBaseListener;
import lyrics.LyricsParser;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Walks the tree, creates a Lyric object
 * 
 * Lyric() return the final Lyric
 * 
 */
public class LyricsListener extends LyricsBaseListener {
	private Stack<Object> stack = new Stack<Object>();

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
	}

	@Override
	public void exitMeasure(LyricsParser.MeasureContext ctx) {
	}

	@Override
	public void enterCluster(LyricsParser.ClusterContext ctx) {
	}

	@Override
	public void exitCluster(LyricsParser.ClusterContext ctx) {
	}

	@Override
	public void enterSyllable_cluster(LyricsParser.Syllable_clusterContext ctx) {
	}

	@Override
	public void exitSyllable_cluster(LyricsParser.Syllable_clusterContext ctx) {
	}

	@Override
	public void enterSyllable(LyricsParser.SyllableContext ctx) {
	}

	@Override
	public void exitSyllable(LyricsParser.SyllableContext ctx) {

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
