package org.cvtc.shapes;

/**
 * Represents a 3D Cylinder shape.
 */

public class Cylinder extends Shape implements Renderer{
	
	/**
	 * The radius of this Cylinder instance.
	 */
	private float radius = 0.0f;
	
	/**
	 * The height of this Cylinder instance.
	 */
	private float height = 0.0f;

	/**
	 * Gets the radius of this Cylinder instance.
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of this Cylinder instance.
	 */
	private void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Gets the height of this Cylinder instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cylinder instance.
	 */
	private void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Initializes a new instance of a Cylinder object.
	 */
	public Cylinder(Dialog dialog, float radius, float height) {
		super(dialog);

		// Set the dimensions of this Cylinder instance
		
		/**
		 * Validate the radius dimension given from the constructor of the cylinder
		 */
		if (radius <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setRadius(radius);
		}
		
		/**
		 * Validate the radius dimension given from the constructor of the cylinder
		 */
		if (height <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setHeight(height);
		}
		
	}

	@Override
	public float surfaceArea() {
		/**
		 * Calculate the total Surface Area of the Cylinder and store it in a variable named sum this formula is Surface Area = 2 * Pi * radius^2 + 2 * Pi * radius * height
		 */
		
		float sum = (float) (2 * (Math.PI * (getRadius()* getRadius())) + (2 * Math.PI * getRadius()) * getHeight());
		
		
		/**
		 * Validate the calculated Surface Area before displaying it to the user, if the sum is not valid throw an exception of the ArithmeticException class.
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
		 * Calculate the total Volume of the Cylinder and store it in a variable named sum this formula is Volume = Pi * Radius ^ 2 * Height
		 */
		
		float sum = (float) Math.PI * (getRadius() * getRadius()) * getHeight();
		
		
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
	 * Draws a dialog box to the screen displaying the surface area and volume for this Cylinder instance.
	 */
	public void render() {
		getDialog().show("Cylinder", "The Surface Area of the Cylinder is: " + this.surfaceArea() + " The Volume of the "
				+ " Cylinder is " + this.volume());
	}
	
}
