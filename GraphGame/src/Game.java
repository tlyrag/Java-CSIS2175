import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph gameMap = new Graph(10,3);
		gameMap.printMap();
		generateRandomPlayer(4,gameMap);
		int maxRounds =100;
		int currentRounds= 0;
		while(currentRounds<maxRounds) {
			playTurn(gameMap);
			currentRounds++;
		}
		
	}
	
	public static void generateRandomPlayer(int playerNum,Graph map) {
		for(int i = 0;i<playerNum;i++) {
			int randomChar =(int) (Math.random()*2);
			int randomStr = (int)(Math.random()*20);
			int randomInitiative = (int)(Math.random()*20);
			int randomPosition = (int)(Math.random()*9);
			
			if(randomChar ==1) {
				Warrior newWar = new Warrior(i,randomStr,randomInitiative);
				map.vertixArray.get(randomPosition).playerList.add(newWar);
				System.out.println("Warriror added to:" + randomPosition);
			} else  {
				Archer newArch = new Archer(i,randomStr,randomInitiative);
				map.vertixArray.get(randomPosition).playerList.add(newArch);
				System.out.println("Archer added to:" + randomPosition);
			}
		}
	}
	 public static void playTurn(Graph map) {
		 
		 for(int i =0;i< map.vertixArray.size();i++) {
			 // List of player in each vertix
			 ArrayList<Player> playerList = map.vertixArray.get(i).playerList;
			 //Attack turn
			 attackTurn(playerList);
			 
			//Move turn
			 moveTurn(map.vertixArray.get(i), map);
			 }
		 
	
	 }
	 
	 public static void attackTurn( ArrayList<Player> playerList) {
		 if(playerList.size()>1) {
			 for(int j=0;j<playerList.size();j++) {
				 //mudar ainda
				 playerList.get(j).attack(playerList.get(j));
				 System.out.println(playerList.get(j).getId() + ": Player attacked");
			 }
		 }
	 }
	 public static void moveTurn(Vertex vertex,Graph map) {
		 
		 if(vertex.playerList.size()>0) {
			 for(int k=0;k<vertex.playerList.size();k++) {
				 //Saving currentPlayer
				 Player currentPlayer = vertex.playerList.get(k);
				 //removing currentplayer from vertix
				 vertex.playerList.remove(k);
				 //generate Next random Position for player
				 int randomNext = (int)(Math.random() * vertex.nextIndex.size());
				 randomNext = vertex.nextIndex.get(randomNext);
				 map.vertixArray.get(randomNext).playerList.add(currentPlayer);
				 System.out.println("Player: " + currentPlayer.getId() + " Moved to position: " + randomNext);
			 }
		 }
	 }
	
}
