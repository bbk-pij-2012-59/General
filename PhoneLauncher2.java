/**
*Ex11x1; Ex11x2; Ex11x3; Ex11x4
*10th December 2012 - Original version created
*Ex12x2x2
*7th January 2013 - Amended as per exercise - works
*/
public class PhoneLauncher2
{
	public static void main(String[] args)
	{
		PhoneLauncher2 launcher = new PhoneLauncher2();
		launcher.launch();
	}

	public void launch()
	{
		MobilePhone myphone = new SmartPhone("iPhone");
		myphone.call("020 1111 5000");
		myphone.ringAlarm("Brr, brr");
		myphone.call("020 2222 5000");
		myphone.playGame("Tetris");
		myphone.call("020 3333 5000");
		SmartPhone correctPhoneType = (SmartPhone) myphone;
		correctPhoneType.browseWeb("www.bbk.ac.uk");
		myphone.call("020 4444 5000");
		System.out.println(correctPhoneType.findPosition());
		myphone.call("020 5555 5000");
		System.out.println("My phone is a " + myphone.getBrand());
		myphone.call("00 1 234 5678");
		myphone.printLastNumbers();

	}

}