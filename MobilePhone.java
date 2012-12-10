/**
*Ex11x1; Ex11x2; Ex11x3; Ex11x4
*10th December 2012 - Created
*/
public class MobilePhone extends OldPhone
{
	private String[] savedList = new String[10];

	public MobilePhone(String mbrand)
	{
		super(mbrand);
	}


	public void call(String number)
	{
		super.call(number);
		saveNo(number);
	}

	public void ringAlarm(String ringtone)
	{
		System.out.println("Alarm ringing: " + ringtone);
	}

	public void playGame(String game)
	{
		System.out.println("Playing " + game);
	}

	public void saveNo(String number)
	{
		for (int i = 9; i > 0; i--)
		{
			savedList[i] = savedList[i-1];
		}
			savedList[0] = number;
	}

	public void printLastNumbers()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println(savedList[i]);
		}
	}
}