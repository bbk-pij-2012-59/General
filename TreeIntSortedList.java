//Ex8x3x2 Implementation as tree
//22nd November 2012 - Created

public class TreeIntSortedList implements IntSortedList
{

	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;

	public TreeIntSortedList(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void add(int newValue)
	{
		//adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set
		if (newValue > this.value)
		{
			if (right == null)
			{
				right = new TreeIntSortedList(newValue);
			}
			else
			{
				right.add(newValue);
			}
		}
		else
		{
			if (left == null)
			{
				left = new TreeIntSortedList(newValue);
			}
			else
			{
				left.add(newValue);
			}
		}
	}

	public boolean contains(int searchValue)
	{
		//returns true if the number is in the list, false otherwise

		if (searchValue == this.value)
		{
			return true;
		}
		else if (searchValue > this.value)
		{
			if (right == null)
			{
				return false;
			}
			else
			{
				return right.contains(searchValue);
			}
		}
		else
		{
			if (left == null)
			{
				return false;
			}
			else
			{
				return left.contains(searchValue);
			}
		}
	}

	public String toString()
	{
		//returns a string with the values of the elements in the list separated by commas
		//Should the string be sorted?

		String listAsString = "" + this.value;

		if (left != null)
		{
			listAsString = listAsString + ", " + left.toString();
		}

		if (right != null)
		{
			listAsString = listAsString + ", " + right.toString();
		}

		return listAsString;
	}

}