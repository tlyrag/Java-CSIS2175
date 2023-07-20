import java.util.Scanner;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class CreateEmployeeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Path file = Paths.get("C:\\Users\\yangz11\\employee.txt");
		
		FileChannel fc = null;
		String delimiter = ",";
		String id;
		String name;
		String rate;
		String data;
		byte[] buffer;
		
		try
		{
			fc = (FileChannel) Files.newByteChannel(file, WRITE,CREATE,APPEND);
			System.out.println("Pls input employee's ID");
			id = input.nextLine();
			while(!id.equals("999"))
			{
				System.out.println("Pls input employees' name: ");
				name = input.nextLine();
				System.out.println("Pls input the payrate with 2 decimal digits: ");
				rate = input.nextLine();
				
				data = id + delimiter + name + delimiter + rate+ "\n";
				buffer = data.getBytes();
				
				ByteBuffer bBuffer = ByteBuffer.wrap(buffer);
				
				fc.write(bBuffer);
				
				System.out.println("Pls input employee's ID or 999 to quit");
				id = input.nextLine();		
			}
			fc.close();
		}
		catch(Exception e)
		{
			System.out.println("Error msg: " + e.getMessage());
		}
		
		
	}

}
