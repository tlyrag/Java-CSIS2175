import java.util.ArrayList;
public class Player {
	private String PlayerName;
	//private int PlayerHandCount;
	public ArrayList<Integer> PlayerHand = new ArrayList<Integer>();
	
	
	
//	public void setPlayerHand() {
//		//this.PlayerHand = [1,2];
//	}
	Player(String name,ArrayList<Integer> hand) {
		this.PlayerName=name;
		this.PlayerHand=hand;
	}
}
