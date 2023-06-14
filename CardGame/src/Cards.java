import java.util.ArrayList;
public class Cards {
	private static int[] CardValue = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	private static String[] CardName = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private static String[] CardSuit = {"Clubs","Spades","Headts","Diamonds"};
	
	public static ArrayList<String> getCardDeck() {
		ArrayList<String> deck = new ArrayList<String>();
		for(int i=0; i< CardSuit.length; i++) {
			for(int j=0; j< CardName.length; j++) {
				String Card = CardSuit[i]+"_"+CardName[j]+"_"+CardValue[j];
				//System.out.println(Card);
				deck.add(Card);
			}
		}
		return deck;
	}
} 
