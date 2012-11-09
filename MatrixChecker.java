//For Ex5x5 - compiles OK
public class MatrixChecker
{

	public boolean isSymmetrical(int array1[])
	{
		for (int i = 0; i <= array1.length/2; i++)
		{
			if (array1[i] != array1[array1.length-(i+1)])
			{
				return false;
			}
		}
	return true;
	}

	public boolean isSymmetrical(int matrix1[][])
	{
		//first check if same number of rows and columns
		if (matrix1.length != matrix1[0].length)
		{
			System.out.println("Number of rows and columns do not match");
			return false;
		}
		else
		{
		//check if elements match
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
		}
		return true;
	}

	public boolean isTriangular(int matrix2[][])
	{
		//first check if same number of rows and columns
		if (matrix2.length != matrix2[0].length)
		{
			System.out.println("Number of rows and columns do not match");
			return false;
		}
		else
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
		}
	return true;
	}
}