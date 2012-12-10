//Ex3x6
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
	match = true
	for (int j = 0; j<=(lenshortstr-1); j++)
	{
		if (shortstr.charAt(j) != longstr.charAt(i+j))
		{
			match = false
		}
//	println "i="+i+" j="+j+" match="+match+" count="+count
	}
	if (match)
	{
		count++
	}
}

println "The short string (" + shortstr + ") occurs " + count + " times in your text."

