import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Maximum Number is : " + a);
            } else {
                System.out.println("Maximum Number is : " + c);
            }
        } else {
            System.out.println("Maximum Number is : " + b);
        }
    }
}
