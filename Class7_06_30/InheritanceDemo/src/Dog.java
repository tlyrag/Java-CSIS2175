
public class Dog extends Animal {
	public String breed;
	
	public Dog(String _breed)
	{		
		super("dummy");
		System.out.println("Creating a dog!");
		breed = _breed;
	}
	
	@Override
	public void Move()
	{
		System.out.println("Dogs are running!");
	}
	
	@Override
	public void Eat()
	{
		super.Eat();
		System.out.println("Where to find the food?");
	}
}
