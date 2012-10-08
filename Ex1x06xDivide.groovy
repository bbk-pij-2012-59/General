String str=""
print "Please input your first number "
str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please input your second number "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
int num3 = 0
int num4 = num1
while (num4>=num2) {
	num4 = num4 - num2
	num3=num3+1
}

println "Your first number (" +num1+ ") divided by your second number (" +num2+ ") is " +num3+ ", remainder " +num4
