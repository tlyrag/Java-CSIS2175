import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class ComboBoxDemo extends JFrame implements ItemListener{
	JLabel l1,l2;
	JComboBox cmb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBoxDemo myFrame = new ComboBoxDemo();
		
	}
	public ComboBoxDemo() {
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		String[] data = {"Vancouver","New Westminster","Burnaby"};
		this.l1 = new JLabel("Which city do you live?");
		this.l2 = new JLabel("");
		
		cmb = new JComboBox(data);
		
		setLayout(new FlowLayout());
		add(l1);
		add(cmb);
		add(l2);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
