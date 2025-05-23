package assignments;

public class LoopConcept {
	
	public void sumOfNValues(int n) {//n=10
		int sum=0;
		for(int i=1;i<=n;i++) {//i=5
			sum = sum + i;//sum = 10+5 = 15
		}
		System.out.println("Sum of numbers: " + sum);
	}

	public static void main(String[] args) {
		// Given a number n. Add all the numbers from 1 to n.
		//5 - 1+2+3+4+5
		LoopConcept ll = new LoopConcept();
		int input = 10;
		ll.sumOfNValues(input);
		
		
	}

}
