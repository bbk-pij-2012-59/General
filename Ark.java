class Ark
{
	String owner;

	Ark(String name)
	{
		this.owner = name;
	}

	public static void main(String[] args)
	{
		Ark NoahsArk = new Ark("Noah");
		NoahsArk.launch();
	}

	public void launch()
	{
		Mammal bear1 = new Mammal("Bertha the bear", "land", "Growl");
		EggLayer beetle1 = new EggLayer("Bettie the beetle", "air", "Drone");
		Mammal cat1 = new Mammal("Clara the cat", "land", "Meow");
		EggLayer crocodile1 = new EggLayer("Chrissie the crocodile", "land", "Snap");
		Mammal dog1 = new Mammal("Dora the dog", "land", "Woof");
		Mammal dolphin1 = new Mammal("Drusila the dolphin", "water", "Whistle");
		EggLayer eagle1 = new EggLayer("Evie the eagle", "air", "Scream");
		EggLayer fly1 = new EggLayer("Flossie the fly", "air", "Buzz");
		EggLayer frog1 = new EggLayer("Freddie the frog", "land", "Croak");
		EggLayer lizard1 = new EggLayer("Lizzie the lizard", "land", "Hiss");
		Mammal monkey1 = new Mammal("Marcia the monkey", "land", "Gibber");
		EggLayer pigeon1 = new EggLayer("Pattie the pigeon", "air", "Coo");
		Mammal reindeer1 = new Mammal ("Rudolph the reindeer", "air", "Bellow");
		EggLayer salmon1 = new EggLayer("Susie the salmon", "water", "[Silence]");
		EggLayer shark1 = new EggLayer("Sammie the shark", "water", "[Silence]");
		EggLayer snake1 = new EggLayer("Sophie the snake", "land", "Hiss");
		Mammal whale1 = new Mammal("Wilhelmina the whale", "water", "Click");

		System.out.println("");
		System.out.println("Before the Flood, " + this.owner + " builds an Ark and summons the animals");
		System.out.println("");
		bear1.call();
		beetle1.call();
		cat1.call();
		crocodile1.call();
		dog1.call();
		dolphin1.call();
		eagle1.call();
		fly1.call();
		frog1.call();
		lizard1.call();
		monkey1.call();
		pigeon1.call();
		reindeer1.call();
		salmon1.call();
		shark1.call();
		snake1.call();
		whale1.call();

		System.out.println("");
		System.out.println("After the Flood, the animals leave the Ark and multiply");
		System.out.println("");
		bear1.reproduce();
		beetle1.reproduce();
		cat1.reproduce();
		crocodile1.reproduce();
		dog1.reproduce();
		dolphin1.reproduce();
		eagle1.reproduce();
		fly1.reproduce();
		frog1.reproduce();
		lizard1.reproduce();
		monkey1.reproduce();
		pigeon1.reproduce();
		System.out.println(reindeer1.name + " is immortal");
		salmon1.reproduce();
		shark1.reproduce();
		snake1.reproduce();
		whale1.reproduce();
	}

}
