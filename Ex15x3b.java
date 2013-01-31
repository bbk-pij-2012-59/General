//Ex15x3b
//28th January 2013 - Created - hanging in launch method
//31st January 2013 - separated inputInteger method into two methods; working

public class Ex15x3b
{

	public static void main(String[] args)
	{
		Ex15x3b test = new Ex15x3b();
		test.launch();
	}

	public void launch()
	{
		int countSupplied = 0;
		int count = 0;
		int total = 0;
		double average = 0;
		System.out.print("How many numbers would you like to average? ");
		countSupplied = getNumber();
		while (count < countSupplied)
		{
			System.out.print("Please enter a number ");
			total = total + getNumber();
			count++;
			System.out.println("Total: " + total + "; Count: " + count);
		}
		average = total / count;
		System.out.print("The average of your numbers is " + average);
	}

	public int getNumber()
	{
		int n = 0;
		int count = 0;
		boolean done = false;
		while (!done)
		{
			try
			{
				n = inputInteger();
				done = true;
			}
			catch (NumberFormatException e)
			{
				System.out.print("Numbers need to entered as digits, not words ");
			}
		}
		return n;
	}

	public int inputInteger() throws NumberFormatException
	{
		String str = "";
		int n = 0;
		str = System.console().readLine();
		n = Integer.parseInt(str);
		return n;
	}
}