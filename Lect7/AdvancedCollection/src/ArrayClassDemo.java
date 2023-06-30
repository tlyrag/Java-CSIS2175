import java.util.Arrays;

public class ArrayClassDemo {
	public static void main(String[] args)
	{
		int[] nums = new int[10];
		
		int[][] num2 = new int[3][4];
		
		
		
		for(int i=0;i<num2.length;i++)
		{
			Arrays.fill(num2[i], i);
			DisplayArray(num2[i]);
		}
		
		int price;
		int stock;
		String[] names = {"ice cream","pen","note book","paper","bread"};
		Inventory[] productList = new Inventory[5];
		
		for(int i=0;i<productList.length;i++)
		{
			price = 1+(int)(Math.random()*20);
			stock = 10+(int)(Math.random()*50);
			
			productList[i] = new Inventory();
			productList[i].name=names[i];
			productList[i].price = price;
			productList[i].stock = stock;
		}
		
		DisplayArray(productList);
		
		Arrays.sort(productList,new mySortMetric());
		
		DisplayArray(productList);
		
		/*
		 * integer array: 
		DisplayArray(nums);		
		Arrays.fill(nums, 10);
		nums[0] = -1;
		nums[5] = 2;		
		DisplayArray(nums);		
		Arrays.sort(nums);
		DisplayArray(nums);
		*/		
	}
	
	public static void DisplayArray(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static void DisplayArray(Inventory[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i].name + "," + nums[i].price + ","+ nums[i].stock+ "    ");
		}
		System.out.println();
	}
}
