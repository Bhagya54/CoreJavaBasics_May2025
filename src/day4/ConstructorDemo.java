package day4;

public class ConstructorDemo {
	/*
	 * Constructor:
	 * 1. has same name as that of the class name
	 * 2. constructor is being called as part of the Object creation
	 * 3. Java creates a default constructor if used didn't created it
	 * 
	 * 2 types constructors
	 * 1. Parameterized
	 * 2. Non Parameterized
	 * 
	 * /*
	 * Constructor Overloading:
	 * Same Constructor name with difference in 
	 * the type of parameters
	 * the number of parameters
	 *
	 * this:
	 * points to current class parameter
	 * when the global variable name and local variable names are same-we use this keyword
	 * to make the difference
	 */
	
	
	public ConstructorDemo() {
		System.out.println("I am a constructor");
	}
	
	public ConstructorDemo(int a,int b) {
		System.out.println(a + " " + b);
	}

	public void add() {
		System.out.println("Addition");
	}
	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		c1.add();
		
		ConstructorDemo c2 = new ConstructorDemo(23, 89);

	}

}
