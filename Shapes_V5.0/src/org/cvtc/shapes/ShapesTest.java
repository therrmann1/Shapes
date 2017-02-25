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
		
		
		// Create a new instance of the ShapesFactory object passing our dialog.
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		/**
		 * Instantiate a new instance of a Cuboid object with the dimensions of 10 Width, 4 Height, 5 Depth using our ShapesFactory Class.
		 */
		Cuboid cuboid = shapeFactory.makeCuboid(10,4,5);
		
		/**
		 * Call the render method of the Cuboid object to display a dialog box to screen indicating the volume and surface area of the Cuboid object
		 */
		cuboid.render();
		
		/**
		 * Instantiate a new instance of a Cylinder object with the dimensions of 5 Radius and 2 Height using our ShapesFactory Class.
		 */
		Cylinder cylinder = shapeFactory.makeCylinder(5, 2);
		
		/**
		 * Call the render method of the Cylinder object to display a dialog box to screen indicating the volume and surface area of the Cylinder object
		 */
		cylinder.render();
		
		
		/**
		 * Instantiate a new instance of a Sphere object with the dimensions of 5 Radius using our ShapesFactory Class.
		 */
		Sphere sphere = shapeFactory.makeSphere(5);
		
		/**
		 * Call the render method of the Sphere object to display a dialog box to screen indicating the volume and surface area of the Sphere object
		 */
		sphere.render();
		
	}

}
