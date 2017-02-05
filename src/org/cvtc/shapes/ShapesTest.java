package org.cvtc.shapes;

/**
 * 
 * @author Tyler Herrmann
 * Class representing the test units for our shapes
 */

public class ShapesTest {

	public static void main(String[] args) {

		/**
		 * Instantiate a new instance of a Cuboid object with the dimensions of 10 Width, 4 Height, 5 Depth
		 */
		Cuboid cuboid = new Cuboid(10, 4, 5);
		
		/**
		 * Call the render method of the Cuboid object to display a dialog box to screen indicating the volume and surface area of the Cuboid object
		 */
		cuboid.render();
		
		/**
		 * Instantiate a new instance of a Cylinder object with the dimensions of 5 Radius and 2 Height
		 */
		Cylinder cylinder = new Cylinder(5, 2);
		
		/**
		 * Call the render method of the Cylinder object to display a dialog box to screen indicating the volume and surface area of the Cylinder object
		 */
		cylinder.render();
		
		
		/**
		 * Instantiate a new instance of a Sphere object with the dimensions of 5 Radius
		 */
		Sphere sphere = new Sphere(5);
		
		/**
		 * Call the render method of the Sphere object to display a dialog box to screen indicating the volume and surface area of the Sphere object
		 */
		sphere.render();
		
	}

}
