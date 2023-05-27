package abstractiondemo;

public class AbstractionDemo {
	public static void main(String[] args) {
		Car c1 = new Maruti();
		c1.brakes();
		Bank b1 = new HDFC();
		b1.interest();
//		Car c2= new Car(); // HAS-A RELATIONSHIP not possible
	}	
}

// right now Maruti me  brakes - optional
// mandate 
// abstract -> object nhi bana sakte , 
// final  -> we cannot extends it , IS-A Relation ship not allows
// abstract and final -> NOOOOOOOOOOOOOOOOOOOOOOOOOOO

// abstract 
// abstract class - partial abstraction,  (abstract method  + concrete )
// interface - abstract

abstract class Car{
	public abstract void brakes();
	public void speed() {
		
	}
}

class Maruti extends Car{
	public void brakes() {

	}
}
// Interface to interface -> extends
// interface to class -> implements
// class to class  -> extends

// one class can implements n number of interfaces
// multiple inheritance can be achieved using interfaces
interface Bank{
	int i = 10;  // interface variables , by default   public final and static  = constant
	public void interest();
}
interface IndianBank{
	int i = 20;
	public void interest();
}

class HDFC implements Bank,IndianBank{
	public void interest() {
		System.out.println("");
		System.out.println(IndianBank.i);
	}
}

