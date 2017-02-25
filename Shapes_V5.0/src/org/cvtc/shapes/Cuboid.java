package org.cvtc.shapes;

/**
 * Represents a 3D cuboid shape.
 */
public class Cuboid extends Shape implements Renderer {
	
	/**
	 * The width of this Cuboid instance.
	 */
	private float width = 0.0f;
	
	/**
	 * The height of this Cuboid instance.
	 */
	private float height = 0.0f;
	
	/**
	 * The depth of this Cuboid instance.
	 */
	private float depth = 0.0f;
	
	
	
	/**
	 * Gets the width of this Cuboid instance.
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of this Cuboid instance.
	 */
	private void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * Gets the height of this Cuboid instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cuboid instance.
	 */
	private void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Gets the depth of this Cuboid instance.
	 */
	public float getDepth() {
		return depth;
	}
	
	/**
	 * Sets the depth of this Cuboid instance.
	 */
	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	/**
	 * Initializes a new instance of a Cuboid object.
	 */
	public Cuboid(Dialog dialog, float width, float height, float depth) {
		
		super(dialog);
		
		// Set the dimensions of this Cuboid instance
		
		/**
		 * Validate the width dimension given from the constructor of the cuboid
		 */
		if (width <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setWidth(width);
		}
		
		/**
		 * Validate the height dimension given from the constructor of the cuboid
		 */
		if (height <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setHeight(height);
		}
		
		/**
		 * Validate the depth dimension given from the constructor of the cuboid
		 */
		if (depth <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setDepth(depth);
		}
		
	}
	
	/**
	 * Calculates and returns the surface area for this Cuboid instance.
	 */
	@Override
	public float surfaceArea() {
		/**
		 * Calculate the total Surface Area of the Cuboid and store it in a variable named sum this formula is 2(lw + wh + hl) with l = Length (Or Width in our case)
		 * w = Width (Or Depth in our case) and h = Height we then return this value.
		 */
		
		float sum = 2 * ((getWidth() * getDepth()) + (getDepth() * getHeight()) + (getHeight() * getWidth()));
		
		/*
		 * Validate the calculated Surface Area before displaying it to the user, if the sum is not valid throw an exception of the ArithmeticException class.
		 */
		if (sum <= 0) {
			throw new IllegalArgumentException();
		} else {
			return sum;
		}
	}

	/**
	 * Calculates and returns the volume for this Cuboid instance.
	 */
	@Override
	public float volume() {
		/**
		 * Calculate the total volume of the Cuboid and store it in a variable named sum this formula is length * width * height with l = Length (Or Width in our case)
		 * w = Width (Or Depth in our case) and h = Height we then return this value.
		 */
		
		float sum = getWidth() * getDepth() * getHeight();
		
		/**
		 * Validate the calculated Volume before displaying it to the user, if the sum is not valid throw an exception of the ArithmeticException class.
		 */
		if (sum <= 0) {
			throw new IllegalArgumentException();
		} else {
			return sum;
		}
	}

	/**
	 * Draws a dialog box to the screen displaying the surface area and volume for this Cuboid instance.
	 */
	public void render() {
		getDialog().show("Cuboid", "The Surface Area of the Cubiod is: " + this.surfaceArea() + " The Volume of the "
				+ " Cubiod is " + this.volume());
	}

}

