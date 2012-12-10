//Ex8x3x1 Interface
//22nd November 2012 - Created

public interface IntSortedList
{
	void add(int newValue);
		//adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set

	boolean contains(int searchValue);
		//returns true if the number is in the list, false otherwise

	String toString();
		//returns a string with the values of the elements in the list separated by commas
}