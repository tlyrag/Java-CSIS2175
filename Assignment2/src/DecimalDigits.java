import java.util.Scanner;
public class DecimalDigits {
	static Scanner input = new Scanner(System.in);
	static StringBuilder finalDivisionValue = new StringBuilder();
	static StringBuilder finalMultiplicationValue = new StringBuilder();
	static boolean divisionDecimalAdded = false;
	
	public static void main(String[] args) 
	{
		
		String a = "25";
		String b = "5";
		String c = CalculateMultiplicationNumber(a, b);
		//System.out.println(c);
		System.out.println(finalMultiplicationValue);
		
		
		
		
//		System.out.println("Please enter Dividend");
//		int dividend = getUserInput();
//		System.out.println("Please enter Divisor");
//		int divisor = getUserInput();;
//		
//		
//		CalculateDivisionNumber(dividend,divisor);
//		System.out.println(finalDivisionValue);

	}
	
	// split into array 1 and 2
	// reverse the arrays
	// loop to the element of  array and perform a 
	public static String CalculateMultiplicationNumber(String factor1, String factor2) {
		String[] factorString1 = factor1.split("");
		String[] factorString2 = factor2.split("");
		// reversing strings so we can start from the first digit
		factorString1= ReverseStringArray(factorString1);
		factorString2= ReverseStringArray(factorString2);
		int factor1Sum = 0;
		int factor2Sum = 0;
		
		for(int i=0; i<factorString2.length;i++) {
			for(int j=0; j<factorString1.length;j++) {
			// Calculate the first multiplcation and convert to String
			String currentMultiplier = Integer.toString(Integer.parseInt(factorString1[j]) * Integer.parseInt(factorString1[i])); 
			//if currentMultiplier has more than one digit (5*5 = 25) as an example will enter the if
			if(currentMultiplier.length()==2) {
				String[] multiplierArr = currentMultiplier.split("");
				finalMultiplicationValue.insert(0,multiplierArr[1]);
				System.out.println(finalMultiplicationValue);
			} else {
				finalMultiplicationValue.insert(0,currentMultiplier);
				System.out.println(finalMultiplicationValue);
			}
		}
	}

		
		
		
		return"a";
	}
	
	// public static String
//	for(int i=0; i<factorString2.length;i++) {
//		for(int j=0; j<factorString1.length;j++) {
//			// Calculate the first multiplcation and convert to String
//			String currentMultiplier = Integer.toString(Integer.parseInt(factorString1[j]) * Integer.parseInt(factorString1[i])); 
//			//if currentMultiplier has more than one digit (5*5 = 25) as an example will enter the if
//			if(currentMultiplier.length()==2) {
//				String[] multiplierArr = currentMultiplier.split("");
//				finalMultiplicationValue.insert(0,multiplierArr[1]);
//				System.out.println(finalMultiplicationValue);
//			} else {
//				finalMultiplicationValue.insert(0,currentMultiplier);
//				System.out.println(finalMultiplicationValue);
//			}
//		}
//	}
	

	
	public static String[] ReverseStringArray(String[] arr) {
		StringBuilder newString = new StringBuilder();
		for(int i = arr.length-1; i>=0; i--) {
			newString.append(arr[i]);
		}
		String[] newArr = newString.toString().split("");
		return newArr;
	}
	
	public static String CalculateDivisionNumber(int dividend,int divisor) 
	
	{
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
		return Quotient;
		
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

}
