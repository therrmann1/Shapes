package org.cvtc.shapes;

/**
 * @author Tyler Herrmann
 *
 */

// Create a Shapes Factory using the Factory Design Pattern
public class ShapeFactory {
	
	// Create a single dialog for our instances of the shapes to use.
	private Dialog dialog;

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
		getDialog();
	}

	// New methods for instantiating shape objects
	public Cuboid makeCuboid(float height, float width, float depth){
		return new Cuboid(dialog, height,width,depth);
		
	}
	
	public Cylinder makeCylinder(float radius, float height){
		return new Cylinder(dialog, radius, height);
	}
	
	public Sphere makeSphere(float radius) {
		return new Sphere(dialog, radius);
	}
}
