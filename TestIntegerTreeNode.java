//Ex8x1 19th November 2012

public class TestIntegerTreeNode
{
	public static void main(String[] args)
	{
		System.out.print("Please input your first number: ");
		String str = System.console().readLine();
		int firstnumber = Integer.parseInt(str);
		IntegerTreeNode testTree = new IntegerTreeNode (firstnumber);
		do
		{
			System.out.print("Enter another number (E to end): ");
			str = System.console().readLine();
			if(Character.toLowerCase(str.charAt(0)) != 'e')
			{
				int nextnumber = Integer.parseInt(str);
				testTree.add(nextnumber);
			}
		}
		while (Character.toLowerCase(str.charAt(0)) != 'e');

		System.out.println("The largest number entered was " + testTree.getMax());
		System.out.println("The smallest number entered was " + testTree.getMin());
		System.out.println("Here is a representation of the tree in String form:");
		System.out.println(testTree.toString1());
		System.out.println("Here is another, simplified representation of the tree:");
		System.out.println(testTree.toString2());
		System.out.println("The depth of the tree is " + (testTree.depth() - 1));
		System.out.print("Enter a number to check whether it in the tree; ");
		str = System.console().readLine();
		int searchnumber = Integer.parseInt(str);
		if (testTree.contains(searchnumber))
		{
			System.out.println("Yes, " + searchnumber + " is in the tree.");
		}
		else
		{
			System.out.println("No, " + searchnumber + " is not in the tree.");
		}
	}
}