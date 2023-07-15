import java.util.Scanner;
public class ExceptionDemo1 {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		int num1,num2,result;
		num1 = 1;
		num2=2;
		
		
		try {		
			System.out.println("Please enter an integer");
			num1 = input.nextInt();
			System.out.println("Please enter another integer");
			num2 = input.nextInt();
			if(num2 ==0) {
				throw new Exception("Error happened");
			}
			
			result = num1/num2;
			
		
			System.out.println("Result: " + result);
		} catch (ArithmeticException err ) {
			System.out.println("Exception Happened " + err.getMessage());
			result=3;
		} catch(Exception err) {
			result =3;
			System.out.println("Random Exception Happened" + err.getMessage());
		};
		
		System.out.println("num1 = " +num1);
		System.out.println("num2 = " +num2);
		System.out.println("result = " +result);
	}
}
