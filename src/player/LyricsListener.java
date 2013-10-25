package player;

import java.util.ArrayList;
import java.util.Stack;

import lyrics.LyricsBaseListener;
import lyrics.LyricsParser;

/**
 * Walks the tree, creates a Lyric object
 * 
 * Lyric() return the final Lyric
 * 
 */
public class LyricsListener extends LyricsBaseListener {
	private Stack<Object> stack = new Stack<Object>();

	// @Override
	// public void enterEveryRule(ParserRuleContext ctx) {
	// System.out.println("Enter: " + ctx.getClass().getSimpleName() + ": "
	// + ctx.getText() + "END");
	// }
	//
	// @Override
	// public void exitEveryRule(ParserRuleContext ctx) {
	// System.out.println("Exit: " + ctx.getClass().getSimpleName() + ": "
	// + ctx.getText() + "END");
	// }

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

		// get the working measure list
		@SuppressWarnings("unchecked")
		ArrayList<String> workingList = ((ArrayList<String>) stack
				.lastElement());
		// one case of a syllable may contain a space, find it
		String[] preSyllable = ctx.getText().split(" ");

		// this is the case with one space
		if (preSyllable.length == 2) {
			// we add the word that is before the space, and a blank string
			// after the space
			workingList.add(preSyllable[0]);
			workingList.add("");
		}

		else {
			String syllable = preSyllable[0];
			String syllableToPush;

			if (workingList.size() > 0) {
				// bring up the last syllable in the working measure
				String lastElem = workingList.get(workingList.size() - 1);
				if (lastElem.contains(" ") || lastElem.contains("\\-")) {
					// remove the space or dash
					String lastElemNoSpace = lastElem.substring(0,
							lastElem.length() - 2);
					// remove the last syllable and add a new one composed of
					// two words with a space or dash in between (these are to
					// be played under the same note)
					workingList.remove(workingList.size() - 1);
					workingList.add(lastElem + syllable);
				}
			}

			if (syllable.contains("*")) {
				syllableToPush = "";
			}

			else if (syllable.contains("~")){

				String syllableNoSymbol = syllable.replace("~"," ");
				workingList.add(syllableNoSymbol);
			}
			
			else if(syllable.contains("\\-")) {
				String syllableNoSymbol = syllable.replace("\\-"," ");
				workingList.add(syllableNoSymbol);
			}
		}

		// workingList.add(syllableToPush);
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
