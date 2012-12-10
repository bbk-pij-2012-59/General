String str=""
int strlen=0, j=0
println "Please enter some text"
str = System.console().readLine()
strlen = str.length()
println "One letter per line using while loops"
while (j <= (strlen-1))
{
	println str.charAt(j)
	j = (j + 1)
}
println "One letter per line using for loops"
for (int i = 0; i <= (strlen - 1); i++)
{
	println str.charAt(i)
}
println "One word per line using for loops"
for (int i = 0; i <= (strlen-1); i++)
{
	if (str.charAt(i) == " ")
	{
		println ""
	}
	else
	{
		print str.charAt(i)
	}
}