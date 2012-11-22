//Ex8x2x2
//22nd November 2012 - Created

public class TestTreeIntSet
{
	public static void main(String[] args)
	{
		System.out.print("Please input your first number: ");
		String str = System.console().readLine();
		int firstnumber = Integer.parseInt(str);
		TreeIntSet testTree = new TreeIntSet(firstnumber);
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

		System.out.println("Here is a representation of the set in String form:");
		System.out.println(testTree.toString());

		System.out.print("Enter a number to check whether it in the set; ");
		str = System.console().readLine();
		int searchnumber = Integer.parseInt(str);
		if (testTree.containsVerbose(searchnumber))
		{
			System.out.println("Yes, " + searchnumber + " is in the set.");
		}
		else
		{
			System.out.println("No, " + searchnumber + " is not in the set.");
		}
	}
}