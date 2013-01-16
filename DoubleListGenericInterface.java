/**
*Ex12x3
*File 1 of (probably) 4
*10th January 2013 - Created (based on PatientDoubleLink)
* The interface for doubly-linked generic lists
*/

public interface DoubleListGenericInterface<T>
{
	void addElement(DoubleListGenericInterface<T> newElement);
	boolean deleteElement(DoubleListGenericInterface<T> oldElement);
	T returnValueOfElement(DoubleListGenericInterface<T> currentElement);
}
