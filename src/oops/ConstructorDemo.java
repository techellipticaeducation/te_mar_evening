package oops;

public class ConstructorDemo {
	public static void main(String[] args) {
		Test9 t = new Test9("10");
		 System.out.println(t);		
	// object which do not have any ref = are applicable to garbage collection		
	}
}
// every class has its default constructor (non parametrized)
// but if we explicitly define it, then default constructor is gone

// constructor name exactly same as class name
// constructor do not have return type

// Constructor called once - when we are creating object

class Test9{
	
	Test9(String j){
		this(10);
	}
	
	Test9(int j){
		
	}
	
	Test9(int...a){
		this("10");
	}
	
	void m1() {
		System.out.println("hello");
		m2();
	}
	
	void m2() {
		m1();
	}
	
	
	
}
