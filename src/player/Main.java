package player;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sound.MusicPlayer;

/**
 * Main entry point of your application.
 */
public class Main {

	/**
	 * Plays the input file using Java MIDI API and displays header information
	 * to the standard output stream.
	 * 
	 * (Your code should not exit the application abnormally using
	 * System.exit().)
	 * 
	 * @param file
	 *            the name of input abc file
	 * @throws InvalidMidiDataException
	 * @throws MidiUnavailableException
	 */
	public static void play(String file) throws MidiUnavailableException,
			InvalidMidiDataException {
		MusicPiece music = stringToMusicPiece(readFileToString(file));
		int ticksPerBeat = music.calculateTicksPerBeat();
		int tempo = music.getPlayerTempo();
		MusicPlayer player = new MusicPlayer(tempo, ticksPerBeat);
		music.addNotes(player);
		player.play();
	}

	private static String readFileToString(String file) {
		StringBuilder output = new StringBuilder("");

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

	private static MusicPiece stringToMusicPiece(String input) {
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

	public static void main(String[] args) {

	}
}
