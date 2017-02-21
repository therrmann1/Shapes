package src.org.cvtc.JUnit4Tests.substitutes;

import org.cvtc.shapes.Dialog;

/**
 * @author Tyler Herrmann
 *
 * Create a substitute for our Messagebox class for Unit Testing Purposes.
 */
public class MessageBoxSub implements Dialog {

	public int show(String message, String title) {
		return 0;
	}
	
}
