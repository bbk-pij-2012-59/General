//Ex15x1
//28th January 2013 - Created
import java.util.List;
import java.util.ArrayList;

public class TestEx15x1x6
{
	public static void main(String[] args)
	{
		TestEx15x1x6 test = new TestEx15x1x6();
		test.launch(6);
	}

	public void launch(int userInput)
	{
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);

		try
		{
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		}
		catch (IndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
	}
}
