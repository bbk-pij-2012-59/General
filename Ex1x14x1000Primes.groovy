println "Here is a list of the first thousand primes"
int x=1, z=0
while (z<=1000)
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
println "That's it - one thousand prime numbers less than " +(x+1)
