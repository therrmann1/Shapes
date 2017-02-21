package org.cvtc.shapes;

/**
 * @author Tyler Herrmann
 * 
 * Create a dialog interface to remove our dependency on the JOptionPane class
 */
public interface Dialog {
	int show(String message, String title);
}
