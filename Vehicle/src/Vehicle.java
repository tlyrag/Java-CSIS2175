
public abstract class Vehicle {
	public String powerSource;
	protected int wheels;
	private int price;
	
	public Vehicle(String powerSource, int wheels, int price) {
		this.powerSource = powerSource;
		this.wheels = wheels;
		setPrice(price);
	}
	
	public abstract void setPrice(int price);
}
