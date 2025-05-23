package day3;

public class LoopsDemo {
	/*
	 * Loop: repeating something
	 * 1. for
	 * 2. while
	 * 3. do while
	 * 
	 * 1-10
	 * 1,2,3....10
	 * for(intialization;condition;increment/decrement)
	 * for(int i=1;i<=10;i++)
	 * 
	 * int i=1;
	 * while(condition){
	 * statement
	 * increment/decrement
	 * }
	 *int i=1; 
	 * do{
	 * statements
	 * increment/decrement
	 * }while(condition);
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("Print values from 1 to 10");
		for(int i=1;i<=10;i++) {//i=2<=10 - increment by 2 - i=i+2
			System.out.print(i + " ");//1 2 3 4.. 10		
		}
		System.out.println("Print values from 5 to 50 incrementing by 5");
		for(int i=5;i<=50;i=i+5) {
			System.out.println(i);
		}
		
		System.out.println("Print from 100 to 10");//100 90 80.. 10
		int j=100;
		while(j>=10) {//90<=100
			System.out.print(j + " ");//100 90 80 70 60 .. 10
			j=j-10;//90 80
		}
		System.out.println();
		System.out.println("Do while loop");
		int z=100;
		do {
			System.out.print(z + " ");//9 
			z=z-10;//9-10 = -1
		}while(z>=10);//-1>=10
		
		
	}

}
