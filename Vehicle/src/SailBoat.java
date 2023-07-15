import javax.swing.JOptionPane;

public class SailBoat extends Vehicle{
	public int length;
	public SailBoat(int length,String powerSource, int wheels, int price) {
		super(powerSource, wheels, price);
		// TODO Auto-generated constructor stub
		this.length=length;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		System.out.println("Setting the price of a bicycle");
		String usrInput;
		usrInput = JOptionPane.showInputDialog(null,"Please enter the price");
		int myPrice = Integer.parseInt(usrInput);
		
		if(myPrice>price) {
			this.price = price;
		} else {
			price = myPrice;
		}
		
	}
	@Override
	public String toString(){
		String result = "Bicycle is powered by ";
		result = result + " " + powerSource+ "\n";
		result = result + " " + getWheels()+ "\n";
		result = result + "The price is: " + this.price;
		result = result + "SailBoat length is :" +this.length;
		return result;
				
	}

}
