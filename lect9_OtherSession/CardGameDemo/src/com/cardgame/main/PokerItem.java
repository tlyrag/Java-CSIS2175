package com.cardgame.main;

import com.cardgaem.resource.CardType;

public class PokerItem {
	public int num;
	public int type;
	String[] types = {"Heart","Spade","Club","Diamond"};
	
	@Override
	public String toString()
	{
		return types[type] + "," + num;
	}
}
