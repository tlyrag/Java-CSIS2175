import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class myItemListener implements ItemListener {
	public JLabel myLabel;
	public JComboBox myCMB;
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		myLabel.setText(myCMB.getSelectedItem()+" selected!");
		JOptionPane.showMessageDialog(null, myCMB.getSelectedItem()+" selected!");
	}

}
