package src.org.cvtc.JUnit4Tests;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBox;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

import src.org.cvtc.JUnit4Tests.substitutes.MessageBoxSub;

/**
 * @author Tyler Herrmann
 *
 */
public class FactoryUnitTests {
	
	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	// Unit test for Cuboid creation in the new Shapes Factory
	@Test
	public void cuboidFactoryUnitTest() {
		ShapeFactory shapeFactory = new ShapeFactory(dialogSub);
		
		Cuboid cuboid = shapeFactory.makeCuboid(10,4,5);
		
		cuboid.render();
	}

	
	// Unit test for Cylinder creation in the new Shapes Factory
	@Test
	public void cylinderFactoryUnitTest() {
		ShapeFactory shapeFactory = new ShapeFactory(dialogSub);
		
		Cylinder cylinder = shapeFactory.makeCylinder(4,5);
		
		cylinder.render();
	}
	
	// Unit test for Sphere creation in the new Shapes Factory
	@Test
	public void sphereFactoryUnitTest() {
		ShapeFactory shapeFactory = new ShapeFactory(dialogSub);
		
		Sphere sphere = shapeFactory.makeSphere(5);
		
		sphere.render();
	}
}
