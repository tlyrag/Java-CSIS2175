
import java.util.Scanner;
public class SwitchTest {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter an int number");
		int num = input.nextInt();
		int residual = num%7;
		
		switch(residual) {
			case 1: 
				System.out.println("Residual = 1" );
				break;
			case 2: 
				System.out.println("Residual = 2" );
				break;
			case 3: 
				System.out.println("Residual = 3" );
				break;
			case 4: 
				System.out.println("Residual = 4" );
				break;
			default:
				System.out.println("Bigger than 4");
		}
		
		
		
	}

}
