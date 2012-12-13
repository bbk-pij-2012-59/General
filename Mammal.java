class Mammal extends ParentAnimal
{

	Mammal(String name, String habitat, String sound)
	{
		super(name, habitat, sound);
	}

	public void reproduce()
	{
		this.giveBirth();
	}

	public void giveBirth()
	{
		System.out.println(this.name + " has given birth");
	}

}