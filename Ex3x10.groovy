//Ex3x10
boolean palindrome = true
char char1 = ' '
int lenStrAsGiven = 0, lenStrModified = 0
String strAsGiven = "", strModified = ""

print "Please enter your possible palindrome: "
strAsGiven = System.console().readLine()
lenStrAsGiven = strAsGiven.length()

//First remove spaces and punctuation
for (int i = 0; i <= (lenStrAsGiven-1); i++)
{
	char1 = strAsGiven.charAt(i)
	if (Character.isLetter(char1))
	{
		strModified = strModified + Character.toLowerCase(char1)
	}
}

println strModified

//Then test if palindrome
lenStrModified = strModified.length()
for (int j = 0; j <= (lenStrModified/2); j++)
{
	if (strModified.charAt(j)!= strModified.charAt((lenStrModified-1)-j))
	{
		palindrome = false
	}
}

if (palindrome)
{
	println "Yes, " + strAsGiven + " is a relaxed palindrome."
}
else
{
	println "No, " + strAsGiven + " is not a relaxed palindrome."
}