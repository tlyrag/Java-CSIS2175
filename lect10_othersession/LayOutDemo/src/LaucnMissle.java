import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaucnMissle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel myPanel = new JPanel();
		JFrame myFrame = new JFrame("Launch missle!");
		ImageIcon imgIcon = new ImageIcon("C:\\Users\\yangz11\\Downloads\\test.jpg");
		Image img = imgIcon.getImage();
		Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newImg);
		
		JLabel myLabel = new JLabel(imgIcon);
		
		myPanel.setLayout(null);
		
		myLabel.setBounds(40,360,20,20);
		
		myPanel.add(myLabel);
		
		myFrame.add(myPanel);
		myFrame.setSize(800,800);
		myFrame.setVisible(true);
		
		int x;
		int y;
		
		for(int i=0;i<200;i++)
		{
			x = myLabel.getLocation().x;
			y = myLabel.getLocation().y;
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			myLabel.setLocation(x+1, y-3);
		}
	}

}
