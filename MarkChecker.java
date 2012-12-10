//Ex6x2: Working!

public class MarkChecker
{

	public void MarkChecking()
	{
	String str = "";
	int mark = -2, countmark = 0, countDistinction = 0, countPass = 0, countFail = 0, countInvalid = 0;
	System.out.println("Please enter the marks, one per line, ending with -1 ");
	do
	{
		System.out.print("Input a mark: ");
		str = System.console().readLine();
		mark = Integer.parseInt(str);
		countmark++;

		if (mark >= 70 && mark <=100)
		{
			countDistinction++;
		}
		else if (mark >= 50 && mark < 70)
		{
			countPass++;
		}
		else if (mark >= 0 && mark < 50)
		{
			countFail++;
		}
		else
		{
			countInvalid++;
		}
	}
	while (mark != -1);

	System.out.print("There are " + (countmark - countInvalid) + " student(s): " + countDistinction + " distinction(s), " + countPass + " pass(es), "
	 + countFail + " fail(s) (plus " + (countInvalid - 1) + " invalid mark(s)).");
 	}

	public static void main (String[] args)
	{
		MarkChecker checktoday = new MarkChecker();
		checktoday.MarkChecking();
	}
}