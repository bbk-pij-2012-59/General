public class Matrix
{
	//In progress
private int [][] matrixx;

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

	public void setRow(int x, String newYvalues)
	//modifies one whole row of the array, given its position as an integer and the list of numbers as a String (e.g. “1,2,3”)
	//must check that the index is valid and the numbers are correct (i.e. if the array has three columns, the String contains three numbers)
	//if the index or the String is invalid, the method will do nothing
	{
		//Is there a row x?
		if (x >= 0 && x < (matrixx.length))
		{
			//count the number of commas in newYvalues
			int ncomma = 0;
			for (int n = 1; n < newYvalues.length(); n++)
			{
				if ((newYvalues.charAt(n)) == ',')
				{
					ncomma++;
				}
			}
			//if there are the correct number of values, put them into the array
			if (matrixx[x].length != ncomma + 1)
			{
				System.out.println("Number of columns and number of new values do not match");
			}
			else
			{
				int i = 0, k = 0;
				while (i < ncomma)
				{
					if ((newYvalues.charAt(k)) == ',')
					{
						matrixx[x][i] = Integer.parseInt(newYvalues.substring(0,k));
						newYvalues = newYvalues.substring(k + 1);
						i++;
					}
					else
					{
						k++;
					}
				}
				matrixx[x][ncomma] = Integer.parseInt(newYvalues);
			}
		}
	}

	public void setColumn( int y, String newXvalues)
	//modifies one whole column of the array, given its position as an integer and the list of numbers as a String (e.g. “1,2,3”)
	//must check that the index is valid and the numbers are correct (i.e. if the array has four rows, the String contains four numbers)
	//if the index or the String is invalid, the method will do nothing
	{
		//Is there a column y?
		if (y >= 0 && y < (matrixx[0].length))
		{
			//count the number of commas in newXvalues
			int ncomma = 0;
			for (int n = 1; n < newXvalues.length(); n++)
			{
				if ((newXvalues.charAt(n)) == ',')
				{
					ncomma++;
				}
			}
			//if there are the correct number of values, put them into the array
			if (matrixx.length != ncomma + 1)
			{
				System.out.println("Number of rows and number of new values do not match");
			}
			else
			{
				int j = 0, k = 0;
				while (j < ncomma)
				{
					if ((newXvalues.charAt(k)) == ',')
					{
						matrixx[j][y] = Integer.parseInt(newXvalues.substring(0,k));
						newXvalues = newXvalues.substring(k + 1);
						j++;
					}
					else
					{
					k++;
					}
				}
				matrixx[ncomma][y] = Integer.parseInt(newXvalues);
			}
		}
	}


	public String toString()
	//returns the values in the array as a String using square brackets, commas, and semicolons, (e.g. “[1,2,3;4,5,6;3,2,1]”)
	{
		String arrayAsString = "[";
		for (int i = 0; i < matrixx.length; i++)
		{
			for (int j = 0; j < matrixx[0].length-1; j++)
			{
				arrayAsString = arrayAsString + matrixx[i][j] + ", ";
			}
			arrayAsString = arrayAsString + matrixx[i][matrixx[0].length-1] + "; ";
		}
		arrayAsString = arrayAsString.substring(0, arrayAsString.length()-2) + "]";
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

	//public void setMatrix(String loadsOfValues)
	public Matrix(String loadsOfValues)
	//takes a String representing the numbers to be put in the elements of the array separated by commas, separating rows by semicolons (e.g. "1,2,3;4,5,6;7,8,9")
	{
		//find the semicolons (i.e. the number of rows) in loadsOfValues
		int possemi = 0;
		for (int p = 1; p < loadsOfValues.length()-1; p++)
		{
			if ((loadsOfValues.charAt(p)) == ';')
			{
				possemi++;
			}
		}
		System.out.println(possemi);
		//Split out first row
		String firstrow = "", nextrow = "", whatisleft = "";
		int k = 0;
		Boolean foundsemicolon = false;
		while (!foundsemicolon)
		{
			if ((loadsOfValues.charAt(k)) == ';')
			{
				firstrow = loadsOfValues.substring(0,k);
				whatisleft = loadsOfValues.substring(k + 1) + ";";
				foundsemicolon = true;
				System.out.println(loadsOfValues + firstrow + whatisleft);
			}
			else
			{
				k++;
			}
		}
		//count the number of commas in firstrow
		int ncomma = 0;
		for (int n = 1; n < firstrow.length(); n++)
		{
			if ((firstrow.charAt(n)) == ',')
			{
				ncomma++;
			}
		}
		//now we know how big an array to make
		Matrix myMatrixx = new Matrix(possemi + 1, ncomma + 1);
		//take the first row and replace with new data
		myMatrixx.setRow((0),firstrow);
		//repeat for the rest of the rows
		for (int i = 1; i <=possemi; i++)
		{
		int j = 0;
		foundsemicolon = false;
		while (!foundsemicolon)
			{
				if ((whatisleft.charAt(j)) == ';')
				{
					nextrow = whatisleft.substring(0,j);
					whatisleft = whatisleft.substring(j + 1);
					myMatrixx.setRow((i),nextrow);
					foundsemicolon = true;
					System.out.println(nextrow + whatisleft);
				}
				else
				{
					j++;
				}
			}
		}
	myMatrixx.prettyPrint();
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






