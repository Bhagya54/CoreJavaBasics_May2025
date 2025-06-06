package day5_Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		AccessModifiers ac = new AccessModifiers();
		//System.out.println(ac.a); - a is a private variable
		System.out.println(ac.c);
		System.out.println(ac.b);//protected variable
	}

}
