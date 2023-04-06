package objects;

public class Human {
	
	// characteristic
	String name;
	int age;
	double weight;
	double height;
	String country;
	
	Hand hand = new Hand();
	Leg leg;
	Head head;
	
	
	// Behaviour 
	public void speak(String content) {
		System.out.println(name + " : " + content);
	}
	
	public void todayIsMybirthday() {
		age = age +1;
	}
	
	
	// based on behavior, 
	//	we can change characteristics
}
