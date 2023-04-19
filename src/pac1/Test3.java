package pac1;

public class Test3 {
	private static void m1_private() {
		Test1.m1_public();
		Test1.m1_default();
		System.out.println("pac2.Test2.m1_private");
	}
}


// private and protected class nhi hot hian
// public / default 