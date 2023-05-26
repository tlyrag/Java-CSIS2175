import java.util.Scanner;
public class IFTest {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input an integer number");
		int num = input.nextInt();
		
		
		//= ==
		// to compare double 10.33333 -> num >10.333299 num <10.333001

		//1.0 Divided by 3 and 0
		if(num%3==0 || num%7==0) {
			System.out.println(num + " is evenly divisible by 3 and 7");
			if(!(num%3==0 && num%7==0) ) {
				System.out.println("This is our number");
			}
		}
		
		//2.0 Even Number
		if(num%2==0) {
			System.out.println("This is an even number");
		} else {
			if(num%3==0) {
				System.out.println("This is not an even number but can be divided by 3");
			}
			else if(num%7==0) {
				System.out.println("This is not an even number but can be divided by 7");
			}
		}
		
		// Can also be written as 
//		if((num%3==0 || num%7==0) && !(num%3==0 && num%7==0)) 
//		{
//			
//	 	System.out.println("This is our number");
//
//		}

		System.out.println("Num = " + num);
		
	}

}
