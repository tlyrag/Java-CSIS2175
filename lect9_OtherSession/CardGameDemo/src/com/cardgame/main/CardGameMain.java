package com.cardgame.main;

import java.util.Scanner;
public class CardGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String usrResp = "y";
		CardGame myGame = new CardGame("ABC",10);
		
		myGame.gameStart();
		while(usrResp.equals("y") && myGame.myPlayer.score>=0 && myGame.poker.deck.size()>=3)
		{
			myGame.Play();
			System.out.println("Do you want to play again? Y to continue, otherwise quit");
			usrResp = input.nextLine();
		}
			
		
	}

}
