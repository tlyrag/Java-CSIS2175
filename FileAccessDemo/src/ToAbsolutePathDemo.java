import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;

public class ToAbsolutePathDemo {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter file name: ");
		String name = input.nextLine();
		
		Path fileName = Paths.get(name);
		Path fullPath  = fileName.toAbsolutePath();
		
		Path filePath2 = Paths.get("Testing");
		
		System.out.println(fileName);
		System.out.println(fullPath);
		System.out.println(filePath2);
	}

}
