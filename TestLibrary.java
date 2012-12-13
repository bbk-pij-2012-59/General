//Ex10x2
/**
* 5th December 2012 - Created
* 6th December 2012 - More tests added
* 10th December 2012 - More tests added
*/

import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary
{
	@Test
	public void testsGetName()
	{
		PublicLibrary l1 = new PublicLibrary("Walthamstow Library");
		String output = l1.getName();
		String expected = "Walthamstow Library";
		assertEquals(output, expected);
	}

	@Test
	public void testsGetMaxBooksPerUser()
	{
		PublicLibrary l2 = new PublicLibrary("Balham Library");
		int output = l2.getMaxBooksPerUser();
		int expected = 3;
		assertEquals(output, expected);
	}

	@Test
	public void testsGetID()
	{
		PublicLibrary l3 = new PublicLibrary("Canary Wharf Idea Store");
		LibraryUser u1 = new LibraryUser("Jane Smith");
		int output1 = l3.getID(u1);
		int expected1 = 1001;
		assertEquals(output1, expected1);
		LibraryUser u2 = new LibraryUser("John Smith");
		int output2 = l3.getID(u2);
		int expected2 = 1002;
		assertEquals(output2, expected2);
		int output3 = l3.getID(u1);
		int expected3 = 1001;
		assertEquals(output3, expected3);
	}

	@Test
	public void testsGetReaderCount()
	{
		PublicLibrary l4 = new PublicLibrary("Camberwell Library");
		LibraryUser u3 = new LibraryUser("Joan Smith");
		int x = l4.getID(u3);
		LibraryUser u4 = new LibraryUser("Jean Smith");
		x = l4.getID(u4);
		int output = l4.getReaderCount();
		int expected = 2;
		assertEquals(output, expected);
	}

	@Test
	public void testsAddBookANDGetBookCount()
	{
		PublicLibrary l5 = new PublicLibrary("Wood St Library");
		l5.addBook("Programming in Fortran 77", "Old Fogey");
		l5.addBook("Programming in Java", "I.M. Young");
		int output = l5.getBookCount();
		int expected = 2;
		assertEquals(output, expected);
	}

	@Test
	public void testsTakeBook()
	{

	}

	@Test
	public void testsReturnBook()
	{

	}

	@Test
	public void testsBookBorrowedCount()
	{

	}
}
