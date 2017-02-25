package org.cvtc.shapes;

/**
 * 
 * @author Tyler Herrmann
 * Class representing the abstract super blueprint for our shapes different methods.
 */
public abstract class Shape {
	
	/**
	 * Call our Dialog class and instantiate a new Dialog object.
	 */
	
	private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

	/**
	 * 
	 * Create an abstract method in our Super Class of Shape for the Surface Area of each Shape.
	 */
	public abstract float surfaceArea();
	
	/**
	 * 
	 * Create an abstract method in our Super Class of Shape for the Volume of each Shape.
	 */	
	public abstract float volume();
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}
	
}
