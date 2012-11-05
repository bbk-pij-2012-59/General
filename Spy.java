//Ex6x1: Working!
public class Spy
{
	private static int spyCount = 0;
	private int SpyID = 0;

	public Spy(int SID)
	//constructor method that receives the ID of the spy as an argument, increases spyCount(int) by one, and prints on the screen the ID of this spy plus the total number of spies so far
	{
		spyCount++;
		this.SpyID = SID;
		System.out.println("Latest spy's ID: " + SpyID);
		System.out.println("Current number of spies: " + spyCount);
		// ...
	}

	public static int getNumberOfSpies()
	{
		return spyCount;
	}

	public void die()
	//prints on the screen “Spy XX has been detected and eliminated” (where XX is the spy’s ID), decrements the spy counter and prints on the screen the total number of spies so far
	{
		System.out.println("Spy " + SpyID + " has been detected and eliminated");
		spyCount--;
		System.out.println("Current number of spies: " + spyCount);
	}

	public static void main(String[] args)
	{
	Spy Smith = new Spy(100);
	Spy Jones = new Spy(101);
	Spy Brown = new Spy(102);
	Spy McMac = new Spy(103);
	Spy Ohara = new Spy(104);
	Spy Scott = new Spy(105);
	Spy Chair = new Spy(106);
	Spy BondJ = new Spy(107);
	Scott.die();
	Spy Field = new Spy(108);
	Chair.die();
	Spy Table = new Spy(109);
	Spy Floor = new Spy(110);
	Table.die();
	Floor.die();
	}

}