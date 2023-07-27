
public class RemoveDup2 {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2,3,3,4,4,4,4,4,4,4 };
		int[] arrWithoutDup = RemoveDup(arr);
		DisplayArray(arrWithoutDup);
	}
	public static int[] RemoveDup(int arr[]) {
		int countDuplicates = 0;
		int tempArr[] = new int[arr.length];
		// loop through array and save each unique element to a temporary array
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				tempArr[countDuplicates] =arr[i];
				countDuplicates++;
			}
		}
		// Adding last digit to the array
		tempArr[countDuplicates] = arr[arr.length-1];
		
		int[] newTempArr = new int[countDuplicates+1];
		for(int i =0;i<newTempArr.length;i++) {
			newTempArr[i]=tempArr[i];
		}
		return newTempArr;
		
	}
	public static void DisplayArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
