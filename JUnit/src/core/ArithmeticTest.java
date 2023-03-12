package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {
	Arithmetic arth = new Arithmetic();
	
	@Test
	public void testPositive()
	{
		assertEquals( 12 , arth.addition(8,4));
	}
	
	@Test
	public void testNegative() {
		assertNotEquals(10,arth.addition(4, 3));
	}
	
	//for subtraction method test cases.
	
	@Test
	public void testSubPositive()
	{
		assertEquals(4, arth.subtraction(10, 6));
	}
	
	@Test
	public void testSubNegative()
	{
		assertNotEquals(10,arth.subtraction(20, 10));   //test case fails
	}

}
