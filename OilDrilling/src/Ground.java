
public class Ground {
	private Soil[][] ground;
	//private String soilName;
	
	
	Soil mud = new Soil(1,"mud");
	Soil softRock = new Soil(3,"softRock");
	Soil hardRock = new Soil(7,"hardRock");
	Soil oil = new Soil(7,"oil");
	
	private Soil[] SoilArry = {mud,softRock,hardRock,oil};
	
	
	Ground(int row, int col) {
		
		Soil[][] soilGround = new Soil[row][col];
		//this.soilName = soil.getSoil();
		
		for(int i =0; i<row;i++) {
			for(int j=0;j<col;j++) {
				soilGround[i][j] = SoilArry[randomSelector()];
			}
		}
		this.ground = soilGround;
		
	}
	public Soil[][] getSoil(){
		return this.ground;
	}
	public int randomSelector() {
		int randomSelector = (int) (Math.random()*SoilArry.length);
		return randomSelector;
	}
	
	public void displaySoilGround() {
		for(int row =0; row<ground.length;row++) {
			for(int col=0;col<ground[row].length;col++) {
				System.out.printf("%10s ",this.ground[row][col].getSoil());
			}
			System.out.println();
		}
	} 
}
