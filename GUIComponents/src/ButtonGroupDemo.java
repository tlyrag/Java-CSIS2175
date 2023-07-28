import java.awt.FlowLayout;

import javax.swing.*;
public class ButtonGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame("Button group demo");
		JRadioButton[] buttons = new JRadioButton[5];
		
		myFrame.setSize(500,500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLayout(new FlowLayout());
		
		
		ButtonGroup group = new ButtonGroup();
		for(int i =0;i<buttons.length;i++) {
			buttons[i] = new JRadioButton(String.format("radiobutton-%d", (i+1)));
			group.add(buttons[i]);
			myFrame.add(buttons[i]);
		}
	}

}
