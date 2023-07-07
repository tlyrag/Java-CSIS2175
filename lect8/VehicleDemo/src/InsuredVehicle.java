
public class InsuredVehicle extends Car implements Insured,Commercial{

	public double insuredAmt;

	
	public InsuredVehicle(String _powerSource, int _wheels, double _price) {
		super(_powerSource, _wheels, _price);
		setCoverage();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setCoverage() {
		// TODO Auto-generated method stub
		insuredAmt = price*(1+REBATE_RATE);
	}

	@Override
	public double getCoverage() {
		// TODO Auto-generated method stub
		return insuredAmt;
	}
	
	@Override
	public String toString()
	{
		return "Car power source is " + powerSource + "\n"
				+"The number of wheels is "+ getWheels()  
				+"\nThe price is " + price
				+"\nInsured Amt is "+ insuredAmt;
	}

	@Override
	public double CalTax(double price) {
		// TODO Auto-generated method stub
		return price * TAX_RATE;
	}

}
