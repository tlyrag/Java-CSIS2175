
public class Board {
	private String[][] board;
	String[] availableArray;
	
	
	Board(int row,int col) {
		String[][] newBoard= new String[row][col];
		for(int i =0; i<row;i++) {
			for(int j = 0; j<col;j++) {
				newBoard[i][j] = "_";
			}
		}
		this.board = newBoard;
	}
	
	public void setMark(int row,int col,String mark) {
		this.board[row][col] =mark;
	}
	public String[][] getBoard() {
		return this.board;
	}
	public void displayBoard() {
		for(int row =0; row<this.board.length;row++) {
			for(int col = 0; col<this.board[0].length;col++) {
				System.out.print(this.board[row][col]+" ");
			}
			System.out.println();
		}
	}
	public void setAvailableArray() {
		String[] availableArray =new String[this.board.length^2];
		
		for(int row =0; row<this.board.length;row++) {
			for(int col = 0; col<this.board[0].length;col++) {
				
			}
			
		}
	}
	
	public void checkAvailableSlot() {
		for(int row =0; row<this.board.length;row++) {
			for(int col = 0; col<this.board[0].length;col++) {
				if(this.board[row][col].equals("_")) {
					
				}
			}
			
		}
		
	}
}
