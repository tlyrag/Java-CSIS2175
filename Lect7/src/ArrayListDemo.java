import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>(); 
		
		names.add("Apple");
		names.add("Banana");
		names.add("Kiwi");
		
		System.out.println(names);
		displayList(names);
		int a = names.indexOf("Banana");
		System.out.println(a);
		
	}
	
	public static void displayList(ArrayList<String> list) {
		for(int i =0; i<list.size();i++) {
			System.out.println(i+" name is " + list.get(i));
		}
	}

}
