package src.org.cvtc.JUnit4Tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.*;
import org.junit.*;

import src.org.cvtc.JUnit4Tests.substitutes.MessageBoxSub;

/**
 * Cylinder unit test class used to verify all units in the Cylinder Class of the Shapes Project.
 * @author Tyler Herrmann
 *
 */

public class CylinderUnitTest {
	
	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	/**
	 * Verifies that values inserted into the Surface Area method  
	 * of the Cylinder class are correctly calculated and returned
	 * with no errors.
	 */
	@Test
	public void testSurfaceAreaNormalValues() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(dialogSub,5, 5);
		float expected = (float) (2 * (Math.PI * (5 * 5)) + (2 * Math.PI * 5) * 5);
		
		// 2. Act
		float actual = cylinder.surfaceArea();
	
		// 3. Assert
		assertEquals("A surface area calculation given the values 5 and 5 should return a result of 314.16", expected, actual, 0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Cylinder class
	 * when calling the SurfaceArea method.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,0,0);
		
		cylinder.surfaceArea();
	}
	
	/**
	 * Verifies that inserting negative values into the Cuboid class values
	 * and calculating surface area with the surface area method throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,-5,-5);
		
		cylinder.surfaceArea();
	}

	/**
	 * Verifies that values inserted into the Volume method  
	 * of the Cylinder class are correctly calculated and returned
	 * with no errors.
	 */
	@Test
	public void testVolumeNormalValues() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(dialogSub,5, 5);
		float expected = (float) (Math.PI * (5 * 5) * 5);
		
		// 2. Act
		float actual = cylinder.volume();
	
		// 3. Assert
		assertEquals("A volume calculation given the values 5 and 5 should return a result of 392.86", expected, actual,0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Cylinder class
	 * when calling the Volume method.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,0,0);
		
		cylinder.volume();
	}
	
	/**
	 * Verifies that inserting negative values into the Cuboid class values
	 * and calculating volume with the Volume method throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,-5,-5);
		
		cylinder.volume();
	}

	/**
	 * Verifies that inserting a value of 5 into the Cylinder class's Radius
	 * returns a correct value of 5.
	 */
	@Test
	public void testGetRadius() {
		Cylinder cylinder = new Cylinder(dialogSub,5,5);
		float expected = 5;
		
		float actual = cylinder.getRadius();
		
		assertEquals("Getting the radius of the newly created cylinder object should return a result of 5", expected, actual, 0);	
	}

	/**
	 * Verifies that inserting a value of 5 into the Cylinder class's Height
	 * returns a correct value of 5.
	 */
	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder(dialogSub,5,5);
		float expected = 5;
		
		float actual = cylinder.getHeight();
		
		assertEquals("Getting the height of the newly created cylinder object should return a result of 5", expected, actual, 0);	
	}

	/**
	 * Verifies that values inserted into the Cylinder class constructor
	 * are inserted and returned with no errors.
	 */
	@Test
	public void testCylinderConstructorNormalValues() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(dialogSub,5, 5);
		float expected = 5;
		
		// 2. Act
		float actual = cylinder.getHeight();
	
		// 3. Assert
		assertEquals("A constructor of the cylinder class given the values of (5,5) should return a height of 5", expected, actual, 0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Cylinder class 
	 * when calling the Cylinder object constructor and attempting to retrieve the height.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testCylinderConstructorZeroException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,0,0);
		
		cylinder.getHeight();
	}
	
	/**
	 * Verifies that inserting negative values into the Cuboid class Constructor
	 * and calling the height value throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCylinderConstructorNegativeException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,-5,-5);
		
		cylinder.surfaceArea();
	}
	
	/**
	 * Verifies that render method of the Cylinder class is working properly.
	 */
	@Test
	public void testCylinderRender(){
		Cylinder cylinder = new Cylinder(dialogSub,5,5);
		
		cylinder.render();
	}

}
