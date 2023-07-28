import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameWithComp extends JFrame implements ActionListener{
	JLabel myLabel = new JLabel("What is your name");
	JTextField myTextField = new JTextField(10);
	JButton myBtn = new JButton("OK");
	
	public JFrameWithComp() {
		super("JFrame With Componenet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		
	
		//myTextField.addActionListener(this);
		
		SimpleActionListener smpAct = new SimpleActionListener();
		smpAct.mTextField = myTextField;
		smpAct.myButton= myBtn;
		myBtn.addActionListener(smpAct);
		
		
		
		add(myLabel);
		add(myTextField);
		add(myBtn);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String result = "Hi, " + myTextField.getText()+ " !";
		JOptionPane.showMessageDialog(null, result);
	}
}
