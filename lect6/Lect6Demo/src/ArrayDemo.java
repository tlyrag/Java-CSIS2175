
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,5};
		
		System.out.println("Update by parsing int: ");
		displayArray(nums);
		updateValue(nums[1]);
		displayArray(nums);
		
		System.out.println("Update by parsing array: ");
		displayArray(nums);
		updateValue(nums,1);
		displayArray(nums);
		System.out.println(nums.length);
	}
	
	public static void updateValue(int num)
	{
		num = num *10;
	}
	
	public static void updateValue(int[] nums,int index)
	{
		if(index<0 || index>=nums.length)
		{
			return;
		}
		nums[index] = nums[index] *10;
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
