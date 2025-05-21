package day2;

public class TypesOfVariablesAndMethods {
/*
 * Types of Variables
 * 	1. Local variables: access within the method
 *  2. Global Variables:
 *  		> instance variable - access throughout the class - only through
 *  		object reference Ex: id,name,grade,section
 *  		> static variable -  without the object creation
 *  		common for all your objects - Ex: schoolName
 *  
 *  Types of Methods
 * 		> instance - access both static variables as well as instance variables
 * 		> static - access only static variables - static keyword
 * 
 */
	
	int id;
	String name;
	char grade;
	char section;
	String schoolName;
	
	
	public void method1() {
		int a=10;//local variable
		System.out.println(a);
		System.out.println(id);
	}
	
	public void method2() {
		//System.out.println(a);
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		TypesOfVariablesAndMethods type = new TypesOfVariablesAndMethods();
		type.method1();
		
		type.id=12;
		type.name="abc";
		
		
		Student s1 = new Student();
		s1.submitProject();
		s1.attendSession();
		
		Student.getSchoolName();

	}

}
