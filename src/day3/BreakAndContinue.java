package day3;

public class BreakAndContinue {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {//i=5
			if(i==5) {
				//break;//terminate the loop
				continue;//skip the statement
			}
			System.out.println(i);
			//1 2 3 4 6 7 8 9 10
		}
		
		System.out.println("Out of loop");

	}

}
