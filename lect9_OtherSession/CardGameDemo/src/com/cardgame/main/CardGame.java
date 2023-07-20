package com.cardgame.main;

import com.cardgaem.resource.Game;
import java.util.Scanner;

public class CardGame extends Game {
	PokerCard poker;
	public CardGame(String name, int score) {
		super(name, score);
		// TODO Auto-generated constructor stub
	}
	
	public void Play()
	{
		Scanner input = new Scanner(System.in);
		String usrResp;
		System.out.println("Hello, " + myPlayer.name+  ", here are the two cards: ");
		
		poker.cardsIndex = 0;
		poker.getCard();
		System.out.println(poker.cards[poker.cardsIndex]);
		
		poker.cardsIndex = 2;
		poker.getCard();
		System.out.println(poker.cards[poker.cardsIndex]);
		System.out.println("Hello, " + myPlayer.name+  ", bet[b] or fold[f]:");
		
		usrResp = input.nextLine();
		
		if(usrResp.equals("b"))
		{
			System.out.println("Bravo, here is your new card: ");
			poker.cardsIndex = 1;
			poker.getCard();
			System.out.println(poker.cards[poker.cardsIndex]);
			roundWinner();
		}
	}

	@Override
	public void gameStart() {
		// TODO Auto-generated method stub
		System.out.println("Game started!");
		poker = new PokerCard();
	}

	@Override
	public boolean roundWinner() {
		// TODO Auto-generated method stub
		int c1, c2, c3;
		c1 = poker.cards[0].num;
		c2 = poker.cards[1].num;
		c3 = poker.cards[2].num;
		
		if((c1>c2 && c2>c3) || (c1<c2 && c2<c3))
		{
			System.out.println("Congrats! You win!");
			myPlayer.score ++ ;
			System.out.println("Here is your new score: " + myPlayer.score);
			return true;
		}
		else
		{
			System.out.println("Sorry! You lose!");
			myPlayer.score -- ;
			System.out.println("Here is your new score: " + myPlayer.score);
			return false;
		}
	}

}
