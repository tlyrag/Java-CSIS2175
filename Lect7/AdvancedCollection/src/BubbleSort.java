
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		int[] nums2 = new int[10];
		int tmp=0;
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i] = (int) (Math.random()*50);
			nums2[i] = nums[i];
		}
		
		DisplayArray(nums);
		int count = 0;
		int swapCount =0;
		
		for(int i=0;i<nums2.length-1;i++)   // if the array length is n, n-1
		{
			for(int j=0;j<nums2.length-1;j++)   // n-1
			{
				count ++;
				if(nums2[j]<nums2[j+1])
				{
					tmp = nums2[j];
					nums2[j] = nums2[j+1];
					nums2[j+1] = tmp;
					swapCount ++;
				}
			}
		}
		DisplayArray(nums);
		System.out.println("oringinal: ");
		System.out.println("count = "+count);
		System.out.println("swapCount = "+swapCount);
		
		
		count =  0;
		swapCount =0;
		for(int i=0;i<nums.length-1;i++)   // if the array length is n, n-1
		{
			for(int j=0;j<nums.length-1-i;j++)   // n-1
			{
				count ++;
				if(nums[j]<nums[j+1])
				{
					tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
					swapCount ++;
				}
			}
		}
		
		
		DisplayArray(nums);
		System.out.println("oringinal: ");
		System.out.println("count = "+count);
		System.out.println("swapCount = "+swapCount);
	}
	
	public static void DisplayArray(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}
