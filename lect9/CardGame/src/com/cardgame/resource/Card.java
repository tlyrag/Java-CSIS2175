package com.cardgame.resource;

public abstract class Card {
	public String[] cardType = {"HEART","SPADE","CLUB","DIAMOND"};
	public final int CARD_NUM = 13;
	public final int CARD_TYPE = 4;
	
	public abstract void getCard();
}
