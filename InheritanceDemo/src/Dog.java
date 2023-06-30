
public class Dog extends Animal {

	public Dog() {
		super("Unknow Animal");
		System.out.println("Creating a dog");
	}
	
	public Dog(String name, int size) {
		super(name,size);
	}
	@Override
	public void move() {
		System.out.println("Dog is now running");
		super.location ="New Location";
	}
}
