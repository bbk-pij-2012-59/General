/**
*Ex12x1
*7th January 2013 - Created
*/
public class ComparatorGeneric
{
	public <T> T getMax(T n, T m)
	{
		if (((Double)n) > ((Double)m))
		{
			return n;
		}
		else
		{
			return m;
		}
	}

	public String getMax(String number1, String number2)
	{
		Integer n1 = Integer.parseInt(number1);
		Integer n2 = Integer.parseInt(number2);
		String result = "" + getMax(n1, n2);
		return result;
	}
}