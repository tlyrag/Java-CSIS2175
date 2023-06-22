
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"James","Keithy","Ping"};
		
		int[][] scores = {{90, 99, 86},{98,95,95},{99,78,92}};
		
		Student[] stus = new Student[3];
		
		for(int i=0;i<names.length;i++)
		{
			stus[i] = new Student(names[i],scores[i]);
		}
		
		displayArray(stus);	
		
		System.out.println("Student with highest avg: ");
		int index = findHighestAvg(stus);
		System.out.println(stus[index]);
		 
				
		/*		
		Student stu1 = new Student("James", scores);
		int[] tmp = stu1.getScores();	
				
		displayArray(tmp);
		
		//stu1.scores[0] = 60;
		
		scores[0] = 60;
		System.out.println("updated scores[0]");
		displayArray(tmp);
		
		System.out.println(stu1); */
	}
	
	public static void displayArray(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
	}
	
	public static void displayArray(Student[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println();
	}
	
	public static int findHighestAvg(Student[] stus)
	{
		int index = 0;
		double highest=stus[0].calcAvg();
		
		for(int i=1;i<stus.length;i++)
		{
			if(highest<stus[i].calcAvg())
			{
				highest = stus[i].avg;
				index = i;
			}
		}
		return index;
	}

}
