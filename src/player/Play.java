package player;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.io.BufferedReader;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Play {
    protected static String readFileToString(String file) {
        StringBuilder output = new StringBuilder();

		// try with resources, resources always closed after
		try (BufferedReader bufferReader = new BufferedReader(new FileReader(
				file))) {
			String line;

			// Read file line by line and save to output
			while ((line = bufferReader.readLine()) != null) {
				output.append(line);
				output.append(System.getProperty("line.separator"));
			}
			bufferReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();
	}

	public static MusicPiece stringToMusicPiece(String input) {
		// Create a stream of tokens using the lexer.
		CharStream stream = new ANTLRInputStream(input);
		ABCMusicLexer lexer = new ABCMusicLexer(stream);
		lexer.reportErrorsAsExceptions();
		TokenStream tokens = new CommonTokenStream(lexer);
		// List<? extends Token> actualTokens = lexer.getAllTokens();

		// Feed the tokens into the parser.
		ABCMusicParser parser = new ABCMusicParser(tokens);
		parser.reportErrorsAsExceptions();

		// Generate the parse tree using the starter rule.
		ParseTree tree;
		tree = parser.abc_tune(); // "abc_tune" is the starter rule.
		// ((RuleContext) tree).inspect(parser);

		// Walk the tree with the listener.
		ParseTreeWalker walker = new ParseTreeWalker();
		Listener listener = new Listener();
		walker.walk(listener, tree);
		return listener.getMusic();
	}
}
