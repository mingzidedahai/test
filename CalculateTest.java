package net.test.unit.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class CalculateTest {
	
	private static Calculate calculate =new Calculate();

	@Before
	public void setUp() throws Exception {
		calculate.clear();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		calculate.add(2);
		calculate.add(6);
		assertEquals(8,calculate.getResult());
		
	}

	@Test
	public void testSubstract() {
		calculate.add(10);
		calculate.substract(2);
		
		assertEquals(8,calculate.getResult());
		
	}

	@Test
	public void testMultiply() {
		calculate.add(2);
		calculate.multiply(5);
		assertEquals(10,calculate.getResult());
		
	}

	@Test
	public void testDivide() {
		calculate.add(5);
	    calculate.divide(5);
	    assertEquals(1,calculate.getResult());
		
	}

	public static Calculate getCalculate() {
		return calculate;
	}

	public static void setCalculate(Calculate calculate) {
		
		CalculateTest.calculate = calculate;
	}

}
