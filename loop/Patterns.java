
public class Patterns {

	public static void main(String[] args) {
		//solid rectangel
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
			      System.out.print("*");
		}
			System.out.println("*");
	  }
		System.out.println();
		//hollow Square
		int n=5;
		int m=5;
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Half pyramid
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) {
			      System.out.print("*");
		}
			System.out.println();
	  }
		System.out.println();
		//int n=5;
		for(int i=n; i>=1; i--) {
			for (int j=1; j<=i; j++) {
			      System.out.print("*");
		}
			System.out.println();
	  }
		System.out.println();
	//Inverted Half Pyramid
		//int n=5;
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++ ) {
			      System.out.print(" ");
		}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
	  }
		System.out.println();
		//Half Pyramid with number
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
			      System.out.print(j+" ");
		}
			System.out.println();
	  }
		System.out.println();
		//Inverted Half Pyramid with number
		//int n=5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		//Floyd's Traingle
		//int n=5;
		int num=1;
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
			      System.out.print(num+" ");
			      num++;
		}
			System.out.println();
	  }
		System.out.println();
		//0-1 Traingle
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				int sum=i+j;
				if(sum%2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	
	}

}
