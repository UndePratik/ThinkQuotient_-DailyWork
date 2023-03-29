package Exercise;

import java.util.Scanner;

public class circumferanceOfCircle {
	
	public static double cof(float radius){
		double circumferance = 2*3.14*radius;
		return circumferance;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();

		System.out.println("Circumferance Of Circle with radius "+radius+" is "+cof(radius));
	}

}
