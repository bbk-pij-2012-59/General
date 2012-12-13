//Ex9x4x1
//29th November 2012 - Created

import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayStringStack
{
	@Test
	public void testspush()
	{
		ArrayStringStack ss = new ArrayStringStack();
		String input = "xxx";
		ss.push(input);
		String output = ss.pop();
		String expected = "xxx";
		assertEquals(output, expected);
	}

	@Test
	public void testspop()
	{
		ArrayStringStack ss = new ArrayStringStack();
		String input = "yyy";
		ss.push(input);
		String output = ss.pop();
		String expected = "yyy";
		assertEquals(output, expected);
		output = ss.pop();
		expected = null;
		assertEquals(output, expected);
	}

	@Test
	public void testspeek()
	{
		ArrayStringStack ss = new ArrayStringStack();
		String input = "zzz";
		ss.push(input);
		String output = ss.peek();
		String expected = "zzz";
		assertEquals(output, expected);
	}

	@Test
	public void testsisEmpty()
	{
		ArrayStringStack ss = new ArrayStringStack();
		boolean output = ss.isEmpty();
		boolean expected = true;
		assertEquals(output, expected);

	}
}