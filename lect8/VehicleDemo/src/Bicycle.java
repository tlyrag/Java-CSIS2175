import javax.swing.*;
public class Bicycle extends Vehicle {
	public Bicycle()
	{
		super("person",2,200);
		System.out.println("Bicycle constructor!");
	}

	@Override
	public void setPrice(double _price) {
		// TODO Auto-generated method stub
		String usrInput;
		
		System.out.println("Bicycle implementation of setPrice()");
		
		usrInput = JOptionPane.showInputDialog(null, "Enter the price for bicycle");
		price = Integer.parseInt(usrInput);
		if(price>_price)
		{
			price = _price;
		}
	}

	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}
}
