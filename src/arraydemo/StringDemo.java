package arraydemo;

public class StringDemo {
public static void main(String[] args) {
	
	// array of characters
	
	String m1 = "aune";    
	String m2 = "cune1"; // literal way
	
	
	String m3  = new String("pune"); // Object way
	String m4  = new String("pune");
	
	System.out.println(m1==m2);
	System.out.println(m1==m3);
	System.out.println(m2==m4);
	System.out.println(m3==m4);
	
	
	System.out.println(m1.equals(m2));
	System.out.println(m1.equals(m3));
	System.out.println(m1.equals(m4));
	System.out.println(m1.equals(m4));
	
	// interning 

	m3 = m3.intern();
	System.out.println(m1==m3);
	
	// pune, mumbai, delhi, Delhi, kolkata, m9, m10, chennai, m11
	// immutability - once string is created, we cannot change it
	
	// string method
	
	
	
}
}
