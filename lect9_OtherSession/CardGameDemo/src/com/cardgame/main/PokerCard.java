package com.cardgame.main;

import java.util.ArrayList;

import com.cardgaem.resource.Card;
import com.cardgaem.resource.CardType;

public class PokerCard implements Card {
	ArrayList<PokerItem>  deck = new ArrayList<PokerItem>();
	PokerItem[] cards= new PokerItem[3];
	public int cardsIndex;
	
	public PokerCard()
	{
		PokerItem tmp;
		for(int i=0;i<CARD_NUM;i++)
		{
			for(int j=0;j<CARD_TYPE;j++)
			{
				tmp = new PokerItem();
				tmp.num = (i+1);
				tmp.type = j;
				deck.add(tmp);				
				//System.out.println(tmp);
			}
		}
	}
	
	@Override
	public void getCard() {
		// TODO Auto-generated method stub
		int deckIndex;
		
		if(deck.size()>0)
		{
			deckIndex = (int)(Math.random() * (deck.size()-1));
			//System.out.println(deck.get(deckIndex));
			// cardsIndex might be invalid
			cards[cardsIndex] = deck.get(deckIndex); 
			deck.remove(deckIndex);			
		}
		else
		{
			System.out.println("No card left!");
		}
		//
		
	}

}
