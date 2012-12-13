/**
*Ex11x1; Ex11x2; Ex11x3; Ex11x4
*10th December 2012 - Created
*/
public class SmartPhone extends MobilePhone
{

	public SmartPhone(String spbrand)
	{
		super(spbrand);
	}

	public void call(String number)
	{
		if (number.substring(0,1).equals("00"))
			{
				System.out.println("Calling " + number + " through the internet to save money");
			}
			else
			{
				super.call(number);
			}
	}

	public void browseWeb(String url)
	{
		System.out.println("Browsing page " + url);
	}

	public String findPosition()
	{
		return "Location 123456";
	}


}