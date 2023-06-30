
public class OilWell {
	private int[] coordinate;
	private int depth;
	private int reserves;
	private boolean isFound = false;
	
	
	OilWell(int depth,int reserves,int x, int y) {
		this.depth = depth;
		this.reserves=reserves;
		
		int[] newCoordinates = {x,y};
		this.coordinate = newCoordinates;
	}
	
	public int drillDistance(Investor investor) {
		int Distance = Math.abs(this.coordinate[0]-investor.getCurrentDrillPosition()[0])+ Math.abs(this.coordinate[1]-investor.getCurrentDrillPosition()[1])+ Math.abs(this.depth-investor.getDrillDepth());
		return Distance;
		
	}
	public int[] getCoordinates() {
		return this.coordinate;
	}
	public int getReserves() {
		return this.reserves;
	}
	public int getDepth() {
		return this.depth;
	}
	public boolean IsFound() {
		this.isFound=true;
		return this.isFound; 
	}
	public boolean getIsFound() {
		
		return this.isFound; 
	}
}
