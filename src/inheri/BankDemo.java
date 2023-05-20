package inheri;

public class BankDemo {
public static void main(String[] args) {
	HDFCRural h1 = new HDFCRural();
	h1.showInterest();
}
}

class Bank{
	int interest = 5;

}

class HDFC extends Bank{
	int interest = 6;
	
	public void showInterest() {
		System.out.println(this.interest);
		System.out.println(super.interest);
	}	
}

class HDFCRural extends HDFC{
	int interest = 7;
	public void showInterest() {
		System.out.println(this.interest);
		System.out.println(super.interest);
	}
}
