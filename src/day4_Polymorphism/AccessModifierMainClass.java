package day4_Polymorphism;

import day5_Encapsulation.AccessModifiers;

public class AccessModifierMainClass extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers ac1 = new AccessModifiers();
		//System.out.println(ac1.c);
		System.out.println(ac1.d);
		AccessModifierMainClass ac2 = new AccessModifierMainClass();
		System.out.println(ac2.b);

	}

}
