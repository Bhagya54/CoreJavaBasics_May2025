package day5_Arrays;

public class ArraysDemo {
/*
 * int[] id = new int[10]
 * 
 * Array: store multiple values of same data type
 * 3 parts 
 * 1. Declaration
 * 2. Instantiation
 * 3. Initialization
 * 
 * 1.index starts from zero
 * 2.If we don't initialize any of the array value, java gives a default value to it
		//int - 0
		//String - null
   3. size has to defined as part of your instantiation
 *
 */
	public static void main(String[] args) {
		int[] id; //Declaration
		id = new int[5];//Instantiation
		id[0] = 12;
		id[1] = 24;
		 //initialization
		id[3] = 15;
		id[4] = 78;
		
//		System.out.println(id[0]);
//		System.out.println(id[1]);
//		System.out.println(id[2]);
//		System.out.println(id[3]);
//		System.out.println(id[4]);
		
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]);
		}
		
		//declaration + initialization
		int a1[]= {23,12,45,67,100};
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		
		/*
		 * Student names store it in an array
		 * 
		 */
		
		
		

	}

}
