package oops;

public class ObjectVariable {
	
	// static
	// instance 
	
	int m = n;
	static int n = 10;
	
	
	
	
	int i ; // instance variable
	static int j; //  static variable 
	
	// static method only allow static entity (variable , method)
	public static void main(String[] args) {
//		System.out.println(i);
		ObjectVariable object1 = new ObjectVariable();
		System.out.println(object1.i);
	}
	
	// non static method allow all type of entity
	public void m1() {
		System.out.println(i);
		System.out.println(j);
	}
	
}


class Demo{
	public static void main(String[] args) {
		
		// static variables - they are first one in memory
		// static variable - class variable
		// static varibale - no need of any object
		
		
		
		ObjectVariable.j = 56;
		
		// minimum object = 0 
		
		ObjectVariable obj1 = new ObjectVariable();
		obj1.i = 10;
		
		System.out.println(obj1.j);
		
//		obj1.j = 45;
//		obj1.i = 70;
//		
//		ObjectVariable obj2 = new ObjectVariable();
//		obj2.i = 20;
//		obj2.j = obj2.j + 5; 
////		System.out.println(obj1.j);
//		System.out.println(obj2.i);
	}
}