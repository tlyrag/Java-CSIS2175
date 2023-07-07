
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle myBicycle = new Bicycle();
		SailBoat mySailBoat = new SailBoat("Wind",0, 1_000_000);
		InsuredVehicle myCar = new InsuredVehicle("gas",4,150_000);
		
		
		System.out.println("Bicycle: " + myBicycle.powerSource +"  "
				+ myBicycle.getWheels() +"  "+ myBicycle.price);
		
		System.out.println(mySailBoat);
		System.out.println(myCar);
		
		System.out.println("The tax is "+ myCar.CalTax(70));

	}

}
