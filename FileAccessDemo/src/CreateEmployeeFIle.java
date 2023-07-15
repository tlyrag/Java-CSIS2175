import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateEmployeeFIle {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName = "C:\\Users\\300370930\\Desktop\\FileTest\\filae.txt";
		Path filePath = Paths.get(fName);
		String id;
		String name;
		String payRate;
		
		FileChannel fc = null;
		String usrInput = "";
		
		try 
		{
			
			fc = (FileChannel)Files.newByteChannel(filePath, READ,WRITE,CREATE);
			System.out.println("Pls input your ID: ");
			id = input.nextLine();
			while (!id.equals("999")) 
			{
				System.out.println("Pls input your name: ");
				name = input.nextLine();
				
				System.out.println("Pls input your payRate");
				payRate = input.nextLine();
				usrInput = id +","+name+","+payRate+"\n";
				byte[] data = usrInput.getBytes();
				ByteBuffer buffer = ByteBuffer.wrap(data);
				fc.write(buffer);
				
				System.out.println("Pls input your ID or type 999 to quit ");
				id = input.nextLine();
			}
			
			fc.close();


		}
		catch(Exception err) 
		{
			System.out.println("Error: " + err.getMessage());
		}
	}

}
