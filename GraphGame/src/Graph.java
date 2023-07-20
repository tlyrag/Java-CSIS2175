import java.util.ArrayList;
public class Graph {
	ArrayList<Vertex> vertixArray = new ArrayList<Vertex>();
	
	Graph(int places, int mapVertix) {
		generateRandomMap(places,mapVertix);
	}
	public void generateRandomMap(int places,int mapVertix) {
		
		
		for(int i=0;i<places;i++) {
			Vertex newVertex = new Vertex();
			newVertex.indexPosition =i;
			newVertex.nextIndex = generateRandomArrayNums(places,mapVertix);
			
			vertixArray.add(newVertex);
		}
		
	}
	public ArrayList<Integer> generateRandomArrayNums (int places,int mapVertix ) {
		ArrayList<Integer> newVertix = new ArrayList<Integer>();
		
		for(int i=0;i<mapVertix;i++) {
			int randomNum = (int) (Math.random() * places);
			newVertix.add(randomNum); 
		}
		return newVertix;
	}
	public void printMap() {
		for(int i =0; i<vertixArray.size(); i++) {
			System.out.println("Index: " + vertixArray.get(i).indexPosition + " Vertix: " + vertixArray.get(i).nextIndex);
		}
	}
}
