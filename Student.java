package week3day1;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Class : Arun");
		
	}
	public void studentDept() {
		System.out.println("Student Class :EEE");
		
	}
	public void studentId() {
		System.out.println("Student Class :455645");
		
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.department();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}


