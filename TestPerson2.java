//Ex9x3xa
//26th November 2012 - Created

import org.junit.*;
import static org.junit.Assert.*;

public class TestPerson2
{
	@Test
	public void testsNormalName()
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