package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("before all");
	}
	
	@Before
	public void beforeEach() {
		System.out.println("before");
	}
	
	@After
	public void afterEach() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("after all");
	}

	@Test
	public void fiboPositive() {
		assertEquals("0 => 0", 0, Fibo.fib(0));
		assertEquals("1 => 1", 1, Fibo.fib(1));
		assertEquals("2 => 1", 1, Fibo.fib(2));
		assertEquals("3 => 2", 2, Fibo.fib(3));
		assertEquals("14 => 377", 377, Fibo.fib(14));
		assertEquals("25 => 75025", 75025, Fibo.fib(25));
		assertEquals("46 => 1836311903", 1836311903, Fibo.fib(46));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fiboNegative() {
		Fibo.fib(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fiboTooBigN() {
		Fibo.fib(47);
	}

}
