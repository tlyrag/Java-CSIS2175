
public abstract class Vehicle {
	public String powerSource;
	private int wheels;
	protected int price;
	
	public Vehicle(String powerSource, int wheels, int price) {
		this.powerSource = powerSource;
		this.wheels = wheels;
		setPrice(price);
	}
	
	public abstract void setPrice(int price);
	
	public int getPrice() {
		return this.price;
	}
	public int getWheels() {
		return this.wheels;
	}
	
}
