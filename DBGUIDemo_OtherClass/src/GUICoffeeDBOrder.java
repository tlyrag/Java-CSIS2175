import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.*;

public class GUICoffeeDBOrder extends JFrame implements ActionListener,ItemListener{

	JPanel titlePanel = new JPanel();
	JPanel coffeePanel = new JPanel();
	JPanel customPanel = new JPanel();
	JPanel inputPanel = new JPanel();
	JPanel controlPanel = new JPanel();
	
	JTextField inputTxtField = new JTextField(20);
	
	ArrayList<String> coffeeList;
	ArrayList<String> customList ;
	
	ArrayList<JRadioButton> coffeeButton = new ArrayList<JRadioButton>(); 
	ButtonGroup coffeeGroup = new ButtonGroup();
	
	ArrayList<JRadioButton> customButton = new ArrayList<JRadioButton>(); 
	ButtonGroup customGroup = new ButtonGroup();
	
	JButton btnSubmit = new JButton("Submit");
	JButton btnCancel = new JButton("Cancel");
	
	public GUICoffeeDBOrder()
	{
		setLayout(new BorderLayout());
		
		AddTitle();
		AddCoffeeList();
		AddCustom();
		AddInput();
		AddControl();
	}
	
	public void AddControl()
	{
		controlPanel.setLayout(new FlowLayout());
		
		btnSubmit.addActionListener(this);
		btnCancel.addActionListener(this);
		controlPanel.add(btnSubmit);
		controlPanel.add(btnCancel);
		
		add(controlPanel,BorderLayout.SOUTH);
	}
	
	public void AddInput()
	{
		JLabel inputLabel = new JLabel("Pls let me know how much coffee do you need: ");
		
		
		inputPanel.setLayout(new BoxLayout(inputPanel,BoxLayout.Y_AXIS));
		inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		inputLabel.setAlignmentX(LEFT_ALIGNMENT);
		inputTxtField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 
						inputTxtField.getPreferredSize().height));
		inputTxtField.setAlignmentX(LEFT_ALIGNMENT);
		
		inputPanel.add(inputLabel);
		inputPanel.add(inputTxtField);
		
		add(inputPanel, BorderLayout.LINE_END);
		
	}
	
	public void AddCoffeeList()
	{
		try 
		{
			coffeeList = CoffeeDBManager.getCoffeeNames();
			coffeePanel.setLayout(new BoxLayout(coffeePanel,BoxLayout.Y_AXIS));
			coffeePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			for(int i=0;i<coffeeList.size();i++)
			{
				coffeeButton.add(new JRadioButton(coffeeList.get(i)));
				coffeeGroup.add(coffeeButton.get(i));
				coffeeButton.get(i).setAlignmentX(Component.LEFT_ALIGNMENT);
				coffeePanel.add(coffeeButton.get(i));				
			}
			
			add(coffeePanel,BorderLayout.LINE_START);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void AddCustom()
	{
		try 
		{
			customList = CoffeeDBManager.getCustomerNames();
			customPanel.setLayout(new BoxLayout(customPanel,BoxLayout.Y_AXIS));
			customPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			for(int i=0;i<customList.size();i++)
			{
				customButton.add(new JRadioButton(customList.get(i)));
				customGroup.add(customButton.get(i));
				customButton.get(i).setAlignmentX(Component.LEFT_ALIGNMENT);
				customPanel.add(customButton.get(i));
			}
			
			add(customPanel,BorderLayout.CENTER);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void AddTitle()
	{
		JLabel titleLable = new JLabel("Coffee Order System");
		titlePanel.setLayout(new FlowLayout());
		
		titlePanel.add(titleLable);
		
		add(titlePanel,BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUICoffeeDBOrder myOrderSys = new GUICoffeeDBOrder();
		myOrderSys.setSize(600, 600);
		myOrderSys.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myOrderSys.setVisible(true);
	}

	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source==btnSubmit)
		{
			JOptionPane.showMessageDialog(null, "submit clicked!");
			
			String customName = "";
			String coffeeName = "";
			String coffeeNum = "";
			int quantity;
			double price;
			
			Enumeration<AbstractButton> allRadioButton = customGroup.getElements();
			
			while(allRadioButton.hasMoreElements())
			{
				JRadioButton tmp = (JRadioButton) allRadioButton.nextElement();
				if(tmp.isSelected())
				{
					customName = tmp.getText();
				}
			}
			
			allRadioButton = coffeeGroup.getElements();
			
			while(allRadioButton.hasMoreElements())
			{
				JRadioButton tmp = (JRadioButton) allRadioButton.nextElement();
				if(tmp.isSelected())
				{
					coffeeName = tmp.getText();
				}
			}
			
			try 
			{
				coffeeNum = CoffeeDBManager.getProdNum(coffeeName);
				price = CoffeeDBManager.getCoffeePrice(coffeeNum);
				quantity = Integer.parseInt(inputTxtField.getText());
				
				String order = customName + " " + coffeeName + " " + coffeeNum + " " + 
						quantity + " " + quantity * price;
				
				JOptionPane.showMessageDialog(null, order);
				
			} 
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "cancel clicked!");
		}
	}

}
