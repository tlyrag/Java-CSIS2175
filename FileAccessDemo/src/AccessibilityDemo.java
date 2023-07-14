import java.nio.file.Paths;
import java.io.IOException;
import static java.nio.file.AccessMode.*;
import java.nio.file.Path;

public class AccessibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "C:\\Users\\300370930\\Pictures\\Sample Pictures\\Koala111.jpg";
		Path fileName = Paths.get(name);
		
		//System.out.println(fileName);
		
	try {
			fileName.getFileSystem().provider().checkAccess(fileName, READ);
		} 
	catch(IOException err) 
		{
			System.out.println("Error: " + err.getMessage());
		} 
	}

}
