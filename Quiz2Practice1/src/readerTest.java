import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class readerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C://";
		Path file = Paths.get(fileName);
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String rawData = reader.readLine();
			
			while(rawData !=null) {
				String[] array = rawData.split(",");
				String name= array[0];
				int age= Integer.parseInt(array[1]);
				rawData= reader.readLine();
			}
			reader.close();		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
