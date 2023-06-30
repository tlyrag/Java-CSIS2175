import java.util.Scanner;
public class EnumDemo {

	enum Month {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner userInput = new Scanner(System.in);
		String inputStr;
		Month birthMonth;
		
		for(Month mon: Month.values()) {
			System.out.print(mon +" ");
		}
		System.out.println();
		System.out.println("Please input the furst 3 letters of a month: ");
		inputStr = userInput.nextLine().toUpperCase();
		birthMonth = Month.valueOf(inputStr);
		
		System.out.println("Your input " + birthMonth);
		
	}

}
