public class Matrix
{
	//In progress
int [][] matrixx;

	public Matrix(int x, int y)
	//constructor method setting the size of the array as two integers (not necessarily the same and initialising all elements in the array to 1
	{
		matrixx = new int [x][y];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				matrixx[i][j] = 1;
			}
		}
	}

	public void setElement(int x, int y, int e)
	//modifies one element of the array, given its position as two integers and the value to be put in that position
	//must check that the indeces are valid before modifying the array to avoid an IndexOutOfBoundsException
	//if the indeces are invalid, the method will do nothing and the third argument will be ignored
	{
		if (x <= (matrixx.length-1) && y <= (matrixx[0].length-1))
		{
			matrixx[x][y] = e;
		}
	}

	public void setRow(int y, String newXvalues)
	//modifies one whole row of the array, given its position as an integer and the list of numbers as a String (e.g. “1,2,3”)
	//must check that the index is valid and the numbers are correct (i.e. if the array has three columns, the String contains three numbers)
	//if the index or the String is invalid, the method will do nothing
	{
		//Is there a row y?
		if (y >= 0 && y <= (matrixx[0].length-1))
		{
			//count the number of commas in newXvalues
			int ncomma = 0;
			for (int n = 1; n < newXvalues.length()-1; n++)
			{
				if ((newXvalues.charAt(n)) == ',')
				{
					ncomma++;
				}
			}
			//if there are the correct number of values, put them into the array
			if (matrixx.length == ncomma + 1)
			{
				int i = 0;
				int j = 0;
				for (int k = 0; k < newXvalues.length(); k++)
				{
					while (i < matrixx.length - 1)
					{
						if ((newXvalues.charAt(k)) == ',')
						{
							matrixx[i][y] = Integer.parseInt(newXvalues.substring(j,k));
							i++;
							j = k + 1;
						}
					}
				}
				matrixx[matrixx.length-1][y] = Integer.parseInt(newXvalues.substring(j,newXvalues.length()-1));
			}
		}
	}

	public void setColumn( int x, String newYvalues)
	//modifies one whole column of the array, given its position as an integer and the list of numbers as a String (e.g. “1,2,3”)
	//must check that the index is valid and the numbers are correct (i.e. if the array has four rows, the String contains four numbers)
	//if the index or the String is invalid, the method will do nothing
	{
		//Is there a column x?
		if (x >= 0 && x <= (matrixx.length-1))
		{
			//count the number of commas in newXvalues
			int ncomma = 0;
			for (int n = 1; n < newYvalues.length()-1; n++)
			{
				if ((newYvalues.charAt(n)) == ',')
				{
					ncomma++;
				}
			}
			//if there are the correct number of values, put them into the array
			if (matrixx[0].length == ncomma + 1)
			{
				int i = 0;
				int j = 0;
				for (int k = 0; k < newYvalues.length(); k++)
				{
					while (i < matrixx[0].length - 1)
					{
						if ((newYvalues.charAt(k)) == ',')
						{
							matrixx[x][i] = Integer.parseInt(newYvalues.substring(j,k));
							i++;
							j = k + 1;
						}
					}
				}
				matrixx[x][matrixx[0].length-1] = Integer.parseInt(newYvalues.substring(j,newYvalues.length()-1));
			}
		}
	}


	public String toString()
	//returns the values in the array as a String using square brackets, commas, and semicolons, (e.g. “[1,2,3;4,5,6;3,2,1]”)
	{
		String arrayAsString = "[";
		for (int i = 0; i < matrixx.length; i++)
		{
			for (int j = 0; j < matrixx[0].length; j++)
			{
				arrayAsString = arrayAsString + matrixx[i][j];
			}
		}
		arrayAsString = arrayAsString + "]";
		return arrayAsString;
	}

	public void prettyPrint()
	//prints the values of the array on screen in a legible format, using the tabulator character ’\t’ (backslash-t)
	{
		for (int i = 0; i < matrixx.length; i++)
		{
			for (int j = 0; j < matrixx[0].length; j++)
			{
				System.out.print(matrixx[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

	public void setMatrix(String loadsOfValues)
	//takes a String representing the numbers to be put in the elements of the array separated by commas, separating rows by semicolons (e.g. "1,2,3;4,5,6;7,8,9")
	{

	}

	public Boolean symmetryCheck()
	//checks whether array is one or two dimensional; if it is then checks whether it is symmetrical
	{
		MatrixChecker checkSym = new MatrixChecker();
			if ((matrixx[0].length) == 0)
		{
			return checkSym.isSymmetrical(matrixx);
		}
		else
		{
			return checkSym.isSymmetrical(matrixx);
		}
	}

	public Boolean triangularCheck()
	//checks whether a two dimensional array is one or two dimensional; if it is then checks whether it is symmetrical
	{
		MatrixChecker checkTri = new MatrixChecker();
		return checkTri.isTriangular (matrixx);
	}

}






