print "How many rows should the pyramid contain? "
String str = System.console().readLine()
int rownum = Integer.parseInt(str)
int number=1, x=1
while (number <=rownum)
{
	while (x<=number)
	{
		print number
  		x=x+1
 	}
 	println ""
 	number=number+1
 	x=1
}