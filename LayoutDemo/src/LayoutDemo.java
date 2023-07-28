import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.*;


public class LayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryFlowLayout();
		TryBorderLayout();
		TryBoxLayout();
	}
	public static void TryBorderLayout() {
		JFrame myFrame = new JFrame("Border Layout");
		JButton[] myButtons = new JButton[10];
		
		BorderLayout myLayout = new BorderLayout();
		myFrame.setLayout(myLayout);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,400);
		myFrame.setVisible(true);
		
		
		for(int i=0;i<myButtons.length;i++) {
			myButtons[i] = new JButton(String.format("button-%d", i+1));
			myFrame.add(myButtons[i]);
		}
		
		myFrame.add(myButtons[0],BorderLayout.PAGE_START);
		myFrame.add(myButtons[1],BorderLayout.LINE_START);
		myFrame.add(myButtons[2],BorderLayout.CENTER);
		myFrame.add(myButtons[3],BorderLayout.LINE_END);
		myFrame.add(myButtons[4],BorderLayout.PAGE_END);		
		
	}
	
	public static void TryBoxLayout() {
		JFrame myFrame = new JFrame("Box Layout");
		JButton[] myButtons = new JButton[10];
		JButton[] anotherButton = new JButton[5];
		JPanel myPanel = new JPanel();
		JPanel anotherPanel = new JPanel();
		FlowLayout myLayout = new FlowLayout();
		
		
		myFrame.setLayout(myLayout);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,400);
		myFrame.setVisible(true);
		
		myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
		anotherPanel.setLayout( new FlowLayout());
		
		for(int i=0;i<myButtons.length;i++) {
			myButtons[i] = new JButton(String.format("button-%d", i+1));
			myButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			myPanel.add(myButtons[i]);
		}
		
		for(int i=0;i<anotherButton.length;i++) {
			anotherButton[i] = new JButton(String.format("button-%d", i+1));
		
			anotherPanel.add(myButtons[i]);
		}
		myFrame.add(anotherPanel);
		myFrame.add(myPanel);
	
		
		
	}
	
	public static void TryFlowLayout() {
		JFrame myFrame = new JFrame("My Flow Layout");
		JButton[] myButtons = new JButton[10];
		myButtonActionListener[] actions = new myButtonActionListener[myButtons.length];
		FlowLayout myLayout = new FlowLayout();
		
		myFrame.setLayout(myLayout);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;i<myButtons.length;i++) {
			myButtons[i] = new JButton(String.format("button-%d", i+1));
			actions[i] = new myButtonActionListener();
			actions[i].index =(i+1);
			myButtons[i].addActionListener(actions[i]); 
			myFrame.add(myButtons[i]);
		}
		
		myFrame.setSize(400,400);
		myFrame.setVisible(true);
	}
 
}
