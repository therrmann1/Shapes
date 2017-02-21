package org.cvtc.shapes;

/**
 * 
 * @author Tyler Herrmann
 * Class representing the test units for our shapes
 */

public class ShapesTest {

	public static void main(String[] args) {

		/**
		 * Create a new messagebox.
		 */
		
		Dialog dialog = new MessageBox();
		
		/**
		 * Instantiate a new instance of a Cuboid object with the dimensions of 10 Width, 4 Height, 5 Depth
		 */
		Cuboid cuboid = new Cuboid(dialog,0,0,0);
		
		/**
		 * Call the render method of the Cuboid object to display a dialog box to screen indicating the volume and surface area of the Cuboid object
		 */
		cuboid.render();
		
		/**
		 * Instantiate a new instance of a Cylinder object with the dimensions of 5 Radius and 2 Height
		 */
		Cylinder cylinder = new Cylinder(dialog, 0, 0);
		
		/**
		 * Call the render method of the Cylinder object to display a dialog box to screen indicating the volume and surface area of the Cylinder object
		 */
		cylinder.render();
		
		
		/**
		 * Instantiate a new instance of a Sphere object with the dimensions of 5 Radius
		 */
		Sphere sphere = new Sphere(dialog, 5);
		
		/**
		 * Call the render method of the Sphere object to display a dialog box to screen indicating the volume and surface area of the Sphere object
		 */
		sphere.render();
		
	}

}
