/* 
 * 
 * @author: THiago
 * 
 * */

public class First {

	// Understand static methods and why it works 
	public static void main(String[] args) {
		int a =1;
		double b =1.7;
		
		double c = a;
		
		System.out.println(a);
		System.out.println(c);
		
		// TODO Auto-generated method stub
		//System.out.println("Test myMethod1 "+ myMethod1(a,b));
		//System.out.println("Test myMethod1 "+ myMethod2(1,2));
	}
	
	public static int myMethod1 (int a, int b)
	{
		return a+b;
	}
	
	public int myMethod2(int a, int b) {
		return a+b;
	}

}
