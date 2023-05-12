/** 
 * 
 * @author: THiago
 * 
 * */
import javax.swing.JOptionPane;


public class First {
	public int var1 = 1;
	// Understand static methods and why it works 
	public static void main(String[] args) {
		// Variable
		int a =1;
		double b =1.7;
		
		int c = (int)b; //explicit conversion
		double result = (1+2+7)/3.0; //implicit conversion;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(result);
		
		final double PI = 3.1415926;
		// PI = 15; = Cannot modify the variable similar to Const in javascript
		double perimeter = 2*5*PI;
		//  Variables can start with letters or underscore and contain numbers
		//, but not start with numbers or use reserved keywords like class

		// TODO Auto-generated method stub
		//System.out.println("Test myMethod1 "+ myMethod1(a,b));
		//System.out.println("Test myMethod1 "+ myMethod2(1,2));
		
		int var1 = 10;
		JOptionPane.showMessageDialog(null,var1);
		
		
		
	}
	public void dummy() {
		int var1 =5; 
	}
	
	public static int myMethod1 (int a, int b)
	{
		return a+b;
	}
	
	public int myMethod2(int a, int b) {
		return a+b;
	}

}
