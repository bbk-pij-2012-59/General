public class Matrix
{
int [][] matrixx

	public Matrix(int x1, int y1)
	{
		matrixx = new int [x1][y1];
		for (int i1 = 0; i1 < x1; i1++)
		{
			for (int i2 = 0; i2 < y1; i2++)
			{
				maxtrixx[i1][i2] = 1;
			}
		}
	}

	public void setElement(int x2, int y2, int z2)
	{
	if (x2 <= (matrixx.length-1) && y2 <= (matrixx[0].length-1))
	{
		matrixx[x2][y3] = z2;
	}

	public void setRow(int x3, String newYvalues)
	{
		if (x3 >= 0 && x3 <= (matrixx.length-1))
		{
			int temparray[maxtrixx[0].length];
			int i5 = 0
			int i6 = 0

			for int i7 = 0; i7 < newYvalues.length; i7++)
			{
				if ((newYvalues.charAt(i7)) == ',')
				{
					temparray[i5] = Integer.parseInt(newYvalues.substring(i6,i7));
					i5++;
					i6 = i6 + i7 + 1;
				}
			}
			if (i5 =  maxtrixx[0].length
			{
				for (int i8 = 0; i8 < maxtrixx[0].length; i8++)
				{
					matrix[x3][i8] = temparray[i8];
				}
			}
		}

	}

	public void setColumn( int y3, String newXvalues)
	{

	}

	public String toString()
	{
		String arrayAsString = "[";
		for (int i3 = 0; i3 < maxtrixx.length; i3++)
		{
			for (int i4 = 0; i4 < maxtrixx[0].length; i4++)
			{
				arrayAsString = arrayAsString + matrixx[i3][i4];
			}
		}
		arrayAsString = arrayAsString + "]";
			return arrayAsString;
	}

	public void prettyPrint()
	{

	}

}