/**
*Ex11x1; Ex11x2; Ex11x3; Ex11x4
*10th December 2012 - Created
*/
public class PhoneLauncher
{
	public static void main(String[] args)
	{
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch()
	{
		SmartPhone myphone = new SmartPhone("iPhone");
		myphone.call("020 1111 5000");
		myphone.ringAlarm("Brr, brr");
		myphone.call("020 2222 5000");
		myphone.playGame("Tetris");
		myphone.call("020 3333 5000");
		myphone.browseWeb("www.bbk.ac.uk");
		myphone.call("020 4444 5000");
		System.out.println(myphone.findPosition());
		myphone.call("020 5555 5000");
		System.out.println("My phone is a " + myphone.getBrand());
		myphone.call("00 1 234 5678");
		myphone.printLastNumbers();

	}

}