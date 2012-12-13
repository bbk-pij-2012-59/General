class EggLayer extends ParentAnimal
{

	EggLayer(String name, String habitat, String sound)
	{
		super(name, habitat, sound);
	}

	public void reproduce()
	{
		this.layEggs();
	}

	public void layEggs()
	{
		System.out.println(this.name + " has laid some eggs");
	}

}
