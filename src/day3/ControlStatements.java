package day3;

public class ControlStatements {
/*
 * if else
 * if else if else
 * switch
 * 
 * 
 */
	public static void main(String[] args) {
		int age=2;
		if(age>=18) {
			System.out.println("Allowed to vote");
		}
		else {
			System.out.println("Not allowed to vote");
		}
		
		/*
		 * marks>=75 -- Grade - A
		 * marks<75 and marks>=60 --Grade - B
		 * marks<60 and marks>=50 -- Grade - C
		 * marks<50 and marks>=30 - Grade - D
		 * marks<30 -- Fail
		 * 
		 * 
		 */
		int marks = 76;
		
		if(marks>=75) {
			System.out.println("A");
		}
		else if(marks<75 && marks>=60) {
			System.out.println("B");
		}
		else if(marks<60 && marks>=50) {
			System.out.println("C");
		}
		else if(marks<50 && marks>=30) {
			System.out.println("D");
		}
		else if(marks<30){
			System.out.println("Fail");
		}

		int day = 2;
		String weekName="Tuesday";
		switch (weekName) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
