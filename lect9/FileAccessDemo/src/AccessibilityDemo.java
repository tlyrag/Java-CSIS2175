import java.io.IOException;
import static java.nio.file.AccessMode.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AccessibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "C:\\Windows\\Accupage.dll";
		Path fileName = Paths.get(name);
		
		try
		{
			fileName.getFileSystem().provider().checkAccess(fileName, WRITE);
			System.out.println("The file is OK!");
		}
		catch(IOException e)
		{
			System.out.println("Err msg : "+ e.getMessage());
		}
	}

}
