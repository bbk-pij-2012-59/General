/**
*Ex12x3
*File 3 of (probably) 4
*10th January 2013 - Created (based on PatientDoubleLink)
* Compiles, as long as I don't try to implement!
*The implementation for doubly-linked generic lists
*/

public class DoubleListGenericElement<T> //implements DoubleListGenericInterface<T>
{

	private T value;
	private DoubleListGenericElement<T> nextElement;
	private DoubleListGenericElement<T> previousElement;

	/**
	*constructor - creates a new element of a generic doubly-linked list
	*@param value the value held in the new element
	*/
	public DoubleListGenericElement(T value)
	{
		this.value = value;
		this.nextElement = null;
		this.previousElement = null;
	}

	/**
	*Adds a new element to the generic doubly-linked list
	*@param newElement - the element to be added
	*/
	public void addElement(DoubleListGenericElement<T> newElement)
	{
		if (this.nextElement == null)
		{
			// this means this is the last element in the list
			this.nextElement = newElement;
			this.nextElement.previousElement = this;
		}
		else
		{
			this.nextElement.addElement(newElement);
		}

	}

	/**
	*Deletes a element from the generic doubly-linked list
	*@param oldElement - the element to be deleted
	*@return true if the element was found and removed, false otherwise
	*/
	public boolean deleteElement(DoubleListGenericElement<T> oldElement)
	{
		if (this.nextElement == null)
		{
			return false;
		}
		else if (this.nextElement.equals(oldElement))
		{
			this.nextElement = nextElement.nextElement;
			nextElement.nextElement.previousElement = this;
			return true;
		}
		else
		{
			return this.nextElement.deleteElement(oldElement);
		}
	}

	/**
	*@return the value held in one particular element
	*@param currentElement - the element of interest
	*/
	public T returnValueOfElement(DoubleListGenericElement<T> currentElement)
	{
		if (this == null)
		{
			return null;
		}
		else if (this.equals(currentElement))
		{
		return this.value;
		}
		else
		{
			this.nextElement.returnValueOfElement(currentElement);
			return null;
		}
	}

}