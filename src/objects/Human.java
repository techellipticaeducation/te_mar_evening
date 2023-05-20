package objects;

public class Human {
	
	// characteristic
	String name;
	int age;
	double weight;
	double height;
	String country;
	
	Human(String name){
		this.name = name;
	}
	
	Human(String name, int age,
			double weight, double height,String country){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.country = country;
	}
	
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
