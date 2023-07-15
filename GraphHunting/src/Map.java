import java.util.ArrayList;
public class Map extends Graph{
	 public ArrayList<Graph> gameMap = new ArrayList<Graph>();
	// Dummy Map Constructor
	Map() {};
	
	// Creating a Map with Random Graphs
	Map(int mapSize) {
		ArrayList<Graph> newGameMap = new ArrayList<Graph>();
		

		for(int i=0; i<mapSize;i++) {
			Map tempMap = new Map();
			newGameMap.add(tempMap);
		}
		
		randomGraphGenerator(newGameMap);
	}
	

	
	public void randomGraphGenerator(ArrayList<Graph> graphList) {
			
			for(int i =0;i<graphList.size();i++ ) {
				
				Map newMap = new Map();
				newMap.index =i+0;
				
				for(int j=0;j<3;j++) {
					int randomNum = (int)(Math.random()*graphList.size());
					
					while(randomNum==i || newMap.nextIndexes.contains(randomNum)) {
						 randomNum = (int)(Math.random()*graphList.size());
					}
					newMap.nextIndexes.add(randomNum);
				}
				this.gameMap.add(newMap);
			}
			
			
		}
	public  void displayArrayList() {
			
			for(int i =0; i<this.gameMap.size();i++) {
				System.out.print("Index: "+ this.gameMap.get(i).index + " GraphNextIndex" + this.gameMap.get(i).nextIndexes + "\n");
			}
			
		}
}
