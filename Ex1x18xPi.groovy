print "When calculating Pi, how many terms should be added together? "
String str = System.console().readLine()
int termnum = Integer.parseInt(str)
int x=1, y=1
double sum=0
 
while (y<=termnum)
{
	if (y % 2 != 0)
 	{
  		sum=sum+(4/x)
 	}
 	else if (y % 2 == 0)
 	{
  		sum=sum-(4/x)
 	}
	x=x+2
	y=y+1
}
 
println "Pi to " + termnum + " terms is " + sum