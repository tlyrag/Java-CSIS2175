import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DummyActionListener implements ActionListener {

	JLabel myLabel;
	
	JButton myButton;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object evtSource = e.getSource();
		if(evtSource==myButton)
		{
			JOptionPane.showMessageDialog(null, "Button clicked!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Enter key pressed!");
		}
		
	}

}
