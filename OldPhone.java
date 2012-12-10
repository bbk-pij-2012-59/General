/**
*Ex11x1; Ex11x2; Ex11x3; Ex11x4
*10th December 2012 - Created
*/
public class OldPhone implements Phone
{

	private String brand = null;

	public OldPhone(String brand)
	{
		this.brand = brand;
	}

	public String getBrand()
	{
	return brand;
	}
	// ... there is no setter for brand

	public void call(String number)
	{
		/**
		* Just print on the screen: "Calling <number>...".
		*/
		System.out.println("Calling " + number);
	}

}