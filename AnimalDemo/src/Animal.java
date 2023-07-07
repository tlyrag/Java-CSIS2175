
public abstract class Animal {

	public String name;
	private int legs;
	
	public Animal(String _name, int legs) {
		this.name = _name;
		//this.legs = _legs;
				
	}
	
	public void setLegs (int _legs) {
		if (_legs <2) {
			this.legs = 2;
		} else {
			this.legs = _legs;
		}
	}
	
	public static void dummy() {
		System.out.println("Dummy");
	}
	
	public abstract void speak();
	
}
