//Not properly thought through yet!
 
print "What number would you like to know the nearest prime to? "
String str = System.console().readLine()
int num = Integer.parseInt(str)
boolean originalnumber=true, lowernumber=true, highernumber=true
int counter1=2, counter2=2, counter3=2, higher=0, lower=0
 
// First check if integer provided is, itself, a prime number
 
while (counter1<=(num/2))
{
 	while (originalnumber)
 	{
  		if (num % counter1 ==0)
  		{
  			originalnumber=false
  		}
 	}
 counter1 = counter1 + 1
}
 
if (!originalnumber)
{
	// Secondly, find the next higher integer that is a prime number
	higher = num + 1
	while (higher < 2*num)
	{
 		counter2=2
 		while (counter2<=higher/2)
 		{
  			while (highernumber)
  			{
   				if (higher % counter2 ==0)
   				{
    					highernumber=false
   				}
  			}
  			counter2 = counter2 + 1
 		}
 		higher = higher + 1
 		highernumber=true
	}

	//Thirdly, find the next lower integer that is a prime number
	lower = num - 1
	while (lower >0)
	{
		counter3=2
 		while (counter3<=lower/2)
 		{
  			while (lowernumber)
  			{
   				if (lower % counter3 ==0)
   				{
    					lowernumber=false
   				}
  			}
  			counter3 = counter3 + 1
 		}
 		lower = lower - 1
 		lowernumber=true
	}
}
 
//Finally, decide what integer(s) to print 
if (originalnumber)
{
 	println "The number that you provided (" + num + ") is, itself, prime"
}
else if (highernumber || lowernumber)
{
 	if ((higher - num) > (num - lower))
 	{
  		println "The nearest prime number to the number that you provided (" + num + ") is " + lower
 	}
 	else if ((num - lower) > (higher - num))
 	{
  		println "The nearest prime number to the number that you provided (" + num + ") is " + higher
 	}
 	else if ((higher - num) == (num - lower))
 	{
  		println "The nearest prime numbers to the number that you provided (" + num + ") are " + lower + " and " + higher
 	}
}
else
{
 	print "Problem! Can't find nearest prime to the number that you provided (" + num
}
 
 