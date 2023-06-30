
public class Animal {
	public String name;
	public int size;
	
	public Animal(String _name)
	{
		System.out.println("Creating an animal!");
		name = _name;
	}
	
	public void Move()
	{
		System.out.println("Animal can move");
	}
	public void Eat()
	{
		System.out.println("Find the food first!");
	}
	
	//public abstract int Work();
}
