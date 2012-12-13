/**
*Ex11x6
*10th December 2012 - Created
*/
public class LecturerLauncher
{
	public static void main(String[] args)
	{
		LecturerLauncher launcher = new LecturerLauncher();
		launcher.launch();
	}

	public void launch()
	{
		Lecturer l1 = new Lecturer("Dr Smith");
		System.out.print("At 10:00, " + l1.getName());
		l1.teach("programming");
		System.out.print("At 16:00, " + l1.getName());
		l1.doResearch("artifical intelligence");


	}

}