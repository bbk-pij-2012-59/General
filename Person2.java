//Ex9x3xa
//26th November 2012 - Created
//File named to distinguish from Person.java created on 12/11/2012 when working with lists

public class Person2
{
	private String name;
	private String initials;

    public Person2(String txt)
    {
		name = txt;
    }

	public String getInitials()
	{
		String result = "";
		String[] words = name.split(" ");
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].length() > 0)
			{
				String nextInitial = "" + words[i].charAt(0);
				result = result + nextInitial.toUpperCase();
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Person2 x = new Person2("");
		x.launch();
	}

	private void launch()
	{
		System.out.print("Please input the name of person: ");
		String str = System.console().readLine();
		Person2 p = new Person2(str);
		p.initials = p.getInitials();
		System.out.println("The initials of " + p.name + " are: " + p.initials);
	}

}