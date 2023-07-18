package com.cardgame.main;

import com.cardgame.resource.Player;
import java.util.Scanner;

public class CardGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardGame myGame = new CardGame();
		Player myPlayer = new Player("ABC",10);
		Scanner input = new Scanner(System.in);
		myGame.gameStart();
		
		String usrInput = "Y";
		String betOrFold="";
		
		while(usrInput.equals("Y") && myPlayer.score>0 && myGame.cards.deck.size()>2)
		{
			System.out.println("Hi, "+ myPlayer.name + ", here are the two cards: ");
			myGame.cards.getCard();
			System.out.println("Bet[B] or Fold[F]?");
			betOrFold = input.nextLine();
			
			if(betOrFold.equals("B"))
			{
				System.out.println("Bravo, here is the new card");
				myGame.cards.get2ndCard();
				int c1,c2,c3;
				
				c1 = myGame.cards.c1.num;
				c2 = myGame.cards.c2.num;
				c3 = myGame.cards.c3.num;
				if((c1>c2&&c2>c3)||(c1<c2 && c2<c3))
				{
					System.out.println("Congrats! You win!");
					myPlayer.score++;
					System.out.println("Here is your score: "+ myPlayer.score);
				}
				else
				{
					System.out.println("Sorry! You lose!");
					myPlayer.score--;
					System.out.println("Here is your score: "+ myPlayer.score);
				}
				
			}
			else
			{
				System.out.println("You fold.");
			}
			
			System.out.println("Do you want to play again? Y to continue");
			usrInput = input.nextLine();
		}
		
		
		/*
		for(int i=0;i<100;i++)
		{
			myGame.cards.getCard();
		}*/
	}

}
