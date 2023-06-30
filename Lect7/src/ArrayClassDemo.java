
public class ArrayClassDemo {
	public static void main (String[] args) {
		int[] nums = new int[6];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() *50);
		}
		displayArray(nums);
		System.out.println();

		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); 
		}
		
	}
	

}
