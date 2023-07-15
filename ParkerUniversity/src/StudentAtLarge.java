
public class StudentAtLarge extends Student{

	StudentAtLarge(int StudentId, String fName, String lName) {
		super(StudentId, fName, lName);
		// TODO Auto-generated constructor stub
		setAnualTuition();
	}

	@Override
	public void setAnualTuition() {
		// TODO Auto-generated method stub
		this.AnualTuition =2000;
	}

}
