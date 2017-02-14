package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Represents a 3D Sphere shape.
 */

public class Sphere extends Shape {

	/**
	 * Creating a local reference to Jframe using a variable named frame.
	 */
	JFrame frame;
	
	/**
	 * The radius of this Sphere instance.
	 */
	private float radius = 0.0f;

	/**
	 * Gets the radius of this Sphere instance.
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * Sets the radius of this Sphere instance.
	 */
	private void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Initializes a new instance of a Sphere object.
	 */
	public Sphere(float radius) {
		
		// Set the dimensions of this Sphere instance
		
		/**
		 * Validate the radius dimension given from the constructor of the sphere
		 */
		if (radius <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setRadius(radius);
		}
	}

	@Override
	public float surfaceArea() {
		/**
		 * Calculate the total Surface Area of the Sphere and store it in a variable named sum this formula is Surface Area = 4 * Pi * Radius^2
		 */
	
		float sum = (float) (4 * Math.PI * (getRadius() * getRadius()));
			
		/**
		 * Validate the calculated Surface Area before displaying it to the user, if the sum is not valid display throw an exception of the ArithmeticException class.
		 */
		if (sum > 0) {
			return sum;
		} else {
			throw new ArithmeticException();
		}
	}

	@Override
	public float volume() {
		/**
		 * Calculate the total Volume of the Sphere and store it in a variable named sum this formula is Volume = (4/3) * Pi * Radius ^ 3
		 */
		
		float sum = (float) ((4.0/3.0) * Math.PI * Math.pow(getRadius(), 3));
		
		
		/**
		 * Validate the calculated Volume before displaying it to the user, if the sum is not valid throw an exception of the ArithmeticException class.
		 */
		if (sum > 0) {
			return sum;
		} else {
			throw new ArithmeticException();
		}
	}

	/**
	 * Draws a dialog box to the screen displaying the surface area and volume for this Sphere instance.
	 */
	@Override
	public void render() {
		JOptionPane.showMessageDialog(frame, "The Surface Area of the Sphere is: " + this.surfaceArea() + " The Volume of the "
				+ " Sphere is " + this.volume());
	}
	
}
