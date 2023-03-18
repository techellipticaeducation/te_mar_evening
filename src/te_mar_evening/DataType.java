package te_mar_evening;

public class DataType {
public static void main(String[] args) {
	// DataType = categorize your data
	
	// Numeric - 1,2,3,,5,10
	//  byte = 1 byte
	//  short = 2 byte
	//  int = 4 byte
	//  long = 8 byte
	
	// what is 1 byte  = 8 bit , 2power8 = 
	// Binary form , 0,1
 ///	256 //   negative 128 to postive 128
	// -128 to +127
	
	int i = 256; // 4 byte
	byte b1 = (byte)i; // 1 byte
//	System.out.println(b1);
//	int k = b1;
	
//	System.out.println(b1);
	
	//  Floating - 2.34, 6.5, 8.4
	// float = 4 byte
	// double  = 8 byte
		float f1 = 3.4f;
		double d1 = 3.5d;
		int k  = 10;
//		System.out.println(k/k);
//		System.out.println(f1/f1);
		
	// boolean - true/ false ,  1 bit 
		boolean n = false;
		boolean m = true;
		
	// char
//		ASCII code -    1 byte // 256 char
	  char c1 = 'y';
	  int c2 = (int)c1;
	  System.out.println(c2);
	  
	  int itval = 103;
	  char c = (char)itval;
	  System.out.println(c);
	  // Unicode system  - 2 byte
	  
	  char k1 = '\u0B93';
	  System.out.println(k1);  
	  
}
}
