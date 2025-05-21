package day2;

public class Student {
/*
 * class - template of an Object
 * properties and behaviour
 * properties: variables
 * id,name,section,grade,schoolName
 * 1 2
 * behaviour : methods
 * attendSession
 * submitProject
 * 
 * void - not returning anything
 * int  - returning integer value
 * 
 * Object - real entity - reference of a class
 * 
 * s1 => jake
 * id - 1
 * name - jake
 * grade - 1
 * section - a
 * 
 * s2 - adiam
 * id - 2
 * name - adiam
 * grade - 2
 * section - c
 * 
 * 
 * pen - object
 * properties -- color, grip, type,brand - variables
 * behaviour -- write,scribbling - methods
 * 
 * 
 * human being
 * properties - name, gender, height, weight,ssid,pancard
 * behaviour - walk,talk,sleep,run
 */
	int id;
	String name;
	char grade;
	char section;
	static String schoolName;
	
	public void attendSession() {
		System.out.println("Student attends session");
		System.out.println(id);
		System.out.println(schoolName);
	}
	
	public void submitProject() {
		System.out.println("Student submits project");
		System.out.println(id);
		System.out.println(schoolName);
	}
	
	public static void getSchoolName() {
		System.out.println(schoolName);
	}
	
	public static void main(String[] args) {
		//Object Creation
		//classname refVariable = new classname();
		Student s1 = new Student();// 1 single object - 1 student
		s1.id=1;
		s1.name="kiran";
		s1.grade='1';
		s1.section='A';
		schoolName="abc";
		getSchoolName();
		System.out.println("Student 1 id: " + s1.id);
		System.out.println("Student 1 name: " + s1.name);
		System.out.println("Student 1 grade: " + s1.grade);
		System.out.println(schoolName);
		s1.submitProject();
		s1.attendSession();
		
		
		Student s2 = new Student();// 2nd student - 2nd object
		s2.id=2;
		s2.name="sheela";
		s2.grade='2';
		s2.section='C';
		
		System.out.println("Student 2 id: " + s2.id);
		System.out.println("Student 2 name: " + s2.name);
		System.out.println("Student 2 grade: " + s2.grade);
		System.out.println(schoolName);
		s2.submitProject();
		s2.attendSession();
		
		
		
	}
}
