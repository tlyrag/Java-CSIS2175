import java.util.Scanner;
public class ExplorationMain {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///// JUST FOR TEST PURPOSE
		
//		Investor newInvest = new Investor("Testing",50,50);
//		newInvest.GetDrillInfo();
//		OilWell newOilWell = new OilWell(5,100,1,1);
//		
//		System.out.println(newInvest);
//		
//		int distance = newOilWell.drillDistance(newInvest);
//		System.out.println(distance);
//		
//		int[][] map = new int[4][4];
//		displayMap(map);
//		
//		updateMap(newInvest,map);
		
		///////////////////////////////////
		
		int[][] map = new int[4][4];
		displayMap(map);
		

		OilWell[] OilWellArray = new OilWell[2];
	
		OilWellArray[0] = generateRandomOilWell(map);
		OilWellArray[1] = generateRandomOilWell(map);
		
		Investor RichMan = new Investor("RichMan",100,2);
		
		boolean allOilFound = false;
		int totalattempts=0;
		while(!allOilFound && RichMan.getFunds()>0 && wantToQuit() ) {
			
			RichMan.GetDrillInfo();
			updateMap(RichMan,map);
			RichMan.setFunds();
			
			drillAttempt(RichMan,OilWellArray);
			
			if(OilWellArray[0].getIsFound() && OilWellArray[1].getIsFound()) {
				allOilFound =true;
			}
			
			totalattempts ++;
			
		}
		//int totalFundSpent =RichMan.getTotalSpent();
		System.out.println("Number of Total Attempts: " + totalattempts);
		System.out.println("Number of Total Spent: " + RichMan.getTotalSpent());
		
		
	
	}
	public static boolean wantToQuit() {
		
		System.out.println("You are about to make a Drill, please enter 1 to continue or other number to quit");
		int userOption = input.nextInt();
		
		if(userOption ==1) {
			return true;
		} 
		return false;
		
	}
	
	public static void drillAttempt(Investor investor, OilWell[] OilWellArray) {
		StringBuilder attempt = new StringBuilder();
		
		int[ ]oilWell0Coordinates = OilWellArray[0].getCoordinates();
		int oilWell0Depth = OilWellArray[0].getDepth();
		
		int[ ]oilWell1Coordinates = OilWellArray[1].getCoordinates();
		int oilWell1Depth = OilWellArray[0].getDepth();
		
		int[] investorCoordinates = investor.getCurrentDrillPosition();
		int investorDepth = investor.getDrillDepth();
		
		// Checking if coordinates matches with OIlArray0
		if(investorCoordinates[0]==oilWell0Coordinates[0] && investorCoordinates[1]==oilWell0Coordinates[1] &&  investorDepth> oilWell0Depth) {
			attempt.append("Big Congrats!!! You have just found " + OilWellArray[0].getReserves()+" barrels of oil");
			OilWellArray[0].IsFound();
			
		// Checking if coordinates matches with OIlArray0
		} else if (investorCoordinates[0]==oilWell1Coordinates[0] && investorCoordinates[1]==oilWell1Coordinates[1] &&  investorDepth> oilWell1Depth) {
			attempt.append("Big Congrats!!! You have just found " + OilWellArray[1].getReserves()+" barrels of oil");
			OilWellArray[1].IsFound();
			// Missed Attempt
		} else {
			// Checking if it is closer to OilWell0
			if(OilWellArray[0].drillDistance(investor) <OilWellArray[1].drillDistance(investor) ) {
				attempt.append("You Missed the well. The closest distance is " + OilWellArray[0].drillDistance(investor));
				//Closer to OilWell1
			} else{
				attempt.append("You Missed the well. The closest distance is " + OilWellArray[1].drillDistance(investor));
			}
			
		}
		
		
		System.out.println(attempt);
	}
	
	public static void updateMap(Investor investor,int[][] map) {
		int investorX = investor.getCurrentDrillPosition()[0];
		int investory = investor.getCurrentDrillPosition()[1];
		
		map[investorX][investory] =investor.getDrillDepth();
		
		System.out.println("--------Current updated map---------");
		displayMap(map);
		System.out.println("------------------------------------");
	}
	
	public static void displayMap(int[][] map) {
		for(int row =0; row<map.length;row++) {
			for(int col =0; col<map[row].length;col++) {
				System.out.print(map[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static OilWell generateRandomOilWell(int[][] map) {
	
		
		// Limiting random generator of the oilWell to be inside the map range
		
		int randomX = (int) (Math.random()*map.length);
		int randomY = (int) (Math.random()*map[0].length);
		
		// Random depth to be between 5 and 100
		int randomDepth = (int) (5 + Math.random()*(100-5+1));
		// Random reserve to be between 1000 and 10000
		int randomReserve = (int) (1000 + Math.random()*(10000-1000+1));
		
		OilWell randomOilWell = new OilWell(randomDepth,randomReserve,randomX,randomY);
		return randomOilWell;
		
		
	}

}
