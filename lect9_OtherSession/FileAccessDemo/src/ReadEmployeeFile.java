import java.nio.file.*;
import java.nio.channels.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ReadEmployeeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("C:\\Users\\yangz11\\employee.txt");		
		FileChannel fc = null;
		
		String[] array = new String[3];
		String id;
		String name;
		String payrate;
		String rawdata;
		
		double payment;
		final double HRS = 40;
		
		try
		{
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			rawdata = reader.readLine();
			while(rawdata!=null)
			{
				array = rawdata.split(",");
				id = array[0];
				name = array[1];
				payrate = array[2];
				payment = HRS * Double.parseDouble(payrate);
				System.out.println("ID#" + id + "   " + name + "  " + payment);
				rawdata = reader.readLine();
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("Err msg "+ e.getMessage());
		}
	}

}
