
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board newBoard = new Board(3,3);
		
		newBoard.displayBoard();
		System.out.println();
		int[] randomSelection =generateRandom(newBoard.getBoard());
		newBoard.setMark(randomSelection[0],randomSelection[1],"X");
		newBoard.displayBoard();
	}
	
	
	
	public static int[] generateRandom(String[][] arr) {
		int[] randomArray = new int[2];
		
		int randomRow =  (int) (Math.random() * (arr.length));
		int randomCol =  (int) (Math.random() * (arr[randomRow].length));
		
		randomArray[0]=randomRow;
		randomArray[1]=randomRow;
		return randomArray;
	}

}
