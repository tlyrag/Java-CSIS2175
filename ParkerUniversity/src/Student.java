
public abstract class Student {
	public int StudentId;
	public String LastName;
	public String FirstName;
	public int AnualTuition;
	
	Student(int StudentId, String fName, String lName) {
		this.StudentId=StudentId;
		this.FirstName=fName;
		this.LastName=lName;
	}
	
	public abstract void setAnualTuition();
	
	@Override
	public  String toString() {
		StringBuilder stud = new StringBuilder();
		stud.append("StudentID: "+ this.StudentId+" ");
		stud.append("LastName: "+ this.LastName+" ");
		stud.append("FirstName: "+ this.FirstName+" ");
		stud.append("AnualTuition: "+ this.AnualTuition+" ");
		
		
		return stud.toString();
	}
}
