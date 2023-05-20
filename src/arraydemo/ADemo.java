package arraydemo;

public class ADemo {
int i = 10;
String j = "abc";

public static void main(String[] args) {
	
}
}

class ADemoDemo{
	public static void main(String[] args) {
		ADemo m1 = new ADemo();
		System.out.println(m1.j);
		m1.j = "xyz";
		m1.j = "abc";
		System.out.println(m1.j);
		
		System.out.println(m1.j);
		
		m1.j = "plo";
		m1.j = "xyz";
		
		m1.i = 30;
		m1.i = 40;
		
	}
}
