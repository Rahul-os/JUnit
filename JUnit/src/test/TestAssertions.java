package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestAssertions {
	
	String obj1 = "Deloitte";
	String obj2 = "deloitte";
	
	String obj3 = null ;
	
	int var1 = 55;
	int var2 = 40; 
	
	int[] arithmetic1 = {10,40,30};
	int[] arithmetic2 = {10,40,30};
	
	@Test 
	public void testEquals() {
		assertEquals(obj1,obj2);
	}
	
	@Test
	public void testNull() {
		assertNull(obj3);
	}
	@Test
	public void testVarTrue()
	{
		assertTrue(var1 > var2);
	}
	
	@Test
	public void testVarFalse()
	{
		assertFalse(var1 < var2);
	} 
	
	@Test
	public void testArrayEquals()
	{
		assertArrayEquals(arithmetic1 , arithmetic2);
	}

	
	
	
	

}
