package pattern;

public class Rectangle1 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
