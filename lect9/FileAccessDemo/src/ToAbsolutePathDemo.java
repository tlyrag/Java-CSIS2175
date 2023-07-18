import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ToAbsolutePathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Pls enter a file name: ");
		String name = input.nextLine();
		name = "result.txt";
		Path fileName = Paths.get(name);
		
		Path fullPath = fileName.toAbsolutePath();
		
		System.out.println(fileName);
		System.out.println(fullPath);
	}

}
