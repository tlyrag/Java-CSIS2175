package com.cardgame.resource;

import java.util.ArrayList;

public class Poker extends Card {
	public ArrayList<PokerCard> deck = new ArrayList();
	public PokerCard c1, c2,c3;
	public void get2ndCard()
	{
		int index;
		if(deck.size()>0)
		{	
			index = (int)(Math.random()*(deck.size()-1));
			System.out.println(deck.get(index));
			deck.remove(index);
			c2 = deck.get(index);
		}
		else
		{
			System.out.println("Not enough card to play!");
		}
	}
	@Override
	public void getCard() {
		// TODO Auto-generated method stub
		int index;
		
		if(deck.size()>2)
		{
			index = (int)(Math.random()*(deck.size()-1));
			System.out.println(deck.get(index));
			deck.remove(index);
			c1 = deck.get(index);
			
			
			index = (int)(Math.random()*(deck.size()-1));
			System.out.println(deck.get(index));
			deck.remove(index);
			c3 = deck.get(index);
		}
		else
		{
			System.out.println("Not enough card to play!");
		}
		
	}

}
