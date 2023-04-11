package oops;

public class HumanDemo {
	public static void main(String[] args) {
		
		Human h1 = new Human(); // object
		h1.name = "Sachin";
		h1.age = 40;
		
		Head headx = new Head();
//		h1.headxyz = headx;
		
		h1.head.shape = "oval";
		
		int m = 10;
		h1.k = m;
				
		Human h2 = new Human();
		h2.name = "Kareena";
		h2.age = 35;
				
		h1.speak("Hello");
		h2.speak("Hello Sir . How are you?");
		h1.speak("I am good");
		h2.speak("HBD . your age is " + h1.age);
		h1.todayIsMyBirthDay();
	}
}
