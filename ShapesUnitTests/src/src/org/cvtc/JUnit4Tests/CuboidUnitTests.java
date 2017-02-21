package src.org.cvtc.JUnit4Tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.*;
import org.junit.*;

import src.org.cvtc.JUnit4Tests.substitutes.MessageBoxSub;

/**
 * Cuboid unit test class used to verify all units in the Cuboid Class of the Shapes Project.
 * @author Tyler Herrmann
 *
 */

public class CuboidUnitTests {

	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	/**
	 * Verifies that values inserted into the Surface Area method  
	 * of the Cuboid class are correctly calculated and returned
	 * with no errors.
	 */
	@Test
	public void testSurfaceAreaNormalValues() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 2*((5*5) + (5*5) + (5*5));
		
		// 2. Act
		float actual = cuboid.surfaceArea();
	
		// 3. Assert
		assertEquals("A surface area calculation given the values 5,5,5 should return a result of 1550", expected, actual, 0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Cuboid class
	 * when calling the SurfaceArea method.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,0,0,0);
		
		cuboid.surfaceArea();
	}
	
	/**
	 * Verifies that inserting negative values into the Cuboid class values
	 * and calculating surface area with the surface area method throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,-5,-5,-5);
		
		cuboid.surfaceArea();
	}

	/**
	 * Verifies that normal values inserted into the Volume method
	 * of the Cuboid class are correctly calculated and returned
	 * with no errors.
	 */
	@Test
	public void testVolumeNormalValues() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5 * 5 * 5;
		
		// 2. Act
		float actual = cuboid.volume();
	
		// 3. Assert
		assertEquals("A volume calculation given the values 5,5,5 should return a result of 125", expected, actual, 0);
	
	}
	
	/**
	 * Verifies that inserting a value of 0 throws an exception in the Cuboid class,
	 * when calling the volume method of the Cuboid class.
	 * @throws IllegalArgumentException
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,0,0,0);
		
		cuboid.volume();
	}
	
	/**
	 * Verifies that inserting a negative value into the Cuboid class
	 * and calculating volume with the volume method throws an exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,-5,-5,-5);
		
		cuboid.volume();
	}
	
	/**
	 * Verifies that inserting a value of 5 into the Cuboid class's width
	 * returns a correct value of 5.
	 */
	@Test
	public void testGetWidth() {
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5;
		
		float actual = cuboid.getWidth();
		
		assertEquals("Getting the width of the newly created cuboid object should return a result of 5", expected, actual,0);	
	}
	
	/**
	 * Verifies that inserting a value of 5 into the Cuboid class's height
	 * returns a correct value of 5.
	 */
	@Test
	public void testGetHeight() {
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5;
		
		float actual = cuboid.getHeight();
		
		assertEquals("Getting the height of the newly created cuboid object should return a result of 5", expected, actual,0);
	}

	/**
	 * Verifies that inserting a value of 5 into the Cuboid class's Depth
	 * returns a correct value of 5.
	 */
	@Test
	public void testGetDepth() {
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5;
		
		float actual = cuboid.getDepth();
		
		assertEquals("Getting the depth of the newly created cuboid object should return a result of 5", expected, actual, 0);
	}

	/**
	 * Verifies that inserting a value of 123 into the Cuboid class's Depth
	 * returns a correct value of 123, using this to test Cuboid Constructor.
	 */
	@Test
	public void testCuboidConstructorNormalValues() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(dialogSub,123,123,123);
		float expected = cuboid.getDepth();
		
		// 2. Act
		float actual = cuboid.getDepth();
	
		// 3. Assert
		assertEquals("A depth value inserted of 123 should return a result of 123 when called", expected, actual, 0);
	}
	
	/**
	 * Verifies that inserting a negative value of -123 into the Cuboid class's Depth
	 * returns an exception,using this test to see if the constructor of the Cuboid is
	 * catching exceptions correctly.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCuboidConstructorNegativeValues() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,-123,-123,-123);
		
		cuboid.getDepth();
	}
	
	/**
	 * Verifies that inserting a value of 0 into the Cuboid class's Depth
	 * returns an exception,using this test to see if the constructor of the Cuboid is
	 * catching exceptions correctly.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCuboidConstructorZeroValues() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,0,0,0);
		
		cuboid.getDepth();
	}
	
	/**
	 * Verifies that render method of the cuboid class is working properly.
	 */
	@Test
	public void testCuboideRender(){
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		
		cuboid.render();
	}

}
