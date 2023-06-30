import java.util.Scanner;
public class DecimalDigitsDivision {
	static Scanner input = new Scanner(System.in);
	static StringBuilder finalDivisionValue = new StringBuilder();
	static StringBuilder finalMultiplicationValue = new StringBuilder();
	static boolean divisionDecimalAdded = false;
	
	public static void main(String[] args) 
	{
		
		//testDivision();
		
		System.out.println("Please enter Dividend");
		int dividend = getUserInput();
		System.out.println("Please enter Divisor");
		int divisor = getUserInput();;
		
		
		Division(dividend,divisor);
		System.out.println(finalDivisionValue);

	}
	
	

	public static String Division(int dividend, int divisor) {
		finalDivisionValue.setLength(0);;
		divisionDecimalAdded= false;
		return CalculateDivisionNumber(dividend,divisor);
		
	}
	public static String CalculateDivisionNumber(int dividend,int divisor) 
	
	{
		boolean testing = divisionDecimalAdded;
		int index =1;
		//handles int division with 0 reminder
		if(dividend%divisor==0) {
			finalDivisionValue.append(Integer.toString(dividend/divisor));
			finalDivisionValue.append(".");
			
			for(int i=0;i<20;i++) {
				finalDivisionValue.append("0");
			}
			
			return finalDivisionValue.toString();
		}
	
		// Add a 0 and . if the initial dividend is lower than the divisor
//			System.out.println("1:" +divisionDecimalAdded);
//			System.out.println("2:" + (dividend<divisor));
//			System.out.println("3:"+ finalDivisionValue);
		if(dividend<divisor && divisionDecimalAdded == false) 
		{
			finalDivisionValue.append("0");
			finalDivisionValue.append(".");
			dividend*=10;
			divisionDecimalAdded = true;
		} 	
		//Multiply by 10 if the current dividend from recurssion is lower than divisor
		else if (dividend<divisor)
		{
				dividend*=10;
		}
		// Add 0 to the quocient if dividend is still below the divisor
		while(dividend<divisor) 
		{
			finalDivisionValue.append("0");
			dividend*=10;
		}

		// Calculate the quocient by checking which number should be multiplied by the divisor
		// to reduce the value
		while(dividend-divisor*index>divisor) {
			index++;
		}
		int remainder = dividend-divisor*index;
		String Quotient = Integer.toString(index); 
		finalDivisionValue.append(Quotient);
		//System.out.println(finalDivisionValue);
		
		if(remainder <divisor && divisionDecimalAdded == false) {
			divisionDecimalAdded = true;
			finalDivisionValue.append(".");
		}
		
		if(finalDivisionValue.length()<20) {
			CalculateDivisionNumber(remainder,divisor);
		}else {
			
			return finalDivisionValue.toString();
		}
		return finalDivisionValue.toString();
		
	}
	public static int getUserInput() {
		System.out.println("Please Enter an Integer:");
		try {
			int userInput = input.nextInt();
			return userInput;
		} catch(Exception err) {
			input.nextLine();
			System.out.print("Please Enter a valid Integer. ");
			return getUserInput();
			
		}
	}
	public static void testDivision() {
		if(
				Division(20,3).equals("6.666666666666666666") &&
				Division(21,3).equals("7.00000000000000000000")	&&
				Division(2,3).equals("0.666666666666666666")
		) 		
		{
			System.out.println("Division code is working");
		} else {
			System.out.println("Division code is not working");
		}
	}

}
