import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class ReadAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("C:\\Users\\yangz11\\data.txt");
		
		try {
			BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Creation time : "+ attributes.creationTime());
			System.out.println("Size : " + attributes.size());
			System.out.println("Modified time: "+ attributes.lastModifiedTime());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
