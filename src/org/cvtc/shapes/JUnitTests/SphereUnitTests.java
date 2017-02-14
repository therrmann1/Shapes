package org.cvtc.shapes.JUnitTests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.*;

/**
 * Sphere unit test class used to verify all units in the Sphere Class of the Shapes Project.
 * @author Tyler Herrmann
 *
 */

public class SphereUnitTests {

	/**
	 * Verifies that values inserted into the Surface Area method  
	 * of the Sphere class are correctly calculated and returned
	 * with no errors.
	 */
	@Test
	public void testSurfaceAreaNormalValues() {
		// 1. Arrange
		Sphere sphere = new Sphere(5);
		float expected = (float) (float) (4 * Math.PI * (5 * 5));
		
		// 2. Act
		float actual = sphere.surfaceArea();
	
		// 3. Assert
		assertEquals("A surface area calculation given the value of 5 should return a result of 314.16", expected, actual,0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Sphere class
	 * when calling the Surface Area method.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(0);
		
		sphere.surfaceArea();
	}
	
	/**
	 * Verifies that inserting negative values into the Sphere class values
	 * and calculating Surface Area with the Surface Area method throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(-5);
		
		sphere.surfaceArea();
	}
	
	/**
	 * Verifies that values inserted into the Volume method  
	 * of the Sphere class are correctly calculated and returned
	 * with no errors.
	 */
	@Test
	public void testVolumeNormalValues() {
		// 1. Arrange
		Sphere sphere = new Sphere(5);
		float expected = (float) ((4.0/3.0) * Math.PI * Math.pow(5, 3));
		
		// 2. Act
		float actual = sphere.volume();
	
		// 3. Assert
		assertEquals("A volume calculation given the value of 5 should return a result of 523.6", expected, actual,0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Sphere class
	 * when calling the Volume method.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(0);
		
		sphere.volume();
	}
	
	/**
	 * Verifies that inserting negative values into the Sphere class values
	 * and calculating volume with the Volume method throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(-5);
		
		sphere.volume();
	}


	/**
	 * Verifies that inserting a value of 5 into the Sphere class's Radius
	 * returns a correct value of 5.
	 */
	@Test
	public void testGetRadius() {
		Sphere sphere = new Sphere(5);
		float expected = 5;
		
		float actual = sphere.getRadius();
		
		assertEquals("Getting the radius of the newly created sphere object should return a result of 5", expected, actual, 0);	
	}

	/**
	 * Verifies that values inserted into the construcor 
	 * of the Sphere class are correctly inserted and returned
	 * with no errors.
	 */
	@Test
	public void testSphereConstructorNormalValues() {
		// 1. Arrange
		Sphere sphere = new Sphere(5);
		float expected = 5;
		
		// 2. Act
		float actual = sphere.getRadius();
	
		// 3. Assert
		assertEquals("A constructor given the value of 5 for the radius should return a value of 5", expected, actual,0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Sphere class
	 * when calling the constructor.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testSphereConstructorZeroException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(0);
		
		sphere.getRadius();
	}
	
	/**
	 * Verifies that inserting a negative value throws an exception in the Sphere class
	 * when calling the constructor.
	 * @throws IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSphereConstructorNegativeException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(-5);
		
		sphere.getRadius();
	}

}
