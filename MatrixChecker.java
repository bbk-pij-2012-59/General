//For Ex5x5 - compiles OK
public class MatrixChecker
{

	public boolean isSymmetrical(int array1[])
	{
		for (int i = 0; i <= array1.length/2; i++)
		{
			if (array1[i] != array1[array1.length-i])
			{
				return false;
			}
		}
	return true;
	}

	public boolean isSymmetrical(int matrix1[][])
	{
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[0].length; j++)
			{
				if (matrix1[i][j] != matrix1[j][i])
				{
					return false;
				}
			}
		}
		return true;
	}

	public boolean isTriangular(int matrix2[][])
	{
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (matrix2[i][j] != 0)
				{
					return false;
				}
			}
		}
		return true;
	}
}