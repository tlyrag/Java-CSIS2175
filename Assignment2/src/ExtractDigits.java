import java.util.Scanner;
import java.util.ArrayList;
public class ExtractDigits {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = getUserInput();
		
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		StringBuilder reverseList =createString(getArrayOfInt(userInput)); 
		
		System.out.println(reverseList);
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
	public static ArrayList<Integer> getArrayOfInt(int num) {
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		while(num>0) {
			numArr.add(num%10);
			num/=10;
		}
		return numArr;
	}
	public static StringBuilder createString(ArrayList<Integer> numArr) {
		StringBuilder finalResult = new StringBuilder();
		for(int i =0; i<numArr.size();i++) {
			finalResult.append(numArr.get(i));
			finalResult.append(" ");
		}
		return finalResult;
	}

}
