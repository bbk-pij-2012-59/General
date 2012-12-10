//Ex3x7
boolean repeatedletter = false
int countletteroccurance = 0, strlen = 0, countusedletters = 0
String str1 = "",str2 = "", letter = "", usedletter = " "
print "Please write a text: "
str1 = System.console().readLine()
strlen = str1.length()
while (!repeatedletter)
{
	print "Which letter would you like to count now? "
	str2 = System.console().readLine()
	letter = str2.charAt(0)
	countletteroccurance = 0
	for (int i = 0; i<=countusedletters; i++)
	{
		if (letter == usedletter.charAt(i))
		{
			repeatedletter = true
		}
	}

	for (int j = 0; j<=(strlen-1); j++)
	{
		if (str1.charAt(j)==letter)
		{
			countletteroccurance++
		}
	}
	usedletter = usedletter+letter
	countusedletters++
	if (repeatedletter)
	{
		println "Repeated character. Exiting the program..."
		println "Thank you for your cooperation. Good bye!"
	}
	else
	{
		println "There are "+countletteroccurance+" occurances of "+letter+" in your text."
	}
}