
public class Student {
	public String name;
	public double avg;
	private int[] scores;
	
	public Student(String _name, int[] _scores)
	{
		name = _name; 		
		//scores=_scores;  //not suggested
		
		scores = new int[_scores.length];
		for(int i=0;i<scores.length;i++)
		{
			scores[i] = _scores[i];
		}
		
	}
	
	public int[] getScores()
	{
		return scores;
	}
	
	public double calcAvg()
	{
		//
		double sum = 0;
		for(int i=0;i<scores.length;i++)
		{
			sum = sum + scores[i];
		}
		
		avg = sum/scores.length;
		return avg;
	}
	
	@Override
	public String toString()
	{
		String result = name+":  ";
		for(int i=0;i<scores.length;i++)
		{
			result = result + scores[i] + "   ";
		}
		result = result + calcAvg();
		return result;
	}
}
