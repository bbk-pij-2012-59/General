//For Ex5x6 - compiles

public class Target
{

	private int[][][] airspace;
	private int[] helicopter = new int[3];

	public Target(int x)
	{
	//constructor method that creates a 3-D array of integers of the proposed size in all three dimensions and sets all elements to zero
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
	//sets one element, selected randomly, to 1, leaving the rest as zero
		int copterX = (int) Math.abs((airspace.length-1) * Math.random());
		int copterY = (int) Math.abs((airspace.length-1) * Math.random());
		int copterZ = (int) Math.abs((airspace.length-1) * Math.random());
		airspace[copterX][copterY][copterZ] = 1;
		helicopter[0] = copterX;
		helicopter[1] = copterY;
		helicopter[2] = copterZ;
		return;
	}

	//public Result fire(int a,int b,int c)
	public int fire(int a,int b,int c)
	{
	Result whathappened = Result.PROBLEM;
		if (a > airspace.length || b > airspace[0].length || c > airspace[0][0].length || a < 0 || b < 0 || c < 0)
		{

			whathappened = Result.OUT_OF_RANGE;
		}
		else if (airspace[a][b][c] == 1)
		{
			whathappened = Result.HIT;
		}
		else if (a < helicopter[0])
		{
			whathappened = Result.FAIL_LEFT;
		}
		else if (a > helicopter[0])
		{
			whathappened = Result.FAIL_RIGHT;
		}
		else if (b < helicopter[1])
		{
			whathappened = Result.FAIL_LOW;
		}
		else if (b > helicopter[1])
		{
			whathappened = Result.FAIL_HIGH;
		}
		else if (c > helicopter[2])
		{
			whathappened = Result.FAIL_LONG;
		}
		else if (c < helicopter[2])
		{
			whathappened = Result.FAIL_SHORT;
		}
	return whathappened.ordinal()+1;
	//return whathappened;
	}
}
