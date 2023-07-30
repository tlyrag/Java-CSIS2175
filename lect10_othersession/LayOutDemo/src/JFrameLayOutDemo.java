import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.*;
public class JFrameLayOutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryFlowLayout();
		TryBorderLayout();
		TryBoxLayout();
		TryNullLayout();
	}
	
	public static void TryNullLayout()
	{
		JFrame myFrame = new JFrame("Null layout!");
		JPanel myPanel = new JPanel();
		JPanel anotherPanel = new JPanel();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton[] myButtons = new JButton[6];
		
		myPanel.setLayout(null);
		for(int i=0;i<myButtons.length;i++)
		{
			myButtons[i] = new JButton(String.format("button-%d", (i+1)));
			myButtons[i].setBounds(40+100*i,100,100,40);
			myPanel.add(myButtons[i]);
		}
		
		myFrame.add(myPanel);
		myFrame.setSize(800,400);
		myFrame.setVisible(true);
	}
	
	public static void TryBoxLayout()
	{
		JFrame myFrame = new JFrame("Box layout!");
		JPanel myPanel = new JPanel();
		JPanel anotherPanel = new JPanel();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton[] myButtons = new JButton[6];
		JButton[] otherButtons = new JButton[6];
		myButtonAction[] actions = new myButtonAction[myButtons.length];
		
		FlowLayout myFlow = new FlowLayout();
		myFrame.setLayout(myFlow);
		
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		anotherPanel.setLayout(new BoxLayout(anotherPanel,BoxLayout.Y_AXIS));
		for(int i=0;i<myButtons.length-1;i++)
		{
			myButtons[i] = new JButton(String.format("button-%d", (i+1)));
			otherButtons[i] = new JButton(String.format("button-%d", (i+1)));
			actions[i] = new myButtonAction();
			actions[i].index = (i+1);
			myButtons[i].addActionListener(actions[i]);	
			
			myButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			otherButtons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			myPanel.add(myButtons[i]);
			anotherPanel.add(otherButtons[i]);
		}
		myFrame.add(myPanel);
		int i=5;
		myButtons[i] = new JButton(String.format("button-%d", (i+1)));
		actions[i] = new myButtonAction();
		actions[i].index = (i+1);
		myButtons[i].addActionListener(actions[i]);	
		
		myFrame.add(myButtons[i]);   //not added to panel, added to fram instead
		
		JButton tmpButton = new JButton("tmp");
		myFrame.add(tmpButton);
		
		myFrame.add(anotherPanel);
		//myFrame.setSize(400,400);
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
	public static void TryBorderLayout()
	{
		JFrame myFrame = new JFrame("Border layout!");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton[] myButtons = new JButton[5];
		myButtonAction[] actions = new myButtonAction[myButtons.length];
		
		BorderLayout myLayout = new BorderLayout();
		
		for(int i=0;i<myButtons.length;i++)
		{
			myButtons[i] = new JButton(String.format("button-%d", (i+1)));
			actions[i] = new myButtonAction();
			actions[i].index = (i+1);
			myButtons[i].addActionListener(actions[i]);			
		}
		
		myFrame.add(myButtons[0],BorderLayout.PAGE_START);
		myFrame.add(myButtons[1],BorderLayout.LINE_START);
		myFrame.add(myButtons[2],BorderLayout.CENTER);
		myFrame.add(myButtons[3],BorderLayout.LINE_END);
		myFrame.add(myButtons[4],BorderLayout.PAGE_END);
		
		myFrame.setSize(400, 400);
		//myFrame.pack();
		myFrame.setVisible(true);
		
	}
	
	public static void TryFlowLayout()
	{
		JFrame myFrame = new JFrame("Flow layout!");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton[] myButtons = new JButton[10];
		myButtonAction[] actions = new myButtonAction[myButtons.length];
		
		
		
		FlowLayout myLayout = new FlowLayout();
		myFrame.setLayout(myLayout);
		
		for(int i=0;i<myButtons.length;i++)
		{
			myButtons[i] = new JButton(String.format("button-%d", (i+1)));
			actions[i] = new myButtonAction();
			actions[i].index = (i+1);
			myButtons[i].addActionListener(actions[i]);
			myFrame.add(myButtons[i]);
		}
		
		myFrame.setSize(400, 200);
		//myFrame.pack();
		myFrame.setVisible(true);
		
	}

}
