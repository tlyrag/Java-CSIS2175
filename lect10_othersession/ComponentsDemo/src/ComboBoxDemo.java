import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxDemo extends JFrame implements ItemListener {

	public static JFrame myFrame;
	public static JLabel l1,l2;
	public static JComboBox cmB;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBoxDemo itsListner = new ComboBoxDemo();
		myItemListener anotherListener = new myItemListener();
		
		myFrame = new JFrame("ComboBox demo");
		myFrame.setLayout(new FlowLayout());
		
		
		String[] myCity = {"Vancouver","Burnaby","New West","Coquitlam"};
		cmB = new JComboBox(myCity);
		
		
		//cmB.addItemListener(itsListner);
		
		l1 = new JLabel("Pls select your city: ");
		l2 = new JLabel("");
		l1.setBackground(Color.YELLOW);
		l1.setForeground(Color.BLUE);
		
		
		anotherListener.myCMB = cmB;
		anotherListener.myLabel = l2;
		
		cmB.addItemListener(anotherListener);
		
		myFrame.add(l1);
		myFrame.add(cmB);
		myFrame.add(l2);
		
		myFrame.setSize(400,400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		l2.setText(cmB.getSelectedItem().toString()+" selected!");
	}

}
