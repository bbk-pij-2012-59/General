int numberToGuess = Math.abs(1000 * Math.random())
println "Try to guess my number!"
println "It's between zero and one thousand)"
boolean correct=false
int guesscount=0
while (!correct)
{
	print "Tell me a number: "
 	String str = System.console().readLine()
 	int guess = Integer.parseInt(str)
 	guesscount=guesscount+1
 	if (guess==numberToGuess)
 	{
  		correct=true
 	}
	else if (guess > numberToGuess)
	{
		println "No! My number is lower."
	}
	else if (guess < numberToGuess)
	{
		println "No! My number is higher."
	}
}
println "CORRECT!"
println "You needed " + guesscount + " guesses to guess that my number was " + numberToGuess + "."