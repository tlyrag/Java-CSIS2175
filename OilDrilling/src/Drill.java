
public class Drill {
	private  int drillStrength;
	private int drillingTime;
	private int totalDrillingTime;
	private int totalOilFound;
	
	Drill(int strength) {
		this.drillStrength = strength;
	}
	public void drillSoil(Soil soil) {
		this.drillingTime = this.drillStrength - soil.getSoilResistance();
		this.totalDrillingTime += this.drillingTime;
		
		if(soil.getSoil().equals("oil")) {
			this.totalOilFound++;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder drill = new StringBuilder();
		
		drill.append("Total Drilling Time: " + this.drillingTime + "\n");
		drill.append("Total Oil Found: " + this.totalOilFound + "\n");
		
		return drill.toString();
	}
	
}
