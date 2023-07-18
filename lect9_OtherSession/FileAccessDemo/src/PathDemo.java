import java.nio.file.*;
public class PathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("C:\\Users\\yangz11\\data.txt");
		int count = filePath.getNameCount();
		
		System.out.println("the count is " + count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Element " + i + " is " + filePath.getName(i));
		}
		
		System.out.println("File name is " + filePath.getFileName());
		
	}

}
