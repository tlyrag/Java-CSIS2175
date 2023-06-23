
public class Soil {
	private int resistence;
	private String soilName;
	
	Soil(int resistance,String name){
		this.resistence= resistance;
		this.soilName = name;
	}
	public String getSoil() {
		return this.soilName;
	}
	public int getSoilResistance() {
		return this.resistence ;
	}
}
