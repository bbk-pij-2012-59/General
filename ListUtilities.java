public class ListUtilities
{

	private elementOfList firstElement = null;

	public static void makeLinkedList(int[] tempArray, elementOfList tempElement)
	{
		for (int i = 0; i < tempArray.length(); i++)
		{
			tempElement.setValue = tempArray(i);
			tempElement.addElement(tempElement);
		}
	}

	public static void main(String[] args)
	{
		ListUtilities lu = new ListUtilities();
		lu.launch();
	}

	private void launch()
	{
		//need to load array here
		int [] arrayProvided = {1,2,3,4,5,6};
		makeLinkedList (arrayProvided);
		firstElement.printList (firstElement);
	}
}


