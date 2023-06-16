import java.util.ArrayList;
public class TwoDimArray {
	public static void main(String[] args) {
		
		int[][] nums = new int [3][];
		int[][] table = new int [3][4];
		
		System.out.println();
	
		for(int row=0;row<table.length;row++) {
			
			for(int col=0; col<table[row].length; col++ ) {
				table[row][col] = (row+1) * (col+1);
			}
		}
		displayArray(table);
		displayArray(sumAlongCol(table));
	}
	
	public static void displayArray(int[][] table) {
	
		for(int row=0;row<table.length;row++) {
			
			for(int col=0; col<table[row].length; col++ ) {
				System.out.print(table[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
	public static int[] sumAlongCol(int[][] table) {
		int[] result = new int[table[0].length];
		
		for(int col = 0; col<table[0].length;col++) {
			result[col] = 0;
			for(int row=0; row<table.length;row++) {
				result[col]+=table[row][col];
			}
		}
		return result;
	}
	public static void displayArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		
	}
}
