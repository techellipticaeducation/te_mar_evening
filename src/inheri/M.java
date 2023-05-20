package inheri;

public class M {
	public static void main(String[] args) {
		Z z1 = new Z();
		z1.test1();
	}
}
// Overriding - if parent and child having same signature method, then child
//override the parent method

// Rule 1 - overridden method can not reduce the visibility of method
// public > protected > default > private

// Rule 2 - private method cannot be overridden

// Rule 3 - final method cannot be overridden , constant
// final class cannot be extended , final keyword - IS-A is not possible

// Rule 4 - overridden method can return same class , subclass

class D1{
	
}
class D2 extends D1{
	
}


class X{
	 private D2 test1() {
		System.out.println("X -> test1");
		return null;
	}
}

class Y extends X{
	public D2 test1() {
		System.out.println("Y -> test1");
		return null;
	}
}

class Z extends Y{
	public D2 test1() {
		System.out.println("Y -> test1");
		return null;
	}
}


