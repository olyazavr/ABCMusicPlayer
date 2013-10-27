package player;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Main entry point of your application.
 */
public class Main {

	public static void main(String[] args) {
		// bring up the pop-up window. This window will have a dropdown menu of
		// all the songs available for the user to play
		String choice = ask("abc song", "fur elise", "invention",
				"little night music", "paddy", "prelude", "scale",
				"waxies dargle", "Dont Fear The Reaper by Blue Oyster Cult",
				"All The Small Things by Blink 182",
				"Yesterday by The Beattles", "Portal Want You Gone by Valve",
				"Barbie Girl by Aqua", "Back in Black by AC/DC",
				"Final Fantasy III", "Fuge by Bach", "Get Lucky by Daft Punk",
				"Get Lucky 2 by Daft Punk", "Hey Jude by The Beattles",
				"Highway To Hell by AC/DC", "Star Trek", "Star Wars",
				"Zelda Saria", "Dream On by Aerosmith",
				"I Love It by Icona Pop", "Wake Me Up by Avicii");

		// if cancelled wasn't clicked print the chosen song and play it
		if (choice != null) {
			System.out.println("Now playing: " + choice);

			String justSong;

			String[] stripArtist = choice.split("by");
			if (stripArtist.length == 2) {

				justSong = stripArtist[0].substring(0,
						stripArtist[0].length() - 1);
			} else {
				justSong = stripArtist[0];
			}
			String choiceParsed = justSong.replace(" ", "_") + ".abc";

			Play.play("songs_abc/" + choiceParsed);
		}
		// else return a message indicating to the user that he/she cancelled
		else {
			int ran = (int) (Math.random() * 10);
			String randMessage;
			if (ran < 3) {
				randMessage = "Cancelled command: null song choice. Bad choice.";
			} else if (ran < 7) {
				randMessage = "No music? OK. Maybe later.";
			} else {
				randMessage = "You clicked Cancel by mistake. Go back and pick a song.";
			}
			System.out.println(randMessage);
		}
	}

	/**
	 * Pop up drop-down menu function used to display the available songs to
	 * play
	 * 
	 * @param values
	 *            string representation of songs in songs_abc
	 * @return pop-up box
	 */
	public static String ask(final String... values) {

		String result = null;

		if (EventQueue.isDispatchThread()) {

			JPanel panel = new JPanel();
			panel.add(new JLabel("Pick the song to play:"));
			DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
			for (String value : values) {
				model.addElement(value);
			}
			JComboBox<String> comboBox = new JComboBox<String>(model);
			panel.add(comboBox);

			int iResult = JOptionPane.showConfirmDialog(null, panel,
					"ABC song player", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			switch (iResult) {
			case JOptionPane.OK_OPTION:
				result = (String) comboBox.getSelectedItem();
				break;
			}

		} else {

			Response response = new Response(values);
			try {
				SwingUtilities.invokeAndWait(response);
				result = response.getResponse();
			} catch (InterruptedException | InvocationTargetException ex) {
				ex.printStackTrace();
			}

		}

		return result;

	}

	public static class Response implements Runnable {

		private String[] values;
		private String response;

		public Response(String... values) {
			this.values = values;
		}

		@Override
		public void run() {
			response = ask(values);
		}

		public String getResponse() {
			return response;
		}
	}
}
