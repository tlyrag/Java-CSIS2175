import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int UserInput1 = GetUserInput();
//		int UserInput2 = GetUserInput();
//		//int UserInput3 = GetUserInput();
//		
//		int lastDigit = GetLastDigit(UserInput1);
//		System.out.println(lastDigit);
//		
//		String[] lastDigitString = Integer.toString(UserInput2).split("");
//		int lastDigit2 = Integer.parseInt(lastDigitString[lastDigitString.length-1]);
//		System.out.println(lastDigit2);
		//JOptionPane.showConfirmDialog(null, "Hello?");
		//String a = JOptionPane.showInputDialog(null,"Jeloo");
//		char a = 'a';
//		Character.isAlphabetic(a);
//		Character.isLetter(a);
//		
//		int i;
//		System.out.println(Math.);
//		for(i=0;i<=2;i++) {
//			System.out.println("a");
//		}
//		System.out.println(i);
		//RandomClass.setNumber(5);
		/// Second Case Receiving 2 inputs
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		//System.out.println("Please enter your age2: ");
		//int age2 = input.nextInt();
		System.out.println("Please enter your name: ");
		String name = input.next();
		//input.nextLine(); // Need to add this line so it Can consume the buffer, otherwise
		// the code below will run before the age is parsed
		System.out.println("Hi, "+ name);
		System.out.println("Your age is: " +age);
		//System.out.println("Your age2 is: " +age2);
		//System.out.println("Your age is: " +(age + 1));
	}
	public static int GetLastDigit(int number) {
		while(number>10) {
			number = number%10;
		}
		return number;
	}
	public static int GetUserInput() {
		
		System.out.println("Please enter integer:"); 
		try {
			int userInput = input.nextInt();
			return userInput;
			
		} catch(Exception err) {
			input.nextLine();
			System.out.println("Invalid Integer"); 
			return GetUserInput();
		}
		
	}

}
