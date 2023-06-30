import java.util.ArrayList;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> perfectNumList = new ArrayList<Integer>();
		//testCode();
		for(int i = 1;i<=1000;i++) {
			if(i == getListSum(getEvenlyDivedNumbers(i))) {
				perfectNumList.add(i);
			}
		}
		//displayList(perfectNumList);
		System.out.println(perfectNumList);
	}
	
	public static ArrayList<Integer> getEvenlyDivedNumbers(int num) {
		ArrayList<Integer> evenlyList = new ArrayList<Integer>();
		
		for(int i = 1; i<num;i++) {
			if(num%i==0) {
				evenlyList.add(i);
			}
		}
		return evenlyList;
	}
	
	public static int getListSum(ArrayList<Integer> list) {
		int sumNumber=0;
		
		for(int i = 0; i<list.size();i++) {
			sumNumber+=list.get(i);
		}
		return sumNumber;
	}

	public static void testCode() {
		if (getListSum(getEvenlyDivedNumbers(6))==6) {
			System.out.println("Code is Working");
		} else {
			System.out.println("Code is not Working");
		}
		
	}
}
