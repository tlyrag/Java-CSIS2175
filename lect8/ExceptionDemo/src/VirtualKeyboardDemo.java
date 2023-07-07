import java.util.*;
public class VirtualKeyboardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try
		{
			String fullPath = "cmd /c C:\\Windows\\System32\\osk1.exe";
			Process proc = Runtime.getRuntime().exec(fullPath);
			int exitcode = proc.waitFor();
			if(exitcode !=0)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
		finally
		{
			String name;
			System.out.println("pls input your name");
			name = input.nextLine();
			System.out.println("Hello "+name);
		}
		
	}

}
