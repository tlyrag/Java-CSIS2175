import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

import java.io.IOException;
public class FileExport {
	public static void main(String[] args) {
		FileChannel fc = null;
		String pathName = "C:\\Users\\300370930\\Desktop\\Java\\testt.txt";
		Path filePath = Paths.get(pathName);
		System.out.print("aaaa");
		try {
			 
			fc = (FileChannel) Files.newByteChannel(filePath, WRITE,CREATE,APPEND) ;
			 String a = "Testing write2";
			 byte[] data = a.getBytes();
			 ByteBuffer buffer = ByteBuffer.wrap(data);
			 fc.write(buffer);
			 
		} catch(Exception err) {
			System.out.println(err.getMessage());
		}
		
		
	}
}
