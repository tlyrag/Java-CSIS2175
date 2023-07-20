import java.util.Scanner;
import java.nio.file.*;
public class ToAbsolutePathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pls input a file name");
		
		name = input.nextLine();
		
		Path inputPath = Paths.get(name);
		Path fullPath = inputPath.toAbsolutePath();
		
		System.out.println("Full path is "+ fullPath.toString());
		
	}

}
