//Ex3x6
//Not working - in an infinite loop
boolean match = true
int count = 0, lenshortstr = 0, lenlongstr = 0
String shortstr = "", longstr = ""
print "Please enter your short string: "
shortstr = System.console().readLine()
lenshortstr = shortstr.length()
print "Please enter your longer text: "
longstr = System.console().readLine()
lenlongstr = longstr.length()

for (int i = 0; i<=(lenlongstr-lenshortstr); i++)
{
	while (match)
	{
		for (int j = 0; j<=(lenshortstr-1); j++)
		{
		
			if (shortstr.charAt(j) != longstr.charAt(i+j))
			{
				match = false
			}
		}
		if (match)
		{
			count++
		}
	}
	match = true
}

println "The short string " + shortstr + " occurs " + count + " times in your text."
