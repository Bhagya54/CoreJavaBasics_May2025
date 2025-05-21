package day2;

public class OperatorsDemo {
	/*
	 * 1. Unary Operator: 1 operand
	 * 		> Post Increment - a++ == a+1
	 * 		> Post Decrement - b-- ==> b-1
	 *      > Preincrement - ++c
	 *      > Pre Decrement - --d
	 * 2. Binary Operator - 2 operands
	 * 		>Arithmetic: +,-,/- quotient,*,%(modulus - remainder)
	 * 		>Relational: <,<=,>,>=,==
	 * 		>logical: &&,||- OR,! - NOT
	 * 
	 * && - condition1 and condition2
	 * true - true and true
	 * false - true and false
	 * false - false and true
	 * false - false and false
	 * 
	 * || - condition1 or condition2
	 * true - true and true
	 * true - true and false
	 * true - false and true
	 * false - false and false
	 * 	
	 * ! - condition -- true - false
	 * 					false - true
	 * 3. Ternary Operator -  3 operands
	 * 
	 * condition ? statement1 :statement2
	 * 12<30?"12 is smallest": "30 is the smallest"
	 * 4. Assignment Operator: =
	 */

	public static void main(String[] args) {
		System.out.println("Unary Operators");
		
		int a=10;
		System.out.println(a++);//10  > 11
		System.out.println(a);//11
		
		int b=21;
		System.out.println(b--);//21 >> 20
		System.out.println(b);
		
		int c=23;
		System.out.println(++c);//24
		
		int d=45;
		System.out.println(--d);//44

		
		System.out.println("Binary Operators");
		System.out.println("Arithmetic operators");
		
		int i1=12;
		int i2=8;
		System.out.println(i1+i2);//20
		System.out.println(i1-i2);//4
		System.out.println(i1/i2);//1
		System.out.println(i1%i2);//4
		System.out.println(i1*i2);//96
		
		System.out.println("Relational Operators");
		int r1=34;
		int r2=34;
		System.out.println(r1<r2);//false
		System.out.println(r1<=r2);//true
		System.out.println(r1==r2);//== - comparision
		
		
		System.out.println("Logical Operators");
		int l1=2;
		int l2=5;
		int l3=12;
		
		System.out.println(l3<l1 && l3<l2);//true and true --- true
		
		System.out.println(l1<l2 && l1<l3);//true and false - false
		System.out.println(l1<l2 || l1<l3);//true or false - true
		
		System.out.println(!(l1<l2));//true -- false
		
		String smallest = l1>l2 ? "l1 is the smallest":"l2 is the smallest";
		System.out.println(smallest);
		
		String smallestOf3Num=(l1<l2 && l1<l3)?"l1 is the smallest of 3 num":
			(l2<l3?"l2 is the smallest of 3 num":"l3 is the smallest of 3 num");
		System.out.println(smallestOf3Num);
		
	}

}
