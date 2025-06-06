package day4_Inheritance;

public class CollegeMain {

	public static void main(String[] args) {
		StudentDemo st1 = new StudentDemo();
//		st1.attendSession();
//		st1.submitProject();
//		st1.markAttendance();
		st1.lunchTime();
		
		Staff s1  = new Staff();
		//s1.markAttendance();
		s1.lunchTime();
//		s1.evaluateAttendance();
//		s1.calculateSalary();
		
		Teacher t1=new Teacher();
//		t1.conductSession();
//		t1.evaluateProject();
//		t1.markAttendance();
		t1.lunchTime();

	}

}
