import java.util.ArrayList;

public class CardDealer {
	
	private ArrayList<String> NewDeck =  Cards.getCardDeck();
	
	public void DisplayDeck() {
		for(int i =0; i<=this.NewDeck.size()-1;i++) {
			System.out.println(NewDeck.get(i));
		}
		System.out.println(NewDeck);
	}
	public String GetCard(int cardNum) {
		String SelectedCard = NewDeck.get(cardNum);
		return NewDeck.remove(cardNum);
	}
	public int GetDeckCount() {
		return NewDeck.size();
	}
	
}
