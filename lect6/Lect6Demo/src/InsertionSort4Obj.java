
public class InsertionSort4Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"James","Keithy","Ping"};
		
		int[][] scores = {{90, 99, 86},{98,95,95},{75,78,92}};
		
		Student[] stus = new Student[3];
		
		for(int i=0;i<names.length;i++)
		{
			stus[i] = new Student(names[i],scores[i]);
		}
		
		displayArray(stus);
		
		System.out.println("Sort by average");
		insertionSort(stus);		
		displayArray(stus);
		
		System.out.println("Sort by 1st course");
		insertionSort1Score(stus);
		displayArray(stus);
	}
	
	public static void insertionSort(Student[] stus)
	{
		double key;
		Student tmp;
		int j;
		for(int index=1;index<stus.length;index++)
		{
			key = stus[index].calcAvg();
			tmp = stus[index];
			j=index-1;
			while(j>=0 && key<stus[j].calcAvg())
			{
				stus[j+1] = stus[j];
				j--;
			}
			stus[j+1] = tmp;
		}
	}
	
	public static void insertionSort1Score(Student[] stus)
	{
		int key;
		Student tmp;
		int j;
		for(int index=1;index<stus.length;index++)
		{
			key = stus[index].getScores()[0];
			tmp = stus[index];
			j=index-1;
			while(j>=0 && key<stus[j].getScores()[0])
			{
				stus[j+1] = stus[j];
				j--;
			}
			stus[j+1] = tmp;
		}
	}
	
	
	public static void displayArray(Student[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println();
	}

}
