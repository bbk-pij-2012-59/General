boolean finished = false, goingup = true
print "Please enter first number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
while (!finished)
{
 	print "Please enter another number (minus one to end): "
 	str = System.console().readLine()
 	int num2 = Integer.parseInt(str)
 	if (num2 == -1) 
 	{
  		finished = true
 	} 
 	else if (num2 != num1+1) 
 	{
 		goingup = false
 	}
 	num1=num2
}
if (goingup)
{
 	println "Yes, your numbers were consecutive and increasing"
}
else
{
	println "No, your numbers were not consecutive and increasing"
}