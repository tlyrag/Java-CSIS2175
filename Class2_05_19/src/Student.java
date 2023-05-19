
public class Student {
	String schoolName = "Douglas College";
	String fName;
	String lName;
	private int age;
	char grade;
	double average;
	
	public Student(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age >= 0 && age<=200) {
			this.age = age;
		}
	}
	
	
	
}
