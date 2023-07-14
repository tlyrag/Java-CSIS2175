import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {
	public static void main(String[] args ) {
		
		String fileName = "C:\\Users\\300370930\\Desktop\\FileTest\\data.txt";
		Path filePath = Paths.get(fileName);
		
		System.out.println("Path is: " + filePath.toString());
		System.out.println("File name is: " + filePath.getFileName());
		
		for(int i = 0; i<filePath.getNameCount(); i++) {
			System.out.println("Element " + i + " is " + filePath.getName(i));
		}
		
		
	}
}
