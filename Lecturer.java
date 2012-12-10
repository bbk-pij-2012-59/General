/**
*Ex11x6
*10th December 2012 - Created
*/
public class Lecturer extends Teacher
{

	public Lecturer(String name)
	{
		super(name);
	}

	public void doResearch(String topic)
	{
		System.out.println(" is doing research on " + topic);
	}
}