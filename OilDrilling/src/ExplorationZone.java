
public class ExplorationZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ground ExpoZone = new Ground(4,4);
		ExpoZone.displaySoilGround();
		 Drill newDrill = new Drill(10);
		 exploreGround(ExpoZone,newDrill);
		 System.out.println(newDrill);
		
	}
	public static void exploreGround(Ground ground,Drill drill) {
		
		for(int row=0;row<ground.getSoil().length;row++) {
			for(int col=0;col<ground.getSoil()[row].length;col++) {
				drill.drillSoil(ground.getSoil()[row][col]);
			}
		}
	}
	

}
