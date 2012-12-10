String str=""
boolean finished=false
print "Please enter your first number: "
str = System.console().readLine()
int max = Integer.parseInt(str)
while (!finished) {
	print "please enter your next number (-1 to end): "
	str = System.console().readLine()
	int num2 = Integer.parseInt(str)
	if (num2==-1) {
		finished=true
	}else if (num2>max){
		max=num2
	}
}
println "The largest number you entered was: "+max

		
	
		
