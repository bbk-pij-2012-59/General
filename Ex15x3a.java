//Ex15x3a
//28th January 2013 - Created
public class Ex15x3a
{

	public static void main(String[] args)
	{
		Ex15x3a test = new Ex15x3a();
		test.launch();
	}

	public void launch()
	{
		int count = 0;
		int total = 0;
		double average = 0;
		while (count < 10)
		{
			try
			{
				total = total + inputInteger();
				count++;
				System.out.println("Total: " + total + "; Count: " + count);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Numbers need to entered as digits, not words");
				System.out.println(e.toString());
			}
		}
		average = total / count;
		System.out.print("The average of your numbers is " + average);
	}

	public int inputInteger() throws NumberFormatException
	{
		String str = "";
		int n;
		System.out.println("Please enter a number ");
		str = System.console().readLine();
		n = Integer.parseInt(str);
		return n;
	}
}