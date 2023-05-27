package abstractiondemo;

public class ConstructorChainDemo {
public static void main(String[] args) {
	C c1 = new C(10);
}
}
// super() and this() must be the first statement in constructor
// we cannot use super() and this() together
class A{
	A(){
		System.out.println("A Constructor"); //  file creation
	}
	A(int i ){
		System.out.println("A constructor with " + i);
	}
}

class B extends A{
	B(){
		System.out.println("B Constructor");
	}
	B(int i ){
		super(i);
		System.out.println("B constructor with " + i);
	}
	B(int i, int j ){
		super(i);
		System.out.println("B constructor with " + i + " " + j);
	}
}

class C extends B{
	C(){
		System.out.println("C Constructor");
	}
	C(int i ){
		super(i,10);
		System.out.println("C constructor with " + i);
	}
}