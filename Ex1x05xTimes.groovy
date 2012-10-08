String str=""
print "Please input your first number "
str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please input your second number "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
int num3 = 0
int x = 1
while (x<=num1) {
	num3 = num3 + num2
	x=x+1
}
println "Your first number (" +num1+ ") multipled by your second number (" +num2+ ") equals " +num3
