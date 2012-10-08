int score1 = 0, score2 = 0, roundcount = 0
while (score1 < (score2 + 3) && score2< (score1 + 3))
{
 	print "Enter selections (two capital letters - P, R or S): "
 	String str = System.console().readLine()
 	roundcount = roundcount + 1
 	if (str != "PP" && str != "RR" && str != "SS")
 	{
  		if (str == "PR" || str == "RS" || str == "SP")
  		{
   			score1 = score1 + 1
  		} 
  		else if (str == "PS" || str == "RP" || str == "SR")
  		{
   			score2 = score2 + 1
  		}
 	}
}
if (score1 > score2)
{
 	println "First person beats second person in " + roundcount + "rounds, by " + score1 + " to " + score2
}
	else if (score2 > score1)
{
 println "Second person beats first person in " + roundcount + " rounds, by " + score2 + " to " +score1
}