//Ex9x4x1
//29th November 2012 - Created

import org.junit.*;
import static org.junit.Assert.*;

public class TestStringStack
{
	@Test
	public void testspush()
	{
		Person2 p = new Person2("Dereck Robert Yssirt");
		String output = p.getInitials();
		String expected = "DRY";
		assertEquals(output, expected);
	}

	@Test
	public void testsNameWithExcessSpaces()
	{
		Person2 p = new Person2("Extra  Spaces");
		String output = p.getInitials();
		String expected = "ES";
		assertEquals(output, expected);
	}
}