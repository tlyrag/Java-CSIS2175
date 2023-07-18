import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

import java.nio.ByteBuffer;
public class CreateEmployeeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String fname = "C:\\Users\\yangz11\\employee.txt";
		Path filePath = Paths.get(fname);
		String id;
		String name;
		String payRate;
		FileChannel fc = null;
		String usrInput = "";
		
		try
		{
			fc = (FileChannel)Files.newByteChannel(filePath, WRITE,CREATE,APPEND);
			System.out.println("Pls input your ID: ");
			id = input.nextLine();
			
			while(!id.equals("999"))
			{
				System.out.println("Pls input your name: ");
				name = input.nextLine();
				
				System.out.println("Pls input your payrate: ");
				payRate = input.nextLine();
				
				usrInput = id + "," + name + "," + payRate+"\n";
				byte[] data = usrInput.getBytes();
				
				ByteBuffer buffer = ByteBuffer.wrap(data);
				
				fc.write(buffer);
				
				System.out.println("Pls input your ID: ");
				id = input.nextLine();
			}
			
			fc.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Err msg: " + e.getMessage());
		}
		
		
		
	}

}
