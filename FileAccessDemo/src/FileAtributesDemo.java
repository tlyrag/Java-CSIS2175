import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.attribute.BasicFileAttributes;

import java.nio.*;

public class FileAtributesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "C:\\Users\\300370930\\Pictures\\Sample Pictures\\Koala.jpg";
		Path filePath = Paths.get(name);
		
		try 
		{
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Creation time: " + attr.creationTime());
			System.out.println("LastAccess time: " + attr.lastAccessTime());
			System.out.println("LstModified time: " + attr.lastModifiedTime());
			System.out.println("Size: " + attr.size());
		} 
		catch(Exception err) 
		{
			System.out.println("Error: " + err.getMessage());
		}
	}

}
