import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxDemo extends JFrame implements ItemListener{
	JLabel myLabel = new JLabel("Which one do you lile?");
	JCheckBox coffee = new JCheckBox("Coffe",false);
	JCheckBox tea = new JCheckBox("tea",false);
	JCheckBox water = new JCheckBox("water",false);
	JCheckBox milk = new JCheckBox("milk",false);
	
	public CheckBoxDemo() {
		super("Checkbox demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1000,1000);
		pack();
		
		myLabel.setFont(new Font("Arial",Font.ITALIC,22));
		coffee.addItemListener(this);
		tea.addItemListener(this);
		water.addItemListener(this);
		milk.addItemListener(this);
		
		
		add(myLabel);
		add(coffee);
		add(tea);
		add(water);
		add(milk);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo myFrame = new CheckBoxDemo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(coffee.isSelected()) {
			JOptionPane.showMessageDialog(null, "You ordered Coffee");
			
		} else if (tea.isSelected()) {
			JOptionPane.showMessageDialog(null, "You ordered tea");
		} else if (water.isSelected()) {
			JOptionPane.showMessageDialog(null, "You ordered water");
		} else if (milk.isSelected()) {
			JOptionPane.showMessageDialog(null, "You ordered milk");
		}
	}

}
