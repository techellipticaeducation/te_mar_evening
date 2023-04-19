package pac1;

import pac2.Test2;

public class Test1 {
	public static void main(String[] args) {
		Test2.m1_private();
	}
	static void m1_default() {
		System.out.println("pac1.Test1.m1_default");
	}
	public static void m1_public() {
		System.out.println("pac1.Test1.m1_default");
	}
}

// access to any entity 
// private - with in class
// default - with in package
// protected - default + 
// public - every where 
//

