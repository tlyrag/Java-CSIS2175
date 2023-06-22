
public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[3][];
		
		int[][] table = new int[3][4];
		
		Student[][] stus = new Student[3][4];
		
		stus[0][0] = new Student("Test", table[0]);
		System.out.println(stus[0][0]);
		//stus[0][0].name = "Test"; //cannot do it
		
		int[] row1 = new int[4];
		
		//System.out.println("row num : "+table.length);
		//System.out.println("col num : "+table[0].length);
		
		for(int row=0;row<table.length;row++)
		{
			for(int col=0;col<table[0].length;col++)
			{
				//row1 = table[row]; //not suggested
				table[row][col] = (row+1) * (col+1);
			}
		}
		
		displayArray(table);
		
		int[] result = colSum(table);
		
		displayArray(result);
			
	}	
	
	public static int[] colSum(int[][] table)
	{
		int[] result = new int[table[0].length];
		
		for(int col=0;col<table[0].length;col++)
		{
			result[col] = 0;
			for(int row=0;row<table.length;row++)
			{
				result[col] = result[col] + table[row][col];
			}
		}
		
		return result;
	}
	
	public static void displayArray(int[][] table)
	{
		for(int row=0;row<table.length;row++)
		{
			for(int col=0;col<table[row].length;col++)
			{
				System.out.print(table[row][col] + "  ");
			}
			System.out.println();
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
