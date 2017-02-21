package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Tyler Herrmann
 *
 * Create a messagebox class to wrap all our class to the JOptionPane.showMessageDialog
 * via a show method.
 */
public class MessageBox implements Dialog {

	/**
	 * Create a show method to replace our call to JOptionPane.showMessageDialog
	 */
	@Override
	public int show(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message, title, 3);
		
		return JOptionPane.OK_OPTION;
	}
	
}
