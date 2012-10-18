//Ex3x8
boolean palindrome = true
int strlen = 0
String str = ""
print "Please enter your possible palindrome: "
str = System.console().readLine()
strlen = str.length()
for (int i = 0; i<=(strlen/2); i++)
{
	if (str.charAt(i) != str.charAt((strlen-1)-i))
	{
		palindrome = false
	}
}

if (palindrome)
{
	println "Yes, "+str+" is a palindrome."
}
else
{
	println "No, "+str+" is not a palindrome."
}