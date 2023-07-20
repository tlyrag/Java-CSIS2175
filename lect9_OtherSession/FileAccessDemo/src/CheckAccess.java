import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
public class CheckAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath =  Paths.get("C:\\Users\\yangz11\\data.txt");
		
		try {
			filePath.getFileSystem().provider().checkAccess(filePath, READ,EXECUTE,WRITE);
			System.out.println("This file is OK!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File cannot be read or executed "+ e.getMessage());
		}
	}

}
