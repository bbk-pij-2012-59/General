println "Here is a list of all the primes less than 1000"
int x=1, z=0
while (x<=1000)
{
	boolean prime = true
	int y=2
	while (y<=(x/2))
	{
		if (x % y == 0)
		{
			prime = false
		}
	y=y+1
	}
	if (prime)
	{
		print x + ", "
		z=z+1
	}
	x=x+1
}
println ""
println "That's it - " +z+ " prime numbers less than a thousand" 
