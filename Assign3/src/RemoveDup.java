import java.util.ArrayList;
public class RemoveDup {
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,4,4,4,14,14,14,15,15,16};
		int[] newArr = removeDup(arr);
	}
	public static int[] removeDup(int[] arr) {
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		for(int i =0;i<arr.length;i++) {
			if(newArr.indexOf(arr[i])==-1) {
				newArr.add(arr[i]);
			}
		} 
		System.out.println(newArr);
		
//		displayArray(arr);
//		System.out.println("New Length is:"+ arr.length);
		return arr;
	}
	public static void displayArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
	
}
