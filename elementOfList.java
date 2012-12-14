public class elementOfList
//compiles OK
{
	private int elementValue;
	private elementOfList nextElement;

	public elementOfList(int num)
	{
		this.elementValue = num;
		this.nextElement = null;
	}

	public int getValue()
	{
		return this.elementValue;
	}

    public void setValue(int n)
	{
		this.elementValue = n;
		return;
	}

    public elementOfList getNext()
    {
	  return this.nextElement;
    }

    public void setNext(elementOfList elementToBeNext)
    {
	  this.nextElement = elementToBeNext;
    }

	public void addElement(elementOfList elementToBeAdded)
	{
	if (this.nextElement == null)
		{
			this.nextElement = elementToBeAdded;
		}
		else
		{
			this.nextElement.addElement(elementToBeAdded);
		}
	}

	public void printList (elementOfList elementToBePrinted)
	{
		System.out.print(this.elementValue);
		if (this.nextElement == null)
		{
			System.out.println("");
			return;
		}
		else
		{
			this.nextElement.printList(nextElement);
		}
	}

}

