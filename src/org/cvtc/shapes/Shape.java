package org.cvtc.shapes;

/**
 * 
 * @author Tyler Herrmann
 * Class representing the abstract super blueprint for our shapes different methods.
 */
public abstract class Shape {

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
	
	/**
	 * 
	 * Create an abstract method in our Super Class of Shape for the rendering of each Shapes values.
	 */	
	public abstract void render();
	
}
