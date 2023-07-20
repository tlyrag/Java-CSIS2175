import java.util.Scanner;
public class GamePlay extends Game implements Card{
	public String[] suits = {"Diamonds","Spades","Clubs","Hearts"};
	public String[][] allCards = new String[SYMNUM][CARDNUM];
	public String[] hand = new String[3];
	public static Scanner input = new Scanner(System.in);
	int roundsPlayed = 0;
	int initialBalance = 0;
	
	GamePlay() {
		this.allCards = buildDeck(this.allCards);
	}
	
	public String[][] buildDeck(String[][] deck) {
		String[][] newDeck = deck.clone();
		
		for(int row=0;row<deck.length;row++) {
			for(int col = 0;col<deck[row].length;col++) {
				newDeck[row][col] =  col+1 +"," +suits[row];
			}
		}
		return deck;
	}
	
	public void displayArr() {
		for(int row=0;row<allCards.length;row++) {
			for(int col = 0;col<allCards[row].length;col++) {
				System.out.print(allCards[row][col]+" ");
			}
			System.out.println();
		}
	}
	public void newRound() {
		this.roundsPlayed++;
		this.hand[0] = getCard();
		this.hand[1] = getCard();
		if(this.hand[0] == this.hand[1]) {
			System.out.println("Beware of cheating");
		} else {
			System.out.println("Your hand is: " +this.hand[0] + "and " + this.hand[1]);
		}
		
		
		int betOrFold = getUserInput();
		
		if(betOrFold==1) {
			this.hand[2] =getCard();
			if(this.hand[2]==this.hand[0] || this.hand[2]==this.hand[1]) {
				System.out.println("Beware of cheating");
			}
			roundWinner();
		} else {
			return;
		}
		
	}
	public int getUserInput() {
		
		System.out.println("Enter 0 to fold  or 1 to bet");
		try {
			int userInput = input.nextInt();
			if(userInput !=0 && userInput !=1) {
				throw new Exception("You must enter 0 or 1");
			} else {
				return userInput;
			}
		} catch(Exception err) {
			return getUserInput();
		}
	}
		
		
	@Override
	public String getCard() {
		// TODO Auto-generated method stub
		int randomCard = (int)(Math.random()*CARDNUM);
		int randomSuit = (int)(Math.random()*SYMNUM);
		
		return allCards[randomSuit][randomCard];
		
	}

	@Override
	public void gameStart() {
		// TODO Auto-generated method stub
		this.balance =50;
		this.initialBalance =50;
		System.out.println("Game Start! You have $"+ this.balance );
	}

	@Override
	public void roundWinner() {
		// TODO Auto-generated method stub
		
		// Split the card by , and get the number of the card
		int firstNum = Integer.parseInt(this.hand[0].split(",")[0]);
		int secondNum = Integer.parseInt(this.hand[1].split(",")[0]);
		int midleCard = Integer.parseInt(this.hand[2].split(",")[0]);
		
		System.out.println("Card Draw :" + this.hand[2]);
		
		if(midleCard>firstNum && midleCard<secondNum) {
			System.out.println("You win");
			this.balance++;
		} else if(midleCard<firstNum && midleCard>secondNum) {
			System.out.println("You win");
			this.balance++;
		} else {
			System.out.println("You lose");
			this.balance--;
		}
	}
	@Override
	public  String toString() {
		StringBuilder gameInfo = new StringBuilder();
		gameInfo.append("Rounds Played: " + this.roundsPlayed + "\n");
		gameInfo.append("Initial Balance: " + this.initialBalance + "\n");
		gameInfo.append("Current Balance: " + this.balance + "\n");
		
		return gameInfo.toString();
	}
}
