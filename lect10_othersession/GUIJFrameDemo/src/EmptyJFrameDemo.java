import javax.swing.*;
public class EmptyJFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame("Dummy JFrame");
		final int WIDTH = 400;
		final int HEIGHT = 300;
		
		myFrame.setSize(WIDTH, HEIGHT);
		myFrame.setVisible(true);
		//myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
