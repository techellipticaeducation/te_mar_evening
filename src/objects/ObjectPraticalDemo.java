package objects;

public class ObjectPraticalDemo {
	public static void main(String[] args) {
		
		Human h1 = new Human("Sachin",
				24,34.6,34.7,"India");
		h1.name = "hj";
		
		
//		h1.name = "sachin";
//		h1.age  = 24;
//		
//		h1.hand.lengthOfHand = 5.6;
		
//		Hand han1 = new Hand();
//		han1.numberOfHand = 2;
//		han1.lengthOfHand = 2.3;
//		h1.hand = han1;
		
		System.out.println(h1.hand.lengthOfHand);
		
//		Human h2 = new Human();
//		h2.name = "Sagar";
//		h2.age= 30;
//		
//		h1.speak("Hello ! my name is sachin");
//		h2.speak("Hey good name");
//		
//		h1.speak("My Birthday today. my age is " + h1.age);
//		h1.todayIsMybirthday();
//		h1.speak("My Birthday today. my age is " + h1.age);
	}
}
