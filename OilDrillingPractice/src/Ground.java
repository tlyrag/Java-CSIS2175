
public class Ground {
	private Soil[][] ground;
	
	
	Soil mud = new Soil(1,"mud");
	Soil softRock = new Soil(1,"mud");
	Soil hardRock = new Soil(1,"mud");
	Soil oil = new Soil(1,"mud");
	
	private Soil[] groundComponenets = {mud,softRock,hardRock,oil};
	
	Ground(int row, int col) {
		Soil[][] newGround = new Soil[row][col];
		
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				
			}
		}
	}
	
}
