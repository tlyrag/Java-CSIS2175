
public class Board {

	private int[][] board;
	private int[][] visibleBoard;
	private int tentatives=0;
	
	Board(int row,int col) {
		int[][] newBoard = new int[row][col];
		
		for(int i=0;i<row;i++ ) {
			for(int j=0;j<row;j++ ) {
				newBoard[i][j] =0;
			}	
		}
		this.board=newBoard;
		this.visibleBoard=newBoard;
		setTreasure();
	}
	public int[][] getBoard(){
		return this.board;
	}
	public void setTreasure() {
		int randomRow =  (int) (Math.random()*(this.board.length));
		int randomCol =  (int) (Math.random()*(this.board[0].length));
		
		this.board[randomRow][randomCol] =1;
	}
	public boolean isTreasure(int row, int col) {
		this.tentatives++;
		if(this.board[col][row]==1) {
			return true;
		}
		setChoice( row, col);
		displayVisibleBoard();
		return false;
	}
	public void setChoice(int row, int col) {
		this.visibleBoard[row][col] =2;
		
	}
	public void displayVisibleBoard() {
		for(int row=0;row<this.visibleBoard.length;row++ ) {
			for(int col=0;col<this.visibleBoard[0].length;col++ ) {
				System.out.print(this.visibleBoard[row][col]+" ");
			}	
			System.out.println();
		}
	}

}
