package operators;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i = 0; i < 2 ;i++) {
			for(int j = 0 ; j  < 2; j++) {
				if(j == 1) {
					continue;
				}
				System.out.println(i);
				System.out.println("Hello of " + j);
			}
		}
	}
}
