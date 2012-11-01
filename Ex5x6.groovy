//Ex5x6
//Write a small program that tells the user they must hit a flying target, and then let the user try to find it by
//introducing three indeces. The program should use an object of class Target to know whether the user hit or not,
//and provide feedback accordingly. Here is a sample out of such a program in a space 10x10x10.

String str = "";
int guessX = -1, guessY = -1, guessZ = -1, switchno = 100;
Result realResult
Boolean endgame = false, sensibleAnswer = false, scoreHit = false;

System.out.println("An Afghan rebel helicopter has been spotted in the air near Camp Bastion.");
System.out.println("Your task is to bring it down with artillery fire.");
System.out.println("After each round, an observer will provide feedback.");

while (!endgame)
{
	Target aboveCampBastion = new Target(10);
	aboveCampBastion.init();
	System.out.println("Are you ready? Try to bring the 'copter down!");
	while (!scoreHit)
	{
		System.out.print("Enter a coordinate X: ");
		str = System.console().readLine();
		guessX = Integer.parseInt(str);
		System.out.print("Enter a coordinate Y: ");
		str = System.console().readLine();
		guessY = Integer.parseInt(str);
		System.out.print("Enter a coordinate Z: ");
		str = System.console().readLine();
		guessZ = Integer.parseInt(str);

		//realResult = aboveCampBastion.fire(guessX, guessY, guessZ);
		switchno = aboveCampBastion.fire(guessX, guessY, guessZ);
		
		switch(switchno)
		//switch (realResult)
		{
		//case HIT:
		case 1:
			System.out.println("You hit it! Well done!");
			scoreHit = true;
			break;
		//case FAIL_LEFT:
		case 2:
			System.out.println("You missed! The target is to the right!");
			break;
		//case FAIL_RIGHT:
		case 3:
			System.out.println("You missed! The target is to the left!");
			break;
		//case FAIL_HIGH:
		case 4:
			System.out.println("You missed! The target is lower!");
			break;
		//case FAIL_LOW:
		case 5:
			System.out.println("You missed! The target is higher!");
			break;
		//case FAIL_SHORT:
		case 6:
			System.out.println("You missed! The target is farther!");
			break;
		//case FAIL_LONG:
		case 7:
			System.out.println("You missed! The target is nearer!");
			break;
		//case OUT_OF_RANGE:
		case 8:
			System.out.println("That shot is way out of range. Try harder!");
			break;
		default:
			System.out.println("Undefined Problem!");
		}
	}
	
	while (!sensibleAnswer)
	{
		System.out.println("Would you like to play again?");
		str = System.console().readLine();
		if (str.charAt(0) == "N" || str.charAt(0) == "n")
		{
			sensibleAnswer = true;
			endgame = true;
		}
		else if (str.charAt(0) == "Y" || str.charAt(0) == "y")
		{
		sensibleAnswer = true;
		}
	}
	sensibleAnswer = false;
	scoreHit = false;
}
