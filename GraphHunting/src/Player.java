import java.util.ArrayList;
public abstract class Player {
	int currentPosition;
	boolean isAlive = true;
	
	public void move(Map currentMap) {
		
		ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
		possibleMoves = currentMap.nextIndexes;
		int randomMove = (int)(Math.random() * (possibleMoves.size()-1));
		this.currentPosition = possibleMoves.get(randomMove); 
		
	}
	
}
