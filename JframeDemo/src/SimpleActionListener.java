import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimpleActionListener implements ActionListener {
	JTextField mTextField;
	JButton myButton;


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		String result;
		if(obj == myButton) {
			result = "Hello " + mTextField.getText() + " !";
			
		} else {
			result = "Hi Stranger";
		}
		JOptionPane.showMessageDialog(null, result);
		
	}

}
