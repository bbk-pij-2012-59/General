//Ex10x2
/**3rd December 2012 - Created
* 15th December 2012 - Amended
* 20th December 2012 - Extended to include borrower
*/

import org.junit.*;
import static org.junit.Assert.*;

public class TestBook
{
	@Test
	public void testsGetAuthor()
	{
		LibraryBook b1 = new LibraryBook("John Smith", "Java for Idiots");
		String output = b1.getAuthor();
		String expected = "John Smith";
		assertEquals(output, expected);
	}

	@Test
	public void testsGetTitle()
	{
		LibraryBook b2 = new LibraryBook( "Mary Smith", "Testing in Java Made Easy");
		String output = b2.getTitle();
		String expected = "Testing in Java Made Easy";
		assertEquals(output, expected);
	}

	@Test
	public void testsGetBorrower()
	{

	}

	@Test
	public void testsIsTaken()
	{

	}

	@Test
	public void testsSetTaken()
	{

	}

}