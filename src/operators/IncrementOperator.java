package operators;

public class IncrementOperator {
public static void main(String[] args) {
	
	// Pre Increment = First increase then assign    ,   ++i  , --i
	// PostIncrement = First assign then increase    ,   i++  , i--
	
	int i = 10;
	int j = i++ + ++i + ++i;
		//  10     12    13
	//  Shortcut =  jab variable dikhe - assign , jab ++ dikhe to increase karo
	// current value = 13
	
	System.out.println("i = " + i);
	System.out.println("j = " + j);
	
	// Decrease  
	
}
}
