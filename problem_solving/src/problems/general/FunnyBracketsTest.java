package problems.general;

import org.junit.Test;

import junit.framework.TestCase;

public class FunnyBracketsTest extends TestCase {

	protected int x, y;

	protected void setUp() {
		x = 3;
		y = 3;
	}

	@Test
	public void testAdd() {
		double result = x + y;
		assertTrue(result == 6);
	}

	@Test
	public void testFunnyBrackets() {
		assertEquals(4, FunnyBrackets.solution("(())))("));
	}
}
