import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.ArrayList;
public class SwingDBDemo extends JFrame implements ItemListener,ActionListener {
	 
	ArrayList<String> allCoffees;
	ArrayList<String> allCustomers;
	JLabel lableNumber = new JLabel("Enter the quantity: ");

	JLabel lableDate = new JLabel("Enter the date: ");
	JTextField inputNumber = new JTextField(20);
	JTextField inputDate = new JTextField(20);
	
	JPanel customerPanel = new JPanel(); 
	JPanel coffeePanel = new JPanel(); 
	JPanel inputPanel = new JPanel(); 
	JPanel controlPanel = new JPanel();
	JPanel titlePanel = new JPanel();
	
	ArrayList<JRadioButton> customerbutton= new ArrayList<JRadioButton>();
	ArrayList<JRadioButton> coffeebutton= new ArrayList<JRadioButton>();
	//JRadioButton customerbutton[] = new JRadioButton[3];          
  	ButtonGroup customerGroup = new ButtonGroup();  
  	//JRadioButton coffeebutton[] = new JRadioButton[5];          
  	ButtonGroup coffeeGroup = new ButtonGroup();  
  	
  	
  	
  	JButton submit = new JButton("Submit");
  	JButton cancel = new JButton("Cancel");
	public SwingDBDemo()
	{
		
		try {
			allCustomers =  CoffeeDBManager.getCustomerNames();
			allCoffees = CoffeeDBManager.getCoffeeNames();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		setLayout(new BorderLayout());
	
		titlePanel.setLayout(new FlowLayout());
		titlePanel.add(new Label("Coffee Order System"));
		add(titlePanel,BorderLayout.NORTH);
		
		//button = new JButton("Button 2 (CENTER)");
		customerPanel.setPreferredSize(new Dimension(100, 100));
	    customerPanel.setLayout(new BoxLayout(customerPanel,BoxLayout.Y_AXIS));
	    
	    
	    for (int i = 0; i < allCustomers.size(); i++) 
	  	{              
	    	customerbutton.add(new JRadioButton(allCustomers.get(i)));
	    	//[i] = new JRadioButton(i + "???????");
	    	 
	    	customerbutton.get(i).setAlignmentX(Component.LEFT_ALIGNMENT);
	    	customerGroup.add(customerbutton.get(i));   
	    	customerPanel.add(customerbutton.get(i));
	  	}          
	    
	    
	    //customerPane.add(coffee);
		add(customerPanel,BorderLayout.CENTER);
		
		coffeePanel.setPreferredSize(new Dimension(200, 100));
		coffeePanel.setLayout(new BoxLayout(coffeePanel,BoxLayout.Y_AXIS));
		coffeePanel.setBorder( BorderFactory.createEmptyBorder(10,10,10,10));
		 for (int i = 0; i < allCoffees.size(); i++) 
		 {              
			 coffeebutton.add(new JRadioButton(allCoffees.get(i))) ;
			 coffeebutton.get(i).setAlignmentX(Component.LEFT_ALIGNMENT);
			 coffeeGroup.add( coffeebutton.get(i));   
			 coffeePanel.add( coffeebutton.get(i));
		 }          
		
		 
		 
		add(coffeePanel,BorderLayout.LINE_START);
		
		//
		//inputPanel.setLayout(new FlowLayout());

		inputPanel.setLayout(new BoxLayout(inputPanel,BoxLayout.Y_AXIS));
		inputPanel.setPreferredSize(new Dimension(300, 100));
		lableNumber.setAlignmentX(Component.LEFT_ALIGNMENT);
		inputNumber.setMaximumSize(
			    new Dimension(Integer.MAX_VALUE,
			    		inputNumber.getPreferredSize().height));
		//inputNumber.setSize(200, 30);
		//inputNumber.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		inputPanel.add(lableNumber);
		inputPanel.add(inputNumber);
		//inputPanel.add(lableDate);
		//inputPanel.add(inputDate);		
		add(inputPanel,BorderLayout.LINE_END);
		inputPanel.setBorder( BorderFactory.createEmptyBorder(10,10,10,10));
		
		submit.addActionListener(this);
		cancel.addActionListener(this);
		
		controlPanel.setLayout(new FlowLayout());
		controlPanel.add(submit);
		controlPanel.add(cancel);
		add(controlPanel,BorderLayout.SOUTH);
		

		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingDBDemo mySwing = new SwingDBDemo();
		final int WIDTH = 750;
		final int HEIGHT = 600;
		mySwing.setSize(WIDTH, HEIGHT);
		mySwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mySwing.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object btn = arg0.getSource();
		if(btn==cancel)
		{
			JOptionPane.showMessageDialog(this, "canceled!");
			System.exit(0);
		}
		else
		{
			
			String customerName = "";
		               
			 Enumeration<AbstractButton> allRadioButton=customerGroup.getElements();  
		     while(allRadioButton.hasMoreElements())  
		     {  
		    	 JRadioButton temp=(JRadioButton)allRadioButton.nextElement();  
		         if(temp.isSelected())  
		         {  
		        	 customerName = temp.getText();  
		         }  
		     }            
			 
		     String coffeeName = "";
		     allRadioButton=coffeeGroup.getElements();  
		     while(allRadioButton.hasMoreElements())  
		     {  
		    	 JRadioButton temp=(JRadioButton)allRadioButton.nextElement();  
		         if(temp.isSelected())  
		         {  
		        	 coffeeName = temp.getText();  
		         }  
		     }    
		     
		    
		     String prodNum="";
		     String orderDate = "";
		     String custNum = "";
		     int quantity = 0;
		     double price = 0;
		     
		     try 
		     {
				prodNum = CoffeeDBManager.getProdNum(coffeeName);
				price = CoffeeDBManager.getCoffeePrice(prodNum);
				custNum = CoffeeDBManager.getCustomerNum(customerName);
				quantity = Integer.parseInt(inputNumber.getText());
				orderDate = inputDate.getText();
				CoffeeDBManager.submitOrder(custNum, prodNum, quantity, price, orderDate);
		     } 
		     catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		     }
		     
		     JOptionPane.showMessageDialog(this, "Submitted order: \n" +
		    		 custNum+" "+prodNum+" "+ quantity+" "+price+" "+orderDate);
		}

	}
	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
