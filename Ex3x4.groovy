String str=""
int strlen=0, position=0
println "Please enter some text"
str = System.console().readLine()
strlen = str.length()
position = (strlen - 1)
println "One letter per line using while loops"
while (position >=0)
{
	println str.charAt(position)
	position = (position - 1)
}
println "One letter per line using for loops"
for (int i = (strlen - 1); i>=0; i--)
{
	println str.charAt(i)
}	