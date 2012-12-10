//Ex7x1
//Created 12/11/2012
//Linked list of objects Person

public class PointerQueue implements PersonQueue
{

	private Person headOfQueue;
	private Person endOfQueue;

	public PointerQueue()
	{
    	headOfQueue = null;
    	endOfQueue = null;
    }

   	public void insert(Person newShopper)
  	{
	  	addNextInQueue(newShopper);
   	}

    public Person retrieve()
    {
	  	if (headOfQueue == null)
	  	{
			return null;
	  	}
	  	else
	  	{
	  	Person served = headOfQueue;
	  	headOfQueue = headOfQueue.getNextInQueue();
	  	return served;
		}
    }

    private void addNextInQueue(Person newShopper)
    {
	  	if (headOfQueue == null)
	  	{
	  		headOfQueue = newShopper;
	  		endOfQueue = newShopper;
		}
		else
		{
			endOfQueue.setNext(newShopper);
			endOfQueue = newShopper;
		}
    }

}
