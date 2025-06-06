package day4_Constructor;

public class Student {

	int id;
	String name;
	char grade;
	char section;
	static String schoolName;
	String ssid;
	
	public Student(int id,String name) {
		this.id = id;//12
		this.name=name;//kiran
	}
	
	public Student(int id, String name, char grade, char section, String ssid) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.section = section;
		this.ssid = ssid;
	}

	public Student(String name, String ssid) {
		this.name = name;
		this.ssid = ssid;
	}

	public Student(int id,String name,String ssid) {
		this.id = id;//13
		this.name=name;//sara
		this.ssid=ssid;//57258ssid1
	}
	
	public Student(String ssid,int id) {
		this.ssid = ssid;
		this.id=id;
	}
	
	
	public static void main(String[] args) {
		//Object Creation
		//classname refVariable = new classname();
		Student s1 = new Student(12,"kiran");	
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		
		Student s2=new Student(13,"sara","57258ssid1");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.ssid);
		
		Student s3 = new Student("ssid12334",14);
		System.out.println(s3.ssid);
		System.out.println(s3.id);
		
		
		
	}
}
