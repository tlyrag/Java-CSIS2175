import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

public class DBGUIDemo extends JFrame implements ActionListener,ItemListener {
	
	JPanel titlePanel = new JPanel();
	JPanel coffeelPanel = new JPanel();
	JPanel customerlPanel = new JPanel();
	JPanel inputlPanel = new JPanel();
	JPanel controlPanel = new JPanel();
	ArrayList<JRadioButton> coffeeButtons= new ArrayList<JRadioButton>();
	ButtonGroup coffeeGroup = new ButtonGroup();
	
	ArrayList<JRadioButton> customerButtons= new ArrayList<JRadioButton>();
	ButtonGroup customerGroup = new ButtonGroup();
	
	ArrayList<String> coffeeList = new ArrayList<String>();
	ArrayList<String> custList = new ArrayList<String>();
	
	JButton submitBtn = new JButton("Submit");
	JButton cancelBtn = new JButton("Cancel");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBGUIDemo frame = new DBGUIDemo();
	}
	
	public  DBGUIDemo() {
		setLayout(new BorderLayout());
		
		setSize(800,1000);
		AddTitle();
		AddCoffee();
		AddCustomer();
		AddInput();
		AddControl();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public void AddTitle() {
		JLabel titleLabel = new JLabel("ABC Coffee Order System");
		titlePanel.setLayout(new FlowLayout());
		titlePanel.add(titleLabel);

		add(titlePanel,BorderLayout.NORTH);
		
	}
	public void AddCoffee() {
		
		coffeelPanel.setLayout(new BoxLayout(coffeelPanel,BoxLayout.Y_AXIS));
		try {
			coffeeList = CoffeeDBManager.getCoffeeNames();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<coffeeList.size();i++) {
			coffeeButtons.add(new JRadioButton(coffeeList.get(i)));
			coffeeGroup.add(coffeeButtons.get(i));
			//coffeeButtons.get(i).setAlignmentX(Component.LEFT_ALIGNMENT);
			coffeelPanel.add(coffeeButtons.get(i));
		}
	
		
		add(coffeelPanel,BorderLayout.LINE_START);
	}
	public void AddCustomer() {
		customerlPanel.setLayout(new BoxLayout(customerlPanel,BoxLayout.Y_AXIS));
		try {
			custList = CoffeeDBManager.getCustomerNames();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<custList.size();i++) {
			customerButtons.add(new JRadioButton(custList.get(i)));
			customerGroup.add(customerButtons.get(i));
			//coffeeButtons.get(i).setAlignmentX(Component.LEFT_ALIGNMENT);
			customerlPanel.add(customerButtons.get(i));
		}
		add(customerlPanel,BorderLayout.CENTER);
	}
	public void AddInput() {
		JLabel inputQtLabel = new JLabel("Please add the quantity of coffee you need:");
		JTextField inputQtField = new JTextField(15);
		JLabel inputDateLabel = new JLabel("Please add the Date for Delivery:");
		JTextField inputDateField = new JTextField(15);
		inputlPanel.setLayout(new BoxLayout(inputlPanel,BoxLayout.Y_AXIS));
		inputlPanel.add(inputQtLabel);
		inputlPanel.add(inputQtField);
		inputlPanel.add(inputDateLabel);
		inputlPanel.add(inputDateField);
		add(inputlPanel,BorderLayout.LINE_END);
	}
	public void AddControl() {
		
		controlPanel.setLayout(new FlowLayout());
		controlPanel.add(submitBtn);
		controlPanel.add(cancelBtn);
		submitBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		add(controlPanel,BorderLayout.SOUTH);
	}
	public static ArrayList<String> getCoffeeName() {
		ArrayList<String> coffeeList = new ArrayList<>();
		try {
			coffeeList = CoffeeDBManager.getCoffeeNames();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<coffeeList.size();i++) {
			
		}
		return coffeeList;
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj==submitBtn) {
			
		}
	}

}
