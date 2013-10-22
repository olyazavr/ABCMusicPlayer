// Generated from Lyrics.g4 by ANTLR 4.0

package lyrics;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LyricsListener extends ParseTreeListener {
	void enterStar_cluster(LyricsParser.Star_clusterContext ctx);
	void exitStar_cluster(LyricsParser.Star_clusterContext ctx);

	void enterExtender_cluster(LyricsParser.Extender_clusterContext ctx);
	void exitExtender_cluster(LyricsParser.Extender_clusterContext ctx);

	void enterLyric(LyricsParser.LyricContext ctx);
	void exitLyric(LyricsParser.LyricContext ctx);

	void enterMeasure(LyricsParser.MeasureContext ctx);
	void exitMeasure(LyricsParser.MeasureContext ctx);

	void enterHyphen_cluster(LyricsParser.Hyphen_clusterContext ctx);
	void exitHyphen_cluster(LyricsParser.Hyphen_clusterContext ctx);

	void enterCluster(LyricsParser.ClusterContext ctx);
	void exitCluster(LyricsParser.ClusterContext ctx);

	void enterSyllable_cluster(LyricsParser.Syllable_clusterContext ctx);
	void exitSyllable_cluster(LyricsParser.Syllable_clusterContext ctx);

	void enterSyllable(LyricsParser.SyllableContext ctx);
	void exitSyllable(LyricsParser.SyllableContext ctx);
}