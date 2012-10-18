//Ex3x9
int strlen = 0
String str = ""
print "Please enter some text: "
str = System.console().readLine()
strlen = str.length()
print str
for (int i = (strlen-1); i>=0; i--)
{
	print str.charAt(i)
}