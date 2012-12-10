//Ex9x2
//26th November 2012 - Created

import org.junit.*;
import static org.junit.Assert.*;

public class TestHashUtilities
{
	@Test
	public void testsHashUtilities()
	{
		for (int i = 1; i <= 2000; i++)
		{
			int j = 0, k = 0;
			j = (int) Math.random();
			k = HashUtilities.shortHash(j);
			assertTrue(k >= 0 && k <=1000);
		}
	}
}

