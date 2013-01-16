/**
*Ex11x1; Ex11x2; Ex11x3; Ex11x4
*10th December 2012 - Original version created
*Ex12x2x5
*7th January 2013 - Amended as per exercise - works
*/
public class PhoneLauncher4
{
	public void testPhone(Phone anyPhone)
	{
		MobilePhone downcastedPhoneType = (MobilePhone) anyPhone;
		anyPhone.call("020 1111 5000");
		downcastedPhoneType.ringAlarm("Brr, brr");
		anyPhone.call("020 2222 5000");
		downcastedPhoneType.playGame("Tetris");
		anyPhone.call("020 3333 5000");
		/**downcastedPhoneType.browseWeb("www.bbk.ac.uk");*/
		anyPhone.call("020 4444 5000");
		/**System.out.println(downcastedPhoneType.findPosition());*/
		anyPhone.call("020 5555 5000");
		System.out.println("My phone is a " + downcastedPhoneType.getBrand());
		anyPhone.call("00 1 234 5678");
		downcastedPhoneType.printLastNumbers();
	}

	public static void main(String[] args)
	{
		PhoneLauncher4 launcher = new PhoneLauncher4();
		launcher.launch();
	}

	public void launch()
	{
		MobilePhone myoldphone = new MobilePhone("Noxia");
		testPhone(myoldphone);
	}

}