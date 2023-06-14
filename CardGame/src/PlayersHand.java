import java.util.ArrayList;
public class PlayersHand {
	private String name;
	private ArrayList<String> CardHand;
	
	public PlayersHand(String Name) {
		this.name= Name;
	}
	public void setCardHand(ArrayList<String> Cards) {
		this.CardHand = Cards;
	}
	public ArrayList<String> getCardHand() {
		return this.CardHand;
	}
	public void addCardtoHand(String Card) {
		this.CardHand.add(Card);
	}
	public int getCardHandValue() {
		int cardSum=0;
		for(int i=0; i<this.CardHand.size();i++) {
			cardSum += Integer.parseInt(CardHand.get(i).split("_")[2]) ;
			
			//cardSum =
		}
		return cardSum;
	}
}
