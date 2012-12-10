//Ex7x1
//Created 12/11/2012
/**
 * One person in a dynamic singly-linked list of named people
 */
public class Person
{
    private String name;
    private Person nextInQueue;

    public Person(String txt)
    {
		name = txt;
	  	nextInQueue = null;
    }

    public String getName()
    {
	  	return name;
    }

    public Person getNextInQueue()
    {
	  	return nextInQueue;
    }

    public void setNext(Person next)
    {
		nextInQueue = next;
	}
}