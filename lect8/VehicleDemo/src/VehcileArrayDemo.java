
public class VehcileArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[5];
		
		for(int i=0;i<vehicles.length;i++)
		{
			if(i%3==0)
			{
				vehicles[i] = new Bicycle();				
			}
			else if (i%3==1)
			{
				vehicles[i] = new SailBoat("wind",0,1_500_000);
			}
			else
			{
				vehicles[i] = new InsuredVehicle("gas", 4, 1_500_000);
				System.out.println(((InsuredVehicle)vehicles[i]).CalTax(70));
			}
		}
	}


}
