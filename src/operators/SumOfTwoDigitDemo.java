package operators;

public class SumOfTwoDigitDemo {
	public static void main(String[] args) {
		
		int i = 89;    //  digit ka sum = 2 + 5 = 7
		
		int reminder = i % 10; // 9
		int devide = i / 10;   // 8
		
		int sum = reminder + devide;
		System.out.println(sum);
		
	}
}
