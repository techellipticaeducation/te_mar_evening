package oops;


public class Human {
// characteristic
	
	String name;
	int age;
	double weight;
	
	Head head;
	int k; 
	
	static final String nationality = "India"; // 1000 = 5 , 4995 byte  
	
	static final double PI = 3.14d;
	
	// behaviour	
	public void speak(String content) {
		System.out.println(name+" - "+content);
	}
	
	public void todayIsMyBirthDay() {
		age++;
	}
}

// Object - Visualize 
