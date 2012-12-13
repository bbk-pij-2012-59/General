/**
*Ex11x6
*10th December 2012 - Created
*/
public class Teacher
{
	private String name;

	public Teacher(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void teach(String lessonName)
	{
		System.out.println(" is teaching " + lessonName);
	}
}