
public abstract class Vehicle {
	public String powerSource;
	private int wheels;
	protected double price;
	
	public Vehicle(String _powerSource,int _wheels, double _price)
	{
		powerSource = _powerSource;
		setWheels(_wheels);
		setPrice(_price);
		System.out.println("Vehcile constructor!");
	}
	
	public void setWheels(int _wheels)
	{
		wheels = _wheels;
	}
	
	public int getWheels()
	{
		return wheels;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public abstract void setPrice(double _price);
	public abstract void Test();
	
}
