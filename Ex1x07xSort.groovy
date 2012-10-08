String str=""
print "Please input your first number "
str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please input your second number "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
print "Please input your second number "
str = System.console().readLine()
int num3 = Integer.parseInt(str)
int low=0
int med=0
int hig=0
if (num1>num2 && num1>num3 && num2>num3){
	hig=num1
	med=num2
	low=num3
}else if (num1>num2 && num1>num3 && num3>num2){
	hig=num1
	med=num3
	low=num2
}else if (num2>num1 && num2>num3 && num1>num3){
	hig=num2
	med=num1
	low=num3
}else if (num2>num1 && num2>num3 && num3>num1){
	hig=num2
	med=num3
	low=num1
}else if (num3>num1 && num3>num2 && num1>num2){
	hig=num3
	med=num1
	low=num2	
}else if (num3>num1 && num3>num2 && num2>num1){
	hig=num3
	med=num2
	low=num1
}

println "Your numbers, in increasing order, are: "
println low
println med
println hig
