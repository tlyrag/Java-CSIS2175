
public class Student {
	
	public String name;
	public double avg;
	private int[] scores;
	
	public Student(String name, int[] scores) {
		this.name = name;
		//this.scores = scores;// not suggested
		// this way a new array is created with a new reference. THerefore, the memory address cannot be addressed from the 
		// main method
		this.scores = new int[scores.length];
		
		for(int i =0; i<scores.length;i++) {
			this.scores[i] = scores[i];
		}
		
	}
	public int[] getScores() {
		return scores;
	}
	
	public double calcAvg() {
		double sum =0;
		
		for(int i=0; i<this.scores.length;i++) {
			sum+= this.scores[i];
		}
		this.avg=sum/this.scores.length;
		return this.avg;
	}
	
	public  void displayScores() {
		for(int i=0;i<this.scores.length;i++) {
			System.out.print(this.scores[i]+ " ");
		}
		System.out.println();
		
	}
	
	@Override
	public String toString() {
		String result = this.name +": " ;
		for(int i=0;i<this.scores.length;i++) {
			result+= this.scores[i]+ " ";
		}
		result += calcAvg();
		return result;
	}
	
}
