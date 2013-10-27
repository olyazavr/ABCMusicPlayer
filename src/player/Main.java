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
		String choice = ask("Portal Want You Gone", "Barbie Girl", "Dream On");
		System.out.println("Now playing:" + choice);
		
		String choiceParsed = choice.replace(" ", "_") + ".abc";
		
		Play.play("songs_abc/" + choiceParsed);
		
	}

	public static String ask(final String... values) {

		String result = null;

		if (EventQueue.isDispatchThread()) {

			JPanel panel = new JPanel();
			panel.add(new JLabel("Please make a selection:"));
			DefaultComboBoxModel model = new DefaultComboBoxModel();
			for (String value : values) {
				model.addElement(value);
			}
			JComboBox comboBox = new JComboBox(model);
			panel.add(comboBox);

			int iResult = JOptionPane.showConfirmDialog(null, panel, "Flavor",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
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
