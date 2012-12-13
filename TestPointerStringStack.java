//Ex9x4x1
//29th November 2012 - Created

import org.junit.*;
import static org.junit.Assert.*;

public class TestPointerStringStack
{
	@Test
	public void testspush()
	{
		PointerStringStack ss = new PointerStringStack();
		String input = "xxx";
		ss.push(input);
		String output = ss.pop();
		String expected = "xxx";
		assertEquals(output, expected);
	}

	@Test
	public void testspop()
	{
		PointerStringStack ss = new PointerStringStack();
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
		PointerStringStack ss = new PointerStringStack();
		String input = "zzz";
		ss.push(input);
		String output = ss.peek();
		String expected = "zzz";
		assertEquals(output, expected);
	}

	@Test
	public void testsisEmpty()
	{
		PointerStringStack ss = new PointerStringStack();
		boolean output = ss.isEmpty();
		boolean expected = true;
		assertEquals(output, expected);

	}
}