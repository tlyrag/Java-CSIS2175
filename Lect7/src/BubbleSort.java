
public class BubbleSort {
	public static void main (String[] args) {
		int[] nums = new int[6];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() *50);
		}
		displayArray(nums);
		System.out.println();
		displayArray(bubleSort(nums));
		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); 
		}
		
	}
	
	public static int[] bubleSort(int[] nums) {
		int temp;
		int compare=0;
		int swap=0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j] >nums[j+1]) {
					
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			} 
		}
		return nums;
	}
	public static int[] bubleSort2(int[] nums) {
		int temp;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1-i; j++) { // add a -i
				if(nums[j] >nums[j+1]) {
					
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			} 
		}
		return nums;
	}
	
}
