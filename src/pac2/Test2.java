package pac2;

import pac1.Test1;

public class Test2 {
	
	private static void m1_private() {
		Test1.m1_public();
		Test1.m1_default();
		System.out.println("pac2.Test2.m1_private");
	}
	
	
	static void m2() {
		m1_private();
	}
	
}


