
public class TreasureHunting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board newBoard = new Board(20,20);
		boolean gameOver = false;
		int tentatives = 0;
		int maxTentatives = (newBoard.getBoard().length*newBoard.getBoard()[0].length)/2;
		while(!gameOver && tentatives<maxTentatives  ) {
			int[] random = GenerateRandomChoice(newBoard);
			gameOver = newBoard.isTreasure(random[0],random[1]);
			System.out.println();
			tentatives++;
		}
		if(gameOver) {
			System.out.println("Game Over: You Won in " + tentatives);
		} else {
			System.out.println("Game Over: You Lost in " + tentatives);
		}
		
		
	}
	public static int[] GenerateRandomChoice(Board board) {
		int row, col;
	    do {
	        row = (int) (Math.random() * board.getBoard().length);
	        col = (int) (Math.random() * board.getBoard()[0].length);
	    } while (board.getBoard()[row][col] != 0);  // Continue until an unselected cell is found

	    return new int[] {row, col};
		
	}
}
