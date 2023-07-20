package com.cardgame.main;

import com.cardgame.resource.Game;
import com.cardgame.resource.Poker;
import com.cardgame.resource.PokerCard;

public class CardGame implements Game{
	Poker cards = new Poker();
	@Override
	public void gameStart() {
		System.out.println("Hello, my friend, let's have some fun!");
		PokerCard tmp;
		// TODO Auto-generated method stub
		for(int i=0;i<cards.CARD_NUM;i++)
		{
			for(int j=0;j<cards.CARD_TYPE;j++)
			{
				tmp = new PokerCard(i+1,cards.cardType[j]);
				cards.deck.add(tmp);
				//System.out.println(tmp);
			}
		}
	}

	@Override
	public boolean roundWinning() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
