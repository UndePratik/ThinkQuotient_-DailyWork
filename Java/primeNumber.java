import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " is not a prime number");
        } else {
            a = a + 1;
            System.out.println(a + " is a prime number");
        }

    }
}
