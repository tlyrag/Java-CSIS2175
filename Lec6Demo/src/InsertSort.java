import java.util.ArrayList;
public class InsertSort {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		final int MIN =1;
		final int MAX = 100;
		
		for (int i=0;i<num.length;i++) {
			num[i] = (int) (MIN +((Math.random()*MAX)));
		}
		ObjectArray.displayArray(num);
		insertionSort(num);
		ObjectArray.displayArray(num);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
	}
	
	public static void insertionSort(int[] num) {
		int key = 0;
		int prevIndex;
		int nextIndex;
		for(int currIndex =1; currIndex<num.length;currIndex++) {
			prevIndex = currIndex-1;
			nextIndex =currIndex+1;
			while(prevIndex>0 && key<num[prevIndex]) {
				key = num[currIndex];
				prevIndex--;
			}
			num[nextIndex]=key;
		}
	}
}
