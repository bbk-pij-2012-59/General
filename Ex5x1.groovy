//Ex5x1
Calculator compute = new Calculator()
String str;
int i1, i2, i3;
Boolean exitcmd = false;
System.out.print("Enter an integer: ");
str = System.console().readLine();
i1 = Integer.parseInt(str);
System.out.print("Enter another integer: ");
str = System.console().readLine();
i2 = Integer.parseInt(str);
System.out.println("Options:");
System.out.println("To add the second integer to the first integer, enter 1");
System.out.println("To subtract the second integer from the first integer, enter 2");
System.out.println("To multiply the first integer by the second integer, enter 3");
System.out.println("To divide the first number by the second number, enter 4");
System.out.println("To find the remainder when the first integer is divided by the second integer, enter 5");
System.out.println("To exit, enter any other single digit");
while (!exitcmd)
{	
	System.out.print("Your choice? ")
	str = System.console().readLine();
	i3 = Integer.parseInt(str);
	switch (i3)
	{
	case 1:
		compute.add(i1,i2);
		break;
	case 2:
		compute.subtract(i1,i2);
		break;
	case 3:
		compute.multiply(i1,i2);
		break;
	case 4:
		compute.divide(i1,i2);
		break;
	case 5:
		compute.modulus(i1,i2);
		break;
	default:
		System.out.println "Bye!"
		exitcmd=true
	}
}
