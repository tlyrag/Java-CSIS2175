import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\yangz11\\data.txt";
		Path filePath = Paths.get(fileName);
		System.out.println("Path is " + filePath.toString());
		System.out.println("File name " + filePath.getFileName());
		
		for(int i=0;i<filePath.getNameCount();i++)
		{
			System.out.println("Element " + i + " is " + filePath.getName(i));
		}
	}

}
