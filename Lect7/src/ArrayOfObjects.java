import java.util.Arrays;
public class ArrayOfObjects {
	public static void main(String args[]) {
		Vehicle[] cars = new Vehicle[3];
 		
		int price = 0;
		int millage = 0;
		
		 for(int i=0;i<cars.length;i++) {
			 price = 10000+(int)(Math.random()*15000);
			 millage = 10+(int)(Math.random()*10000);
			 cars[i] = new Vehicle(price,millage);
		 }
		 
		 displayVehicle(cars);
		 Arrays.sort(cars,new MyComparator());
		 ////Arrays.sort(cars); DOES NOT WORK 
		 displayVehicle(cars);
	}
	public static void displayVehicle(Vehicle[] cars) {
		for(int i=0;i<cars.length;i++) {
			System.out.print(cars[i].price+","+cars[i].millage+" ");
		}
	}
}
