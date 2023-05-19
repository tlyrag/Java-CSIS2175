
import static java.lang.System.out;
import java.util.Scanner;
public class ReadOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//out.println("Hello World " + args[1]);
		
		int userInput1;
		int userInput2;
		double average;
		int age;
		String name;
		Scanner input = new Scanner(System.in);
		// Math with User Input
//		out.println("Please input an integer number:");
//		
//		userInput1 = input.nextInt();
//		out.println("Please input anorhter integer number:");
//		
//		userInput2 = input.nextInt();
//		out.println("User Input1: "+userInput2);
//		
//		
//		average = (double)(userInput1 + userInput2)/2;
//		out.println("Average: "+average);
		
		
		/// Second Case Receiving 2 inputs
//		out.println("Please enter your age: ");
//		age = input.nextInt();
//		out.println("Please enter your name: ");
//		name = input.nextLine();
//		input.nextLine(); // Need to add this line so it Can consume the buffer, otherwise
//		// the code below will run before the age is parsed
//		out.println("Hi, "+ name);
//		out.println("Your age is: " +age);
//		out.println("Your age is: " +(age + 1));
//		
		// Third Case ++ and -- Operator
		
//		int num1 =1;
//		int num2 = 0;
//		
//		num2= num1++ + num1;
//		// num1++ will  be 1 as it is prefix and ++num1 will be 2 as it is postfix
//		// Therefore num1 will be 1 +3 = 4
//		out.println("num2 " + num2);
//		out.println("num1 " + num1);
//		
//
//		//4th case Calling methods with multiple overlays
//		callAverage(1,2);
//		callAverage(1,2,3);
		
		int grade1 = 89;
		int grade2 = 50;
		char grade = convert((callAverage(grade1,grade2)));
		out.println(grade);
		
	}
	
	static double callAverage(int num1, int num2) {
		double result = (num1 + num2)/2.0;
		return result;
	}
	static double callAverage(int num1, int num2, int num3) {
		double result = (num1 + num2+num3)/3.0;
		return result;
	}
	
	static char convert(double avg) {
		char grade = 'F';
		if( avg>=90) {
			grade ='A';
		} else if (avg >=70){
			grade = 'B';
		} else if(avg >=50) {
			grade ='C';
		}
			return grade ;
	}

}
