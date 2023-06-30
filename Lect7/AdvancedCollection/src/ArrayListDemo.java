import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("The initial size is "+names.size());
		names.add("Ali");
		DisplayArrayList(names);
		names.add("Michael");
		names.add("Zack");
		DisplayArrayList(names);
		names.add("Chris");
		System.out.println("Before remove: ");
		DisplayArrayList(names);
		names.remove(0);
		System.out.println("After remove: ");
		DisplayArrayList(names);
		
		names.remove("Zack");
		DisplayArrayList(names);
		names.remove("Zack");
	}
	
	public static void DisplayArrayList(ArrayList<String> names)
	{
		System.out.println("The size is "+names.size());
		for(int i=0;i<names.size();i++)
		{
			System.out.println(i + " " + names.get(i));
		}
	}

}
