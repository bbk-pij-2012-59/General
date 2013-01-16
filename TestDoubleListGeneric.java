/**
*Ex12x3
*File 2 of (probably) 4
*10th January 2013 - Created
* The tests for doubly-linked generic lists
*/

import org.junit.*;
import static org.junit.Assert.*;

public class TestDoubleListGeneric<T>
{
	@Test
	public void testsAddElement()
	{
		DoubleListGenericInterface<T> ListStart = null;
		DoubleListGenericInterface<T> firstElement = new DoubleListGenericInterface<T>(10);
		ListStart = firstElement;
		DoubleListGenericInterface<T> secondElement = new DoubleListGenericInterface<T>(20);
		ListStart.addElement(secondElement);
		int output1 = returnValueOfElement(firstElement);
		int expected1 = 10;
		assertEquals(output1, expected1);
		int output2 = returnValueOfElement(secondElement);
		int expected2 = 20;
		assertEquals(output2, expected2);

	}

	@Test
	public void testsDeletedElement()
	{
		//output = ;
		//<T>expected = ;
		//assertEquals(output, expected);

	}

}
