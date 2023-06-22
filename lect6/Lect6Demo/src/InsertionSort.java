
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[10];
		
		final int MIN = 1;
		final int MAX = 100;
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i] = MIN + (int)(Math.random()*MAX);
		}
		
		displayArray(nums);		
		
		insertionSort(nums);
		
		displayArray(nums);	
	}
	
	public static void insertionSort(int[] nums)
	{
		int key;
		int j;
		for(int index=1;index<nums.length;index++)
		{
			key = nums[index];
			j=index-1;
			while(j>=0 && key<nums[j])
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
	}
	
	public static void displayArray(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
	}

}
