package oops;


public class Human {
// characteristic
	
	String name;
	int age;
	double weight;
	
	Head head;
	int k; 
	
	String nationality = "India"; // 1000 = 5 , 4995 byte  
	
	
	// behaviour	
	public void speak(String content) {
		System.out.println(name+" - "+content);
	}
	
	public void todayIsMyBirthDay() {
		age++;
	}
}

// Object - Visualize 
