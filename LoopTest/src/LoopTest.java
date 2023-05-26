import java.util.Scanner;

public class LoopTest {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int result;
		
		result = 0;
		int result2 = 0;
		for(int i=0; i<=100;i++) {
			result +=i;
		}
		System.out.println("Result = " + result);
		//System.out.println("i = " + i);
		
		int i =0;
		while(i<=100) {
			result2 +=1;
			i++;
		}
		System.out.println("Result2 = " + result2);
		
		int num;
		num = input.nextInt();
		
		
	}

}
