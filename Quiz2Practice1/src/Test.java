
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GamePlay newGame = new GamePlay();
//		newGame.gameStart();
//		newGame.newRound();
//		newGame.newRound();
//		newGame.newRound();
//
//		System.out.println(newGame);
		int random = (int)((Math.random()*(5-1+1)));
		int i=0;
		while(random!=5) 
		{
			random = (int)((Math.random()*(5-2+1)))+2;
			i++;
		}
		System.out.println(i);
		
		
	}

}
