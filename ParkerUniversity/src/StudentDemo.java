import java.util.ArrayList;
public class StudentDemo {
	public static void main(String[] args) {
		
		Student[] douglasStudents = new Student[6];
		
		for(int i=0;i<douglasStudents.length;i++) {
			if(i%2==0) {
				GraduateStudent newPerson = new GraduateStudent(100+i,Integer.toString(i),Integer.toString(i));
				douglasStudents[i] = newPerson; 
			} else if(i%2==1) {
				UnderGraduateStudent newPerson = new UnderGraduateStudent(100+i,Integer.toString(i),Integer.toString(i));
				douglasStudents[i] = newPerson; 
			} else {
				StudentAtLarge newPerson = new StudentAtLarge(100+i,Integer.toString(i),Integer.toString(i));
				douglasStudents[i] = newPerson; 
			}
		}
		
		displayArray(douglasStudents);
		
	}
	public static void displayArray(Student[] studArr) {
		for(int i =0; i<studArr.length;i++) {
			System.out.println(studArr[i]);
		}
	}
	
}
