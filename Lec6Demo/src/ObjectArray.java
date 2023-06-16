
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {90,80,86};
		Student stud1 = new Student("Thiago",score);
		Student[] studs = new Student[3];
		String[] names = {"James","Keithy","Ping"};
		int[][] scores= {{90,80,86},{55,40,76},{250,83,96}};
		
		int[] temp = stud1.getScores();
		//System.out.println(stud1.getscore());
		displayArray(temp);
		
		score[0] = 60;
		//displayArray(temp);
		System.out.println(stud1);
		
		/// Creating a new Student object and referring to the array;
		studs[0] = new Student("Test",score);
		studs[0].name ="Working";
		System.out.println(studs[0]);
		System.out.println();
		System.out.println("Array Example");
		studs[0] = new Student(names[0],scores[0]);
		studs[1] = new Student(names[1],scores[1]);
		studs[2] = new Student(names[2],scores[2]);
		displayArrayStuds(studs);
		double[] highestStud = findHighestAverage(studs);
		
		System.out.println(studs[(int) highestStud[0]]);
		
	}
	public static void displayArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		
	}
	
	public static void displayArrayStuds(Student[] studs) {
		for(int i=0;i<studs.length;i++) {
			System.out.println(studs[i]+ " ");
		}
		System.out.println();
		
	}
	
	public static double[] findHighestAverage(Student[] studs) {
		double highest =  studs[0].calcAvg();
		double studentIndex = 0;
		
		for(int i = 0; i< studs.length; i++) {
			if(studs[i].calcAvg() > highest) {
				highest = studs[i].calcAvg();
				studentIndex = 0;
			}
			
		}
		double[] result = {studentIndex,highest};
		return  result;
		
	}
}
