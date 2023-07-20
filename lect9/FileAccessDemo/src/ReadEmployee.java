import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName = "C:\\Users\\yangz11\\employee.txt";
		Path filePath = Paths.get(fName);
		String[] myArray = new String[3];
		String tmp;
		String name;
		String id;
		double payRate;
		final int HRS = 40;
		double total;
		
		try
		{
			InputStream fInput= new BufferedInputStream(Files.newInputStream(filePath));
			BufferedReader reader = new BufferedReader(new InputStreamReader(fInput));
			
			tmp = reader.readLine();
			while(tmp!=null)
			{
				myArray = tmp.split(",");
				
				id = myArray[0];
				name = myArray[1];
				payRate = Double.parseDouble(myArray[2]);
				
				total = HRS * payRate;
				
				System.out.println("ID #"+id+"\nName: "+name+"\nTotal: "+total+"\n\n");
				tmp = reader.readLine();
				
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("Err msg: " + e.getMessage());
		}
	}

}
