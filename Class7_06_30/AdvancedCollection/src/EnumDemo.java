import java.util.Scanner;
public class EnumDemo {
	enum Month{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner usrInput = new Scanner(System.in);
		String mon;
		Month birthMonth;
		
		System.out.println("Pls input the first 3 characters of  your birth month: ");
		mon = usrInput.nextLine().toUpperCase();
		birthMonth = Month.valueOf(mon);
		System.out.println("You input "+birthMonth);
		
		int pos = birthMonth.ordinal();
		System.out.println(birthMonth + " position  is "+ pos);
		
		int comparison = birthMonth.compareTo(Month.APR);
		System.out.println("comparison = " + comparison);
		
	}

}
