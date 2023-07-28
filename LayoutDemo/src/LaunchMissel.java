import java.awt.Image;

import javax.swing.*;


public class LaunchMissel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame();
		ImageIcon imgIcon = new ImageIcon("C:\\Users\\300370930\\Desktop\\Java-CSIS2175\\LayoutDemo\\src\\missel.jpg");
		
		Image img = imgIcon.getImage();
		Image newImage = img.getScaledInstance(20,20,java.awt.Image.SCALE_SMOOTH); 
		imgIcon = new ImageIcon(newImage);
		
		JLabel myLabel = new JLabel(imgIcon);
		
		myFrame.add(myLabel);
		myFrame.setSize(1000,1000);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLayout(null);
		myLabel.setBounds(10,940,20,20);
		
		int x;
		int y;
		
		for(int i=0;i<200;i++) {
			x= myLabel.getLocation().x;
			y= myLabel.getLocation().y;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			myLabel.setLocation(x+1,y-2);
		}
	}

}
