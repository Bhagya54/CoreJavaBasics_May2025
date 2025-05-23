package assignments;

public class ClassAndObject {
	
	int beets;//500

	public int getBeets() {
		return beets;
	}
	
	public void setBeets(int beets1) {//beets1 = 500
		beets = beets1;
	}
	public static void main(String[] args) {
		ClassAndObject obj1 = new ClassAndObject();
		obj1.setBeets(500);
		System.out.println(obj1.getBeets());//500
		

	}

}
