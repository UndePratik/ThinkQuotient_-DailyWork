package pattern;

public class HomePattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int sp=4; sp>=i; sp--) {
				System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=1; j<=2*i-1;j++) {
				if(j==1 ||i==5|| j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//int n =5;
		for(int i=1; i<=5; i++) {
			
			System.out.print(" ");
			for(int j=1; j<=5; j++) {
				
				System.out.print(" ");
	
				if(i==5|| j==1||j==5)
					
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
