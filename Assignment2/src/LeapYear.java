import java.util.Scanner;
public class LeapYear {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/// TestingLeapYearFunction////
		 //testCode();
		
		/// TestingLeapYearFunction////
		
		int userInput = getUserInput();
		
		leapCheck(userInput);
		
		
		
		
	}
	
	public static void testCode() {
		if(!leapCheck(1900) && leapCheck(2016)) {
			System.out.println("Leap year Code is working");
		} else {
			System.out.println("Leap year  Code is not working");
		}
		
	}
	
	
	public static int getUserInput() {
		System.out.println("Please Enter a Year:");
		try {
			int userInput = input.nextInt();
			if(userInput <0) {
				throw new Exception("Error:");
			}
			return userInput;
		} catch(Exception err) {
			input.nextLine();
			System.out.print("Please Enter a valid Year. ");
			return getUserInput();
			
		}
		
	}
	public static boolean leapCheck(int year) {
		// Check if it is a Century Year (Ends in 00)
		if(year%100 ==0) {
			if(year%400==0) {
				System.out.println(year+ " is a leap Year.");
				return true;
			} 
			else {
				System.out.println(year+ " is not a leap Year.");
				return false;
			}
		} 
		
		// Regular Years
		if(year%4==0) {
			System.out.println(year+ " is a leap Year.");
			return true;
		}
		System.out.println(year+ " is not a leap Year.");
		return false;
	}
}
