
public class Advpattern {

	public static void main(String[] args) {
		
		//Butterfly Pattern
		System.out.println("1.Butterfly Pattern :-");
		int n=5;
		
		//Upper Half
		for(int i=1; i<=n; i++) {
			//1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			//Spaces
			int spaces = 2 * (n-i);
			for(int j=1; j<=spaces; j++) {
					System.out.print(" ");
					
			}
		    //Second Part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		//lower Half
		for(int i=n; i>=1; i--) {
			
			//1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			//Spaces
			int spaces = 2 * (n-i);
			for(int j=1; j<=spaces; j++) {
					System.out.print(" ");
					
			}
		    //Second Part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		//Hollow Butterfly Pattern
		System.out.println("Hollow Butterfly Pattern :-");
		//Upper Part
		for(int i=1; i<=n; i++) {
			//1st Half
			for(int j=1; j<=i; j++) {
				
				if(j == 1 || j == i) {
					System.out.print("*");
				
				}else {
					System.out.print(" ");
				}
			}
			//Space
			int space=2*(n-i);
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			//Second Half
			for(int j=1; j<=i; j++) {
				if(j == 1 || j == i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//Lower Part
		for(int i=n; i>=1; i--) {
			//1st Half
			for(int j=1; j<=i; j++) {
				if(j == 1 || j == i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Spaces
			int space=2*(n-i);
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			//Second Half
			for(int j=1; j<=i; j++) {
				if(j == 1 || j == i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
		//Solid Rhombus
		System.out.println("Solid Rhombus :-");
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Hollow Rhombus
		System.out.println("Hollow Rhombus Pattern :-");
		for(int i=1; i<=n; i++) {
			
			//Spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
				}
			
			//Star
			for(int j=1; j<=n; j++) {
				
				if(i == n || i == n || j == 1 || j == n ) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			System.out.println();
		}
		
		//Number Pyramid
		System.out.println(" number Pyramid :-");
		for(int i=1; i<=n; i++) {
			//Spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//number => print row no,row no times
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//Palindromic Pattern
		System.out.println("Palindromic Pattern :-");
		
		for(int i=1; i<=n; i++) {
			
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//1st Half
			for(int j=i; j>=1; j--) {
			
				System.out.print(j);
		}
		//Second Half
		for(int j=2; j<=i; j++){
			System.out.print(j);
		}
		System.out.println();
	  }
		
		//Diamond Pattern
		System.out.println("Diamond Pattern :-");
		
		//1st Half
		for(int i=1; i<=n; i++) {
			//Spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//Star
			int star = 2*i-1;
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			//2nd Half
			for(int i=n; i>=1; i--) {
				//Spaces
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				
				//Star
				int star = 2*i-1;
				for(int j=1; j<=star; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}
}
