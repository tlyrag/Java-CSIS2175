import java.util.Scanner;
import java.util.Arrays;
public class BasicInterviewQuestions {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput = getUserInput();
		
		StringBuilder reverSting = reverString(userInput);
		System.out.println(reverSting);
		vowelCount(userInput);
		System.out.println(vowelCount(userInput));
		boolean isPalindrome = palindromeChecker(userInput);
		System.out.println(isPalindrome);
		
		
		
		int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
	}
	public static String getUserInput() {
		System.out.println("Please enter a string to be reversed:");
		String userInput = input.nextLine();
		return userInput;
		
	}
	public static StringBuilder reverString(String str) {
		StringBuilder reverseString = new StringBuilder();
		
		String[] strArr = str.split("");
		int iterrator = strArr.length;
		for(int i = strArr.length-1; i>=0; i--) {
			reverseString.append(strArr[i]);
		}
		return reverseString;
	}
	public static int vowelCount(String str) {
		String[] strArr = str.split("");
		int countOfVowels =0;
		for(int i =0 ; i<strArr.length;i++) {
			//System.out.println(strArr[i]);
			if(strArr[i].equals("a") ||strArr[i].equals("e")||strArr[i].equals("i")||strArr[i].equals("o")||strArr[i].equals("u")) {
				countOfVowels++;
			}
		}
		return countOfVowels;
	}
	public static boolean palindromeChecker(String str) {
		String str2 = reverString(str).toString();

		System.out.println("str1 is: "+str);
		System.out.println("str2 is: "+str2);
		if(str.equals(str2)) {
			return true;
		} else {
			return false;
		}
		
	}
}
	