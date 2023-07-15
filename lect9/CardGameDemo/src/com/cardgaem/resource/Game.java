package com.cardgaem.resource;

public abstract class Game {
	public Player myPlayer;
	
	public Game(String name, int score)
	{
		myPlayer = new Player(name, score);
	}
	
	public abstract void gameStart();
	public abstract boolean roundWinner();	
}
