package runtimepoly;

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		// test script
		Browser chrome = new Chrome();
		chrome.type();
		chrome.click();
		chrome.type();
		chrome.click();
		
	}
}
//abstract = partial,  HAS-A Relationship not allowed ,  only IS-A Relation allowed

interface Browser{
	public void click();
	public void type();
}

abstract class Browser1{
	public abstract void click();
	public abstract void type();
	
	
	public void test6() {
		
	}
}

class Chrome implements Browser{
	public void click() {System.out.println("chrome -> click");}
	public void type() {System.out.println("Chrome -> type");}
}

class Mozilla implements Browser{
	public void click() {System.out.println("firefox -> click");}
	public void type() {System.out.println("firefox -> type");}	

}


class Car{
	public void brake() {
		
	}
}

class Audi extends Car{
public void brake() {
		System.out.println("");
	}

}

class Maruti extends Car{
public void brake() {
		
	}
}






