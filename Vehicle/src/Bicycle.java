import javax.swing.*;

public class Bicycle extends Vehicle{

	public Bicycle(String powerSource, int wheels, int price) {
		super(powerSource, wheels, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
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
		result = result + "It is powered by " + powerSource+ "\n";
		result = result + "It has " + getWheels()+ "wheels "+"\n";
		result = result + "The price is: " + this.price;
		return result;
				
	}
	
}
