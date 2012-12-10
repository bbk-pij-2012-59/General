public class ArrayCopier
{
	void copy (int[] src, int[] dst)
	{
		if (src.length < dst.length)
		{
			for (int i = 0; i <= (src.length - 1); i++)
			{
				dst[i] = src [i];
			}
			for (int j = src.length; j <= (dst.length - 1); j++)
			{
				dst[j] = 0;
			}
		}
		else
		{
			for (int k = 0; k <= (dst.length - 1); k++)
			{
				dst[k] = src [k];
			}
		}
	}
}
