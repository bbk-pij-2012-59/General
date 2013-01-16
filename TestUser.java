/**Ex10x2
* 3rd December 2012 - Created
* 15th December 2012 - Extended
* 20th December 2012 - Extended to include borrowing books
*/

import org.junit.*;
import static org.junit.Assert.*;

public class TestUser
{
	@Test
	public void testsGetName()
	{
		LibraryUser u1 = new LibraryUser("Jane Smith");
		String output = u1.getName();
		String expected = "Jane Smith";
		assertEquals(output, expected);
	}

	@Test
	public void testsGetID()
	{
		LibraryUser u1 = new LibraryUser("Joan Smith");
		int output = u1.getID();
		int expected = 0;
		assertEquals(output, expected);
	}

	@Test
	public void testsSetID()
	{
		LibraryUser u1 = new LibraryUser("June Smith");
		u1.setID(1001);
		int output = u1.getID();
		int expected = 1001;
		assertEquals(output, expected);
	}

	@Test
	public void testsRegister()
	{
		Library library1 = new MockLibrary();
		LibraryUser u1 = new LibraryUser("Paul Brown");
		u1.register(library1);
		int output = u1.getID();
		int expected = 1013;
		assertEquals(output, expected);
	}

	@Test
	public void testsGetLibrary()
	{
		Library library1 = new MockLibrary();
		LibraryUser u1 = new LibraryUser("Pete Brown");
		u1.register(library1);
		String output = u1.getLibrary();
		String expected = "LibraryX";
		assertEquals(output, expected);
	}

	@Test
	public void testsBorrowBook()
	{

	}

	@Test
	public void testsReturnBook()
	{

	}

	@Test
	public void testsGetBooksBorrowed()
	{

	}

	@Test
	public void testsGetNoBooksOut()
	{

	}

}

