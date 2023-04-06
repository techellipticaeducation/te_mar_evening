package operators;

import java.util.Scanner;

public class JumpStatementDemo {
	public static void main(String[] args) {
		//      break;
		//		Continue
		
		// scanner class
	
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("Enter your expenditure:  ");
			int input = scan.nextInt();
			if(input < 0) {
				break;
			}
			if(input == 0) {
				continue;
			}
			sum = sum + input;
			System.out.println("Total Expenditure : " + sum);
		}
		
		System.out.println("Thank you . using my calculator");
	}
}
