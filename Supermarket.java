//Ex7x1
//Created 12/11/2012

public class Supermarket
{
	private PointerQueue queue = new PointerQueue();

	public void addPerson(Person newPerson)
	{
		queue.insert(newPerson);
	}

	public Person servePerson()
	{
		return queue.retrieve();
	}

	public static void main(String[] args)
	{
		Supermarket megastore = new Supermarket();
		megastore.launch();
	}

	public void launch()
	{
		System.out.println("Shoppers are joining the queue");
		Person queue1 = new Person("Mrs Smith");
		addPerson(queue1);
		Person queue2 = new Person("Mrs Jones");
		addPerson(queue2);
		Person queue3 = new Person("Mrs Brown");
		addPerson(queue3);
		System.out.println("New till has opened; shoppers are being served");
		Person finishedShopper = new Person("");
		while (finishedShopper != null)
		{
			finishedShopper = servePerson();
			if (finishedShopper != null)
			{
				System.out.println(finishedShopper.getName() + " has been served");
			}
		}
			System.out.println("Queue is empty");
	}

 }
