import javax.swing.JOptionPane;

public class Car extends Vehicle{

	public Car(String _powerSource, int _wheels, double _price) {
		super(_powerSource, _wheels, _price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPrice(double _price) {
		// TODO Auto-generated method stub
		String usrInput;
		
		System.out.println("Car implementation of setPrice()");
		
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
