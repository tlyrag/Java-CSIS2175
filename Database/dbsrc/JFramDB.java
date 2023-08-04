import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
public class JFramDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame aFrame = new JFrame("Coffee Order");
		JFrame pane=aFrame;
		final int WIDTH = 350;
		final int HEIGHT = 400;
		//aFrame.setLayout(new FlowLayout());

		
		JLabel myLabel = new JLabel("Name: ");
		
		String[] a= {"aaa","bbb"};
		JList myList = new JList(a);

		
		aFrame.add(myList);
		aFrame.add(myLabel, BorderLayout.BEFORE_FIRST_LINE);
		
		
		JButton button = new JButton("Button 1 (PAGE_START)");
        //pane.add(button, BorderLayout.PAGE_START);
         
        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);
         
        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);
         
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.PAGE_END);
         
        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);
		
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
