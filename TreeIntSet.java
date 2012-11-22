//Ex8x2x2 Implementation as tree
//22nd November 2012 - Created

public class TreeIntSet implements IntSet
{

	private int value;
	private TreeIntSet left;
	private TreeIntSet right;

	public TreeIntSet(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void add(int newValue)
	{
		//adds a new int to the set; if it is there already, nothing happens
		if (contains(newValue))
		{
			System.out.println("Set already contains this value");
			return;
		}
		else if (newValue > this.value)
		{
			if (right == null)
			{
				right = new TreeIntSet(newValue);
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
				left = new TreeIntSet(newValue);
			}
			else
			{
				left.add(newValue);
			}
		}
	}

	public boolean contains(int searchValue)
	{
		//returns true if the number is in the set, false otherwise

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

	public boolean containsVerbose(int searchValue)
	{
		//returns the same values as the former method, but for every element that is checked prints its value on screen
		System.out.println("Value searched for: " + searchValue);
		boolean answer = contains(searchValue);
		return answer;
	}

	public String toString()
	{
		//returns a string with the values of the elements in the set separated by commas

		String setAsString = "" + this.value;

		if (left != null)
		{
			setAsString = setAsString + ", " + left.toString();
		}

		if (right != null)
		{
			setAsString = setAsString + ", " + right.toString();
		}

		return setAsString;
	}

}