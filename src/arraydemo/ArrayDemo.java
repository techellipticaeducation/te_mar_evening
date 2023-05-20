package arraydemo;

public class ArrayDemo {
	public static void main(String[] args) {
		
//		int i = 10;
//		
		int[] j = {10,30,45,23,78,56}; 
		
		int[][] j8 = {{20,30},{45,23},{78,10}};
		
		System.out.println(j8[0].length);
		
//		
//		j[6] = 100;
//		System.out.println(j[2]);
//		
		
//		for(int i = 0 ; i < j.length ; i = i+2) {
//			System.out.println(j[i]);
//		}
 // collection iteration - foreach
		
		
		for(int m : j) {
			System.out.println(m);
		}
		
		// rules
		// when we are defining one array, we have to define its size
		// fastest collection in java
		// why array start from zero
		// 
		
		
//		int[] m = new int[2];
//		m[0] = 10;
//		m[1]= 20;
//		
//		// instance variable
//		
//		System.out.println(j.length);
		
		
	}
}
