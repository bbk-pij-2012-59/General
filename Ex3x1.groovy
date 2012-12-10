String  str=""
boolean correctchoice = false
double answer=0
print "Please input your first number: "
str = System.console().readLine()
double num1 = Double.parseDouble(str)
print "Please input your second number: "
str = System.console().readLine()
double num2 = Double.parseDouble(str)
println "For addition, please enter 1"
println "For subtraction, please enter 2"
println "For multiplication, please enter 3"
println "For division, please enter 4"
while (!correctchoice)
{
	print "Which operation would you like to use? "
	str = System.console().readLine()
	if (str=="1" || str=="2" || str=="3" || str=="4")
	{
	correctchoice=true
	}
}
int opchoice = Integer.parseInt(str)
switch (opchoice)
{
case 1:
answer = num1 + num2
break;
case 2:
answer = num1 - num2
break;
case 3:
answer = num1 * num2
break;
case 4:
answer = num1 / num2
break;
default:
println "There's a problem here"
break;
}
println "The answer is: " + answer


