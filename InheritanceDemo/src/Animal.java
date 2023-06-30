
public class Animal {
	public String name;
	public int size;
	protected String location;
	
	
	public Animal(String name) {
		this.name = name;
		System.out.println("Creating an Animal without size");
	}
	public Animal(String name, int size) {
		this.name = name;
		this.size= size;
		System.out.println("Creating an Animal with size");
	}
	public void move() {
		System.out.println("Most animals will move");
	}
}
