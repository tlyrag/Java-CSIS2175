import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameWithComponents extends JFrame{
	JLabel myLabel = new JLabel("Name?");
	JTextField myTextField = new JTextField(12);
	JButton myButton = new JButton("OK");
	
	public JFrameWithComponents()
	{
		super("Frame with components");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add(myLabel);
		add(myTextField);
		add(myButton);
		
		DummyActionListener myListener = new DummyActionListener();
		myListener.myButton =  myButton;
		myListener.myLabel = myLabel;
		
		myButton.addActionListener(myListener);
		myTextField.addActionListener(myListener);
	}
	 
}
