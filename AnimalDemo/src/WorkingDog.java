
public class WorkingDog extends Dog implements Work{

	public WorkingDog(String _name, int _legs) {
		super(_name, _legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("I am working at most"+ hrs +" per week");
	}

}
