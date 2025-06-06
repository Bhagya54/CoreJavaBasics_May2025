package day5_Encapsulation;

public class Student {

	private int id=12;
	private String name="gaurav";
	private char grade;
	private char section;
	private char gender;
	private static String schoolName;
	private String ssid;
	
	
	
	public int getId() {//read
		return id;
	}
	
	
	public String getName() {//read
		return name;
	}
	
	public void setGender(char gender) {
		if(gender=='M' || gender=='F') {
			this.gender=gender;
		}
		else {
			System.out.println("Invalid gender value");
		}
		
	}
	
	public char getGender() {
		return gender;
	}
	
	
}
