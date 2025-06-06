package day5_Encapsulation;

public class SchoolClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		//s1.setName("nonsense");
		System.out.println(s1.getName());
		System.out.println(s1.getId());

		s1.setGender('Z');
		System.out.println(s1.getGender());
	}

}
