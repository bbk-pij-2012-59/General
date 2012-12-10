public class Calculator
{
	private int n1 = 0, n2 = 0, n3 = 0;

	public void add(int n1, int n2)
	{
		n3 = n1 + n2;
		System.out.println(n1 + " plus " + n2 + " equals " + n3);
	}

	public void subtract(int n1 , int n2)
	{
		n3 = n1 - n2;
		System.out.println(n1 + " minus " + n2 + " equals " + n3);
	}

	public void multiply(int n1, int n2)
	{
		n3 = n1 * n2;
		System.out.println(n1 + " multiplied by " + n2 + " equals " + n3);
	}

	public void divide(int n1, int n2)
	{
		double n4 = (int) n1;
		double n5 = (int) n2;
		double n6 = n4/n5;
		System.out.println(n1 + " divided by " + n2 + " equals " + n6);
	}

	public void modulus(int n1, int n2)
	{
		n3 = n1 % n2;
		System.out.println("The remainder after " + n1 + " is divided by " + n2 + " equals " + n3);
	}
}





