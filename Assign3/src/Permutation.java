
public class Permutation {
	public static void main(String[] args) {
		String a = "1234";
		permute(a);
	}
	public static void permute(String str) {
		String[] arr = str.split("");
		String temp;
		displayArray(arr);
		for(int i=arr.length-1; i>=0;i--) {
			for(int j=arr.length-1; j>=0;j--) {
				if(j-1>=0) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
					displayArray(arr);
				}
			}

		}
	}
	public static void displayArray(String[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
