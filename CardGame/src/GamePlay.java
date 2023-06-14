import java.util.ArrayList;
public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Deck
		CardDealer Dealer = new CardDealer();
		
		// Creating Players
		PlayersHand Computer = new PlayersHand("Computer");
		PlayersHand User = new PlayersHand("user");
		
		//Creating Arrays for Players Hands
		ArrayList<String> UserHand = new ArrayList<String>();
		ArrayList<String> ComputerHand = new ArrayList<String>();
		
		//Checking Deck Count
		int deckSize = Dealer.GetDeckCount();
		System.out.println("Current Deck Size:" + deckSize);
				
		// Dealing Cards to User
		dealCards(UserHand,User,Dealer,1);
		System.out.println(User.getCardHand());
		deckSize = Dealer.GetDeckCount();
		System.out.println("Current Deck Size:" + deckSize);
		

		// Dealing Cards to Computer
		dealCards(ComputerHand,Computer,Dealer,1);
		System.out.println(Computer.getCardHand());
		deckSize = Dealer.GetDeckCount();
		System.out.println("Current Deck Size:" + deckSize);
		
		System.out.println(User.getCardHandValue());
		
	}
	// Method that Receives the player Hands array, the Player that will hold the hand, the deck, and the number of cards to be added in the hand
	public static void dealCards(ArrayList<String> playerHand,PlayersHand player,CardDealer Dealer,int CardNum) {
		for(int i=0;i<=CardNum;i++) {
			playerHand.add(Dealer.GetCard(10));
		}
		player.setCardHand(playerHand);
	}
	
}
