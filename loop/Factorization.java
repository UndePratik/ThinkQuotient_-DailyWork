package loop;

public class Factorization {

	public static void main(String[] args) {
		int num =5;
		int fact = 1;
		/*for(int i=num; i>=1; i--) {
			fact = i*fact;
			*/
		for(int i=1; i<=num; i++) {
			fact = i*fact;
		}
		System.out.println(fact);
	}

}
