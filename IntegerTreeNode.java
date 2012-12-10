//Ex8x1 19th November 2012

public class IntegerTreeNode
{
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void add(int newNumber)
	{
		if (newNumber > this.value)
		{
			if (right == null)
			{
				right = new IntegerTreeNode(newNumber);
			}
			else
			{
				right.add(newNumber);
			}
		}
		else
		{
			if (left == null)
			{
				left = new IntegerTreeNode(newNumber);
			}
			else
			{
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n)
	{
		if (n == this.value)
		{
			return true;
		}
		else if (n > this.value)
		{
			if (right == null)
			{
				return false;
			}
			else
			{
				return right.contains(n);
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
				return left.contains(n);
			}
		}
	}

	public int getMax()
	{
		int max = this.value;
		if (right == null)
		{
			return max;
		}
		else
		{
			return right.getMax();
		}
	}

	public int getMin()
	{
		int min = this.value;
		if (left == null)
		{
			return min;
		}
		else
		{
			return left.getMin();
		}
	}

	public String toString1()
	{
		String treeAsString1 = "[" + this.value;

		if (left == null)
		{
			treeAsString1 = treeAsString1 + " L[]";
		}
		else
		{
			treeAsString1 = treeAsString1 + " L" + left.toString1();
		}

		if (right == null)
		{
			treeAsString1 = treeAsString1 + " R[]";
		}
		else
		{
			treeAsString1 = treeAsString1 + " R" + right.toString1();
		}

		treeAsString1 = treeAsString1 + "]";
		return treeAsString1;
	}

	public String toString2()
	{
		String treeAsString2 = "[" + this.value;

		if (left != null)
		{
			treeAsString2 = treeAsString2 + " " + left.toString2();
		}

		if (right != null)
		{
			treeAsString2 = treeAsString2 + " " + right.toString2();
		}

		treeAsString2 = treeAsString2 + "]";
		return treeAsString2;
	}

	public int depth()
	{
		int treedepthleft = 1;
		int treedepthright = 1;
		if (left != null)
		{
			treedepthleft = treedepthleft + left.depth();
			System.out.println("treedepthleft: " + treedepthleft);
		}
		if (right != null)
		{
			treedepthright = treedepthright + right.depth();
			System.out.println("treedepthright: " + treedepthright);
		}
		if (treedepthleft >= treedepthright)
		{
			return (treedepthleft);
		}
		else
		{
			return (treedepthright);
		}
	}
}