package inheri;

	public class Car {
		A brakes() {
			System.out.println("Car Brakes");
			return null;
		}
	}

  class SportsCar extends Car{
	   A brakes() {
		   System.out.println("SportsCar Brakes");
		   return null;
	  }
  }
  
  class Demo {
	  public static void main(String[] args) {
		SportsCar c1 = new SportsCar();
		c1.brakes();
	}
  }
  
  class A{
	  
  }
  
  class B extends A{
	  
  }