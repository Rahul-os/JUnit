package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCaseMethods {   
	
	Arithmetic arth = new Arithmetic();
	
	@Test
	public void testAdd()
	{
		assertEquals(10,arth.addition(3, 7));
	}
	
	@Test
	public void testSub()
	{
		assertEquals(12,arth.subtraction(20, 8));
	}
	
	@BeforeEach
	void beforeEachTest()
	{
		System.out.println("***   before each test case   ***    ");
	}
	
	@AfterEach
	void afterEach()
	{
		System.out.println("***   after each test case    ***     ");
	}
	
	@BeforeAll
	public static void beforeAllTests()
	{
		System.out.println("***   before all test cases   ***    ");
	}
	@AfterAll
	public static void afterAllTests()
	{
		System.out.println("***   after all test cases    ***     ");
	}

}
