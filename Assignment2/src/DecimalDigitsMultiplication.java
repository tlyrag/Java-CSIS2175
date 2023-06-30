import java.util.ArrayList;
public class DecimalDigitsMultiplication {
	public static void main(String[] args) {
		String a ="13";
		
		String b ="87";

		ArrayList<String> reva = reverseInt(a);
		ArrayList<String> revb = reverseInt(b);
	
//		multiplication(reva,revb);
		ArrayList<ArrayList<String>> arr = addZero(multiplication(reva,revb));
		System.out.println(arr);
		
		sumProducts(arr) ;
		System.out.println(); 
	}
	
	// Reverse String to an ArrayList
	public static ArrayList<String> reverseInt(String num) {
		ArrayList<String> reverseIntArray =new  ArrayList<String>();
		String[] arr =num.split("");
		
		for(int i =arr.length-1;i>=0;i--) {
			reverseIntArray.add(arr[i]);
		}
		return reverseIntArray;
	}
	// Reverse ArrayList
	public static ArrayList<String> reverseInt(ArrayList<String> arr) {
		ArrayList<String> reverseIntArray =new  ArrayList<String>();
	
		
		for(int i =arr.size()-1;i>=0;i--) {
			reverseIntArray.add(arr.get(i));
		}
		return reverseIntArray;
	}
	
	/// Will return an array with all the products that needs to be sum to result in the final product
	public static ArrayList<ArrayList<String>> multiplication(ArrayList<String> multiplier, ArrayList<String> multiplicand) {
		ArrayList<ArrayList<String> > Products =new  ArrayList<ArrayList<String> >();
		ArrayList<String> ProductTemp =new  ArrayList<String>();	
		int addition = 0;
		int productNumToAppend =0;

		
		for(int i=0 ; i<multiplier.size();i++) {
			for(int j=0;j<multiplicand.size();j++) {
				int result = Integer.parseInt(multiplier.get(i)) * Integer.parseInt(multiplicand.get(j));
				
				// Adding the number of 10 to the next number
				if(addition >0) {
					result+=addition;
					addition =0;
				}
				
				/// If the result is bigger or equal than 10 garb the "quantity of tens"
				// to add to the next result
				if(result >=10) {
					productNumToAppend = result%10;
					addition = result/10;
					result = productNumToAppend;
				}
				
				ProductTemp.add(Integer.toString(result));
				
				if(j==multiplicand.size()-1 && addition>0) {
					ProductTemp.add(Integer.toString(addition));
				}
			}
			// Adding a clone as if I added the original and clear, the reference would miss
			
			Products.add((ArrayList<String>) ProductTemp.clone());
			ProductTemp.clear();
			
			
			// Loop that adds 0 at the end of the next multiplication;
			
			for(int k=-1; k<i;k++) {
				
				ProductTemp.add("0");
			}
		}
		System.out.println(Products);
		return Products;
	}
	//// Add zero to the begining of the number until they have the same amount of length
	/// 0 should be added at the and as the array is reversed
	public static ArrayList<ArrayList<String>> addZero(ArrayList<ArrayList<String>> productArray) {
		int bigLength = 0;
		for(int i =0; i<productArray.size();i++) {
			
			// find the row with the biggest length
			if(productArray.get(i).size() >bigLength) {
				bigLength=productArray.get(i).size();
			}
		}
		//add 0 until all rows have the same length
		for(int i =0; i<productArray.size();i++) {
			while(productArray.get(i).size()<bigLength) {
				productArray.get(i).add("0");
			}
		}
		//System.out.println(productArray);
		return productArray;
	}
	
	//Sum all products
	public static void sumProducts(ArrayList<ArrayList<String>> productArray) {
		ArrayList<String> FinalNumbers =new  ArrayList<String>();
		int result =0;
		int addition =0;
		int productNumToAppend=0;
		for(int i =0; i<productArray.get(0).size();i++) {
			for(int j=0; j<productArray.size();j++) {
				result += Integer.parseInt(productArray.get(j).get(i)) ;
				
				// Adding the number of 10 to the next number
				if(addition >0) {
					result+=addition;
					addition =0;
				}
				
				/// If the result is bigger or equal than 10 garb the "quantity of tens"
				// to add to the next result
				if(result >=10) {
					productNumToAppend = result%10;
					addition = result/10;
					result = productNumToAppend;
				}
				
				
				
				if(j==productArray.size()-1 && addition>0) {
					FinalNumbers.add(Integer.toString(addition));
				}
				
				
				
				
				
			}
			FinalNumbers.add(Integer.toString(result));
			System.out.println(FinalNumbers);
			result = 0;
		}
	}
}
