import java.util.*;
public class FinallyDemo {
	public static void main(String[] args)
	{
		Scanner input = new  Scanner(System.in);
		int num1, num2, result;
		
		try
		{
			System.out.println("Pls input num1");
			num1 = input.nextInt();
			System.out.println("Pls input num2");
			num2 = input.nextInt();
			
			result = num1/num2;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:  " + e.getMessage());
			result = 0;
		}
		finally
		{
			System.out.println("finally");
			result = 1/0;
			System.out.println("result = "+ result);
		}
		
		System.out.println("result = "+ result);
		System.out.println("end of program");
	}
	
}
