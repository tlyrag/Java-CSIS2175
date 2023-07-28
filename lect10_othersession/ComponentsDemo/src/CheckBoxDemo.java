import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CheckBoxDemo extends JFrame implements ItemListener{

	JLabel msg = new JLabel("Pls select the drink you like!");
	JCheckBox coffee = new JCheckBox("Coffee", false);
	JCheckBox tea = new JCheckBox("Tea",false);
	JCheckBox milk = new JCheckBox("Milk",false);
	JTextField myText = new JTextField(10);
	
	public CheckBoxDemo()
	{
		super("CheckBox demo!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		coffee.addItemListener(this);
		tea.addItemListener(this);
		milk.addItemListener(this);
		
		add(msg);
		add(tea);
		add(coffee);		
		add(milk);
		add(myText);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo myFrame = new CheckBoxDemo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "Order placed!");
		
		String amt =  myText.getText();
		
			
		if(tea.isSelected()) {
			JOptionPane.showMessageDialog(null, amt + " cups of "+ tea.getText()+"  is selected!");
		}
		else if(coffee.isSelected())
		{
			JOptionPane.showMessageDialog(null, amt + " cups of "+ coffee.getText()+"  is selected!");
		}
		else if(milk.isSelected())
		{
			JOptionPane.showMessageDialog(null, amt + " cups of " + milk.getText()+"  is selected!");
		}
	}

}
