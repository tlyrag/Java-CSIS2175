
public class WorkingDog extends Dog implements Work{

	public int hrs;
	@Override
	public void work() {
		// TODO Auto-generated method stub
		speak();
		System.out.println("I am not a pet and I am working here!");
		System.out.println("I have "+ hrs + " hrs of traning!" );
	}

}
