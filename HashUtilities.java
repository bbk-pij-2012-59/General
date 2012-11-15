//Ex7x5x1
public class HashUtilities
{

	public static int shortHash(int original)
	{
		int newhash = Math.abs(original % 1000);
		return newhash;
	}
}
