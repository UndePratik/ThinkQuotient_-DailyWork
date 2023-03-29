import java.util.Scanner;

public class demo {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = a + b;
			System.out.println("the sum no is : " + c);
		}

	}
}
