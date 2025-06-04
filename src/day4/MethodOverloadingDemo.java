package day4;

public class MethodOverloadingDemo {
	
	public void sum(int a,int b) {
		System.out.println("Sum of 2 int values: "+ (a+b));
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("Sum of 3 int values: " +(a+b+c));
	}
	
	public void sum(float a,float b) {
		System.out.println("Sum of 2 float values: " + (a+b));
	}

	public static void main(String[] args) {
		MethodOverloadingDemo m1 = new MethodOverloadingDemo();
		m1.sum(23,7);
		m1.sum(67.12f, 12.89f);
		m1.sum(12,13,14);

	}

}
