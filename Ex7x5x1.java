public class Ex7x5x1
{
	public static void main (String[] args)
	{
		int i = 0;
		while (i < 10)
		{
			System.out.print ("Give me a string and I will calculate its hash code: ");
			String str = System.console().readLine();
			int hash = str.hashCode();
			System.out.println ("hashCode is: " + hash);
			int smallHash = HashUtilities.shortHash(hash);
			System.out.println("0 < " + smallHash + " < 1000");
			i++;
		}
	}
}