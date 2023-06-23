import java.util.Arrays;
public class MitermStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = {4,9,123,512,2,41,32,2};
	//insertSort(arr);
	String[] arrS = {"Albert","Roger","Amanda","Bernardo","Cal"};
	//sort(arrS);
	Arrays.sort(arr);
	System.out.print(Arrays.toString(arr)); 
	//displayArray(arr);
	}
	
				
	public static void displayArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
	}
	
	public static void displayTransversal(int[][] arr) {
		
		for(int row =0; row<arr.length;row++) {
			System.out.println(arr[row][row]);
//			for(int col =0; col<arr[row].length;col++) {
//				
//			}
		}
	}
//	public static void sort(String[] arr) {
//		String key;
//		int j;
//		
//		for(int index = 1; index<arr.length;index++) {
//			key = arr[index];
//			System.out.println("Key: " + key);
//			j = index-1;
//			System.out.println("J index: " + j);
//			
// 			while(j>=0&& key.compareTo(arr[j])<1) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			arr[j+1]=key;
//			System.out.println(index+ ": Array after interaction");
//			displayArray(arr);
//		}
//		
//		
//	}
 }

