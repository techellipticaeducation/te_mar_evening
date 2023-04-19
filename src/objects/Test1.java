package objects;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// static 

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to expanse Calculator");
		int sum = 0;
		while(true) {
			System.out.println("Enter Your Kharcha:");
			int intVal = scan.nextInt();
			if(intVal < 0) {
				System.out.println("Total Expense :  " + sum);
				break;
			}
			sum = Test1.add(sum, intVal);
			System.out.println("Total Expense : " +sum);

		}

// var - args = various arguments (how many arguments you suppose to send)
		// not static
		//		Test1 test1 = new Test1();
		//		test1.m2();
		add(10);
		
		//prime , fiba
		

	}

	public void primeNumberTill(int tillNumber) {
		
	}
	
	// Method =  input parameters -> Service -> return type 

	
	// 2 rules 
	// one vararsg is allowed with method param
	// varargs must be the last param of the method
	static int add (int j, int...ar){
		int sum = 0;
		for(int s : ar) {
			sum+=s;
		}
		return sum;
	}
	
	// i want a method . jo n number of param le liye paye
	// but method need 1 minimum in param
	
	static float add (float i, float j, float m){ // method definition
		float k = i + j+m; 
		return k; // return type
	}
	
	//Method Overloading - Compile time Polymorphism
	//return - no relation at all
	
	

	// non - parameterized method
	static int m1() {
		return 10;
	}

	// non return method - void
	static void m2() {

	}
}
