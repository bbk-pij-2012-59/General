//Ex4x5 Converts between Binary and Decimal numbers - appears to work!

boolean correctinput = false
int n = 0
String str = ""

void binary2decimal()
{
	println "Please enter your binary number: "
	String str1 = System.console().readLine()
	int strlen1 = str1.length()
	int n1 = 0
	for (int i = strlen1; i>=1; i--)
	{
		if (str1.charAt(i-1) == '1')
		{
			n1 = n1 + Math.pow(2,strlen1-i)
		}
	}
	println str1 + " in binary is equivalent to " + n1 + " in decimal."
	return
}

void decimal2binary()
{
	println "Please enter your decimal number: "
	String str2 = System.console().readLine()
	int n2 = Integer.parseInt(str2)
	String str3 = ""
	while (n2>=1)
	{
		str3 = n2%2 + str3
		n2 = n2/2
	}	
	println str2 + " in decimal is equivalent to " + str3 + " in binary."
	return
}

println "Options:"
println "To convert a binary number to a decimal number, enter 1"
println "To convert a decimal number to a binary number, enter 2"
while (!correctinput)
{	
	str = System.console().readLine()
	n = Integer.parseInt(str)
	switch (n)
	{
	case 1:
		binary2decimal()
		correctinput = true
		break;
	case 2:
		decimal2binary()
		correctinput = true
		break;
	default:
		println "Please enter 1 or 2"
	}
}
