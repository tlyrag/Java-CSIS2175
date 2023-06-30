import java.util.ArrayList;
import java.util.Scanner;
public class Palindrome {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TESTING CODE
			//testCode();
		//
		//Geting user input
		String userInput = getUserInput();
		
		//Transforming to Array and building the String with letters only
		ArrayList<Character> lettersInUserInput = getLettersInPhrase(userInput);
		String userPhraseLetters = buildString(lettersInUserInput).toString();
		
		// Reversing the array and building the String with letters only
		ArrayList<Character> reverseLettersInUserInput = reverseArray(lettersInUserInput);
		String userReversePhraseLetters = buildString(reverseLettersInUserInput).toString();
		
		//Checking if it is Palindrome
		
		palindromeChecker(userPhraseLetters,userReversePhraseLetters);
		
		
	}
	public static ArrayList<Character> getLettersInPhrase(String phrase) {
		
		ArrayList<Character> charList  = new ArrayList<Character>();
		char[] phraseArray = phrase.toCharArray();
		for(int i =0;i<phraseArray.length;i++) {
			
			if(Character.isLetter(phraseArray[i])){
				charList.add(phraseArray[i]);
			} 
		}
		return charList;
	}
	public static ArrayList<Character> reverseArray(ArrayList<Character> charList) {
		
		ArrayList<Character> reversedCharList  = new ArrayList<Character>();
		
		for(int i=0;i<charList.size();i++) {
			reversedCharList.add(0, charList.get(i));
		}
		return reversedCharList;
	}
	public static StringBuilder buildString(ArrayList<Character> charList) {
		StringBuilder newString = new StringBuilder();
		for(int i=0;i<charList.size();i++) {
			newString.append(charList.get(i));
		}
		
		return newString;
	}
	public static boolean palindromeChecker(String str1,String str2) {
		
		if(str1.toLowerCase().equals(str2.toLowerCase())) {
			System.out.println(str1.toLowerCase()+ " Is a palindrome phrase to "+ str2.toLowerCase());
			return true;
		} else {
			System.out.println(str1.toLowerCase()+ " Is not a palindrome phrase to "+ str2.toLowerCase());
			return false;
		} 
	}
	public static String getUserInput() {
			System.out.println("Please enter you phrase");
			String userInput =input.nextLine();
			return userInput;
		
	}
	public static void testCode() {
		ArrayList<Character> lettersInUserInput = getLettersInPhrase("Madam, I'm Adam");
		String userPhraseLetters = buildString(lettersInUserInput).toString();
		
		// Reversing the array and building the String with letters only
		ArrayList<Character> reverseLettersInUserInput = reverseArray(lettersInUserInput);
		String userReversePhraseLetters = buildString(reverseLettersInUserInput).toString();
		
		//Checking if it is Palindrome
		
		boolean isCodeWorking = palindromeChecker(userPhraseLetters,userReversePhraseLetters);
		
		if(isCodeWorking) {
			System.out.println("Code is Working");
			
		} else {
			System.out.println("Code is not Working");
		}
	}

}
 