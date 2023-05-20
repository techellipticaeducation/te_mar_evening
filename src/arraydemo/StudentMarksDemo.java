package arraydemo;

import java.util.Scanner;

public class StudentMarksDemo {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("How many subject marks you want to provide");
	int size = scan.nextInt();
	
	int[] marks = new int[size];
	
	for(int i = 0 ; i < size ;i++) {
		System.out.println("Enter Subject " + (i+1) + " marks");
		int mark = scan.nextInt();
		marks[i] = mark;
	}
	
	
	System.out.println("here is the marks for your student");
	for(int m : marks) {
		System.out.println(m);
	}
	
	
}
}
