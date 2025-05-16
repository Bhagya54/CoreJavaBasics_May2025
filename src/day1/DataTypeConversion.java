package day1;

public class DataTypeConversion {
/*
 * B1: 3l capacity
 * B2: 5l capacity - 2l water
 * 
 * Task1: B1 > B2 - possible
 * Task2: B2 > B1 - chances of data loss
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		byte b1=12;//B1
		int i1=b1;//B2
		
		System.out.println(b1);//12
		System.out.println(i1);//12
		
		int i2=67;//higher
		byte b2=(byte) i2;//lower
		System.out.println(i2);//671
		System.out.println(b2);//67
		
		float f1 = 67.89f;
		int i3 = (int) f1;
		System.out.println(f1);//67.89
		System.out.println(i3);//67
		
		int i4 = 89;
		double d1 = i4;
		System.out.println(i4);//89
		System.out.println(d1);//89.0
		
		char c1 = 'b';
		int i5 = c1;
		System.out.println(c1);//b
		System.out.println(i5);//98
		
		int i6=98;
		char c2=(char) i6;
		System.out.println(i6);//98
		System.out.println(c2);//b
		
		//String - Concatenation
		//numeric - + - addition
		String st1 = "56676";
		int i7 = Integer.parseInt(st1);
		System.out.println(st1);//6781
		System.out.println(i7);//679
		
		
		double i8 = 78.4;
		String str2 = Double.toString(i8);
		System.out.println(i8+1);//79.4
		System.out.println(str2+1);//78.41
		
		

	}

}
