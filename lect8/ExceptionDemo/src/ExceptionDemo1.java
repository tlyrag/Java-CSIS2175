import javax.swing.*;
public class ExceptionDemo1 {
	
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int result;
		
		String usrInput;
		
		try
		{
			usrInput = JOptionPane.showInputDialog(null,"Pls input the first oprand: ");
			num1 = Integer.parseInt(usrInput);
			
			usrInput = JOptionPane.showInputDialog(null,"Pls input the second oprand: ");
			num2 = Integer.parseInt(usrInput);
			
			result = num1/num2;
		}
		catch(ArithmeticException e)
		{
			JOptionPane.showMessageDialog(null, "Exception: "+ e.getMessage());
			result = 0;
		}
		/*catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Exception: "+ e.getMessage() 
							+"\n"+ e.getStackTrace());
			result =1;
		}*/
		
		JOptionPane.showMessageDialog(null, "the result is " + result);
		
	}
	
	
}
