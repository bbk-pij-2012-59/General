String str=""
print "Please input a number "
str = System.console().readLine()
int num = Integer.parseInt(str)
boolean prime = true
int x = 2
while (x<num) {
		if (num % x == 0) {
			prime = false
		}
		x=x+1
}
if (prime) {
	println "Your number (" +num+ ") appears to be a prime number"
}else{
	println "Your number (" +num+ ") is not a prime"
}