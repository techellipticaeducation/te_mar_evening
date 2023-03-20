package operators;

public class ConditionalStatement {
	public static void main(String[] args) {
//		if else
//      age < 18 - child
// 		age - 18 to 30 = adult
// 		30 - 45 = mature
// 		45 = old
		
		int age = 32;
		if(age < 18) {
			System.out.println("Child");
		}else if(age >= 18 && age <35){
			System.out.println("adult");
		}else if(age >= 30 && age < 45){
			System.out.println("mature");
		}else {
			System.out.println("adult");
		}
		
		
		
		
	}
}
