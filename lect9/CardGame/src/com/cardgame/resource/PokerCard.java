package com.cardgame.resource;

public class PokerCard {
	public int num;
	public String type;
	
	public PokerCard(int _num, String _type)
	{
		num = _num;
		type = _type;
	}
	
	@Override
	public String toString()
	{
		return num + "," +type;
	}
}	
