import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FIleAtrributesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("C:\\Users\\yangz11\\Pictures\\Sample Pictures\\Koala.jpg");
		
		try
		{
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Creation time: " + attr.creationTime());
			System.out.println("Last access time: " + attr.lastAccessTime());
			System.out.println("Last modified time: " + attr.lastModifiedTime());
			System.out.println("Size: " + attr.size());
		}
		catch(Exception e)
		{
			
		}
	}

}
