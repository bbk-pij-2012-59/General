//For Ex5x6 - in progress - init still to be written, { problem

public class Target
{

	private int [][][] airspace;
	private int [] helicopter;

	public Target(int x)
	{
	//constructor method that creates a 3-D array of integers of the proposed size in all three dimensions. All elements must be set to zero
		airspace = new int [x][x][x];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < x; j++)
			{
				for (int k = 0; k < x; k++)
				{
					airspace[i][j][k] = 0;
				}
			}
		}
	}

	public void init()
	{
	//sets one element, selected randomly, to 1 and all the others to zero.  random integer between 0 and N  int numberToGuess = (int) Math.abs(N * Math.random())
		int copterX = Math.abs((airspace.length-1) * Math.random());
		int copterY = Math.abs((airspace.length-1) * Math.random());
		int copterZ = Math.abs((airspace.length-1) * Math.random());
		airspace[copterX][copterY][copterZ] = 1;
		helicopter = [copterX, copterY, copterZ];//problem here
	}

	public fire(int a,int b,int c)//need return type
	{
		if (airspace[a][b][c] == 1)
		{
			return Result.HIT;
		}
		else if (a > airspace.length || b > airspace[0].length || c > airspace[0][0].length || a < 0 || b < 0 || c < 0)
		{
			return Result.OUT_OF_RANGE;
		}
		else if (a < helicopter[1])
		{
			return Result.FAIL_LEFT;
		}
		else if (a > helicopter[1])
		{
			return Result.FAIL_RIGHT;
		}
		else if (b < helicopter[2])
		{
			return Result.FAIL_LOW;
		}
		else if (b > helicopter[2])
		{
			return Result.FAIL_HIGH;
		}
		else if (c > helicopter[3])
		{
			return Result.FAIL_LONG;
		}
		else if (c < helicopter[3])
		{
			return Result.FAIL_SHORT;
		}
		else
		{
			return
		}//illegal start of expression
	}
}
