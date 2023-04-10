package oops;


public class Human {
// characteristic
	
	String name;
	int age;
	double weight;
	
	Head headxyz;
	int k; 
	
	// behaviour	
	public void speak(String content) {
		System.out.println(name+" - "+content);
	}
	
	public void todayIsMyBirthDay() {
		age++;
	}
}

// Object - Visualize 
