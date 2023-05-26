
public class ShortCircuitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index =1;
		
		System.out.println(index++ +" Test");
		if(True1() && True2()) {
			System.out.println("Hello");
		}
		System.out.println(index++ +" Test");
		if(False1() && True2()) {
			System.out.println("Hello");
		}
		System.out.println(index++ +" Test");
		if(True1() || False2()) {
			System.out.println("Hello");
		}
		if(True1() | False2()) {
			System.out.println("Hello");
		}
		
		
	}
	static boolean True1() {
		System.out.println("True1 was invoked");
		return true;
	}
	static boolean True2() {
		System.out.println("True2 was invoked");
		return true;
	}
	static boolean False1() {
		System.out.println("False1 was invoked");
		return false;
	}
	static boolean False2() {
		System.out.println("False2 was invoked");
		return false;
	}
}
