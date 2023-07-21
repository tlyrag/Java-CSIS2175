import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

import java.io.IOException;

public class Export {
	public static void main(String[] args) {
		writeFile("Testing5");
		
	}
	public static void writeFile(String writeString) {
		String pathName = "D:\\Douglas\\Java\\test.txt";
		Path filePath = Paths.get(pathName);
		
		try {
			FileChannel fc = FileChannel.open(filePath, WRITE,CREATE,APPEND);
			
			byte[] data = writeString.getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(data);
			fc.write(buffer);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
