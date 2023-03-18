package operators;

public class BitwiseAndLogicalOperatorDemo {
	public static void main(String[] args) {
		// And - any one false - then full false    - &
		// true true = true
		// true false = false
		// false false = false
		// false true = false
		
		boolean b1 = true;
		boolean b2 = false;
		
		// Bitwise Operator
		System.out.println(b1 | b2);
		
		// Logical Operator && - if first value is false then no need to check second value
		// Logical Operator || - if first value is true then no need to check second value
		
		// Or - any one  - anyone true = complete true |
		// true true = true
		// true false = true
		// false false = false
		// false true = true
	}
}
