package com.cardgame.resource;

public abstract class Card {
	public String[] cardType =  {"Diamond","Clubs","Spades","Hearts"};
	public final int CARD_NUM = 13;
	public final int CARD_TYPE = 4;
	
	public abstract void getCard();
}
