class ParentAnimal implements Animal
{
	String name, habitat, sound;

	ParentAnimal(String name, String habitat, String sound)
	{
		this.name = name;
		this.habitat = habitat;
		this.sound = sound;
	}

public void call()
{
	this.makeSound();
	System.out.print(", " + this.name);
	if (this.habitat.equals("air"))
	{
		System.out.println(" now flying, will come later when tired...");
	}
	else if (this.habitat.equals("water"))
	{
		System.out.println(" will not come...");
	}
	else
	{
		System.out.println(" coming...");
	}
}

	public void makeSound()
	{
		System.out.print(this.sound);
	}

	public void reproduce()
	{

	}

}
