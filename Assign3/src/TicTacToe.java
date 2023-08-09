import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TicTacToe implements ActionListener{
	
	
	JButton[] btns = new JButton[9];
	JPanel[] panels = new JPanel[3];
	JPanel container = new JPanel();
	JFrame gameFrame = new JFrame("Tic Tac Toe");
	JButton startGame = new JButton("Start New Game");
	JLabel playerLabel = new JLabel("Player 1 Turn");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe game = new TicTacToe();
		
				
	}
	
	
	
	public TicTacToe() {
		// TODO Auto-generated constructor stub
		startFrame();
	}
	
	public  void startFrame() {
		
		addBtns();
		container.add(playerLabel);
		container.add(startGame);
		startGame.addActionListener(this);
		container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
		gameFrame.add(container);
		
		
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setLayout(new FlowLayout());
		gameFrame.setSize(350,350);
		gameFrame.setVisible(true);
	}
	
	public  void addBtns() {
		
		int btnCount =0;
		for(int j=0;j<panels.length;j++) {
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			for(int i =0; i<btns.length/panels.length;i++) {
				JButton btn = new JButton("   ");
				Font  font  = new Font(Font.SERIF, Font.PLAIN,  50);
				btn.setFont(font);
				btn.addActionListener(this);
				panel.add(btn);
				btns[btnCount]=btn;
				btnCount++;
				
			}
		
			gameFrame.add(panel);
		}
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj instanceof JButton) {
			JButton button = (JButton)obj; 
			if(playerLabel.getText().equals("Player 1 Turn") && button.getText().equals("   ")) {
				button.setText("X");
				if(checkWin()) {
					JOptionPane.showMessageDialog(startGame, "Player 1 Win");
					RestartGame();
				} else if(checkTie()) {
					JOptionPane.showMessageDialog(startGame, "Tie");
					RestartGame();
				}
				
				playerLabel.setText("Player 2 Turn");
			} else if(playerLabel.getText().equals("Player 2 Turn") && button.getText().equals("   ")) {
				button.setText("O");
				if(checkWin()) {
					JOptionPane.showMessageDialog(startGame, "Player 2 Win");
					RestartGame();
				} else if(checkTie()) {
					JOptionPane.showMessageDialog(startGame, "Tie");
					RestartGame();
				}
				playerLabel.setText("Player 1 Turn");
			} else if(button.getText().equals("Start New Game")) {
				RestartGame();
			}
			
			
		}
		
		
	}
	public boolean checkWin() {
		//checking rows columns and diagonals
		
		String row1 = btns[0].getText()+btns[1].getText()+btns[2].getText();
		String row2 = btns[0].getText()+btns[3].getText()+btns[6].getText();
		String row3 = btns[0].getText()+btns[4].getText()+btns[8].getText();
		String col1 = btns[1].getText()+btns[4].getText()+btns[7].getText();
		String col2 = btns[2].getText()+btns[5].getText()+btns[8].getText();
		String col3 = btns[3].getText()+btns[4].getText()+btns[5].getText();
		String diag1 = btns[6].getText()+btns[7].getText()+btns[8].getText();
		String diag2 = btns[6].getText()+btns[4].getText()+btns[2].getText();
		
		if(row1.equals("XXX") || row1.equals("OOO")) {
			return true;
		}
		if(row2.equals("XXX") || row2.equals("OOO")) {
			return true;
		}
		if(row3.equals("XXX") || row3.equals("OOO")) {
			return true;
		}
		if(col1.equals("XXX") || col1.equals("OOO")) {
			return true;
		}
		if(col2.equals("XXX") || col2.equals("OOO")) {
			return true;
		}
		if(col3.equals("XXX") || col3.equals("OOO")) {
			return true;
		}
		if(diag1.equals("XXX") || diag1.equals("OOO")) {
			return true;
		}
		if(diag2.equals("XXX") || diag2.equals("OOO")) {
			return true;
		}
		// Checking if all fields were selected and none of previous conditions were met
		for(int i=0;i<btns.length;i++) {
			
		}
			return false;
	}
	public boolean checkTie() {
	for(int i=0;i<btns.length;i++) {
			if(btns[i].getText().equals("   ")) {
				return false;
			}
		
		}
		return true;
	}
	public void RestartGame() {
		for(int i =0;i<btns.length;i++) {
			btns[i].setText("   ");
			playerLabel.setText("Player 1 Turn");
		}
	}

}
