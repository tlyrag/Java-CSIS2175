
import static java.lang.System.out;
import java.util.Scanner;
public class ReadOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//out.println("Hello World " + args[1]);
		
		int userInput1;
		int userInput2;
		double average;
		
		out.println("Please input an integer number:");
		Scanner input = new Scanner(System.in);
		userInput1 = input.nextInt();
		out.println("Please input anorhter integer number:");
		
		userInput2 = input.nextInt();
		out.println("User Input1: "+userInput2);
		
		
		average = (double)(userInput1 + userInput2)/2;
		out.println("Average: "+average);
	}

}
