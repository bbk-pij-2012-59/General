//Ex7x5x2
//Created 15th November 2012
public class MapRW implements SimpleMap
{

	private String[] maparray = new String[1000];

	public String put(int key, String name)
	//Puts a new String in the map.
	//If the key is already in the map, nothing is done.
	{
		//if (maparray[key].equals("null"))
		//NullPointerException here
		//{
			maparray[key] = name;
			return "Done";
		//}
		//else
		//{
		//	return "Not done";
		//}
	}

	public String get(int key)
	//Returns the name associated with that key, or null if there is none.
	{
		//if (maparray[key].equals("null"))
		//NullPointerException here
		//{
			//return "null";
		//}
		//else
		//{
			return maparray[key];
		//}
	}

	public void remove(int key)
	/**
	* Removes a name from the map. Future calls to get(key)
	* will return null for this key unless another
	* name is added with the same key.
	*/
	{
		if (!maparray[key].equals(null))
		{
			maparray[key] = null;
			return;
		}
	}

	public boolean isEmpty()
	//			* Returns true if there are no workers in the map, false otherwise
	{
		for (int i = 0; i < 1000; i++)
		{
			if (!maparray[i].equals(null))
					{
						return false;
					}
		}
		return true;
	}

	public static void main (String[] args)
	{
	MapRW map1 = new MapRW();
	map1.run();
	}

	private void run()
	{
		System.out.print ("Give me a string and I will see if I can map it: ");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		String result1 = put(smallHash, str);
		System.out.println(result1 + " using key " + smallHash);

		System.out.println ("Now I will retrieve the mapped information");
		String result2 = get(smallHash);
		System.out.println(result2);

		System.out.println ("Now I will remove the mapped information");
		remove(smallHash);

		System.out.println ("Let's double check that I have removed the mapped information");
		String result3 = get(smallHash);
		System.out.println("Key " + smallHash + " links to " + result3);
	}
}

