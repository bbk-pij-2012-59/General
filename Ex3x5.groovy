//Ex3x5
int count = 0, counte = 0, strlen = 0
String str = "",let = ""
print "Please enter some text: "
str = System.console().readLine()
strlen = str.length()
//Counting the letter e
for (int i = 0; i<=(strlen-1); i++)
{
	if (str.charAt(i)=="e")
	{
		counte++
	}
}
println "the letter e occurs "+counte+" times in your text"
//Counting any letter
print "What letter would you like to count? "
let = System.console().readLine()
for (int i = 0; i<=(strlen-1); i++)
{
	if (str.charAt(i)==let)
	{
		count++
	}
}
println "the letter "+let+" occurs "+count+" times in your text"
