import java.util.*;

public class Practiceset3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Problem1
         * int number = sc.nextInt();
         * 
         * if (number > 0) {
         * System.out.println(number + " Number is Positive");
         * } else {
         * System.out.println(number + " number is negative");
         */
        /*
         * Problem2
         * double temp = 103.5;
         * 
         * if (temp > 100) {
         * System.out.println("You Have Fever");
         * } else {
         * System.out.println("You don't have a fever");
         */
        /*
         * // Problem3
         * int number = sc.nextInt();
         * switch (number) {
         * case 1:
         * System.out.println("Monday");
         * break;
         * case 2:
         * System.out.println("Tuseday");
         * break;
         * case 3:
         * System.out.println("Wednesday");
         * break;
         * case 4:
         * System.out.println("Thursday");
         * break;
         * case 5:
         * System.out.println("Friday");
         * break;
         * case 6:
         * System.out.println("Saturday");
         * break;
         * case 7:
         * System.out.println("sunday");
         * break;
         * default:
         * System.out.println("You Enter wrong number");
         */
        /*
         * // Problem4
         * int year = sc.nextInt();
         * 
         * boolean x = (year % 4 == 0);
         * boolean y = (year % 100 != 0);
         * boolean z = ((year % 100 == 0) && (year % 400 == 0));
         * 
         * if (x && (y || z)) {
         * System.out.println(year + " Is aLeap year");
         * } else {
         * System.out.println(year + " is not a Leap year");
         * 
         * }
         * 
         * // Problem5
         * for (int i = 0; i < 5; i++) {
         * System.out.println("Hello");
         * i += 2;
         * }
         * 
         * // Problem6
         * int number;
         * int choice;
         * int evenSum = 0;
         * int oddSum = 0;
         * 
         * do {
         * System.out.println("Enter the Number : ");
         * number = sc.nextInt();
         * 
         * if (number % 2 == 0) {
         * evenSum = evenSum + number;
         * } else {
         * oddSum = oddSum + number;
         * }
         * System.out.
         * println("Do you Want to continue? if yes press 1 and if no press o");
         * 
         * choice = sc.nextInt();
         * } while (choice == 1);
         * 
         * System.out.println("Sum of even number :" + evenSum);
         * System.out.println("sum of odd number :" + oddSum);
         * 
         * // Problem7
         * // Factorial of user input number
         * int number;// to hold the number
         * int fact = 1;// to hold the factorial
         * 
         * System.out.println("Enter the Positive integer : ");
         * number = sc.nextInt();
         * 
         * for (int i = 1; i <= number; i++) {
         * fact = fact * i;
         * }
         * System.out.println("factorial of " + number + " is " + fact);
         */

        int n = sc.nextInt();
        int m;
        for (int i = 1; i <= 10; i++) {
            // System.out.println(n + " * " + i + " =" + n * i);
            m = n * i;
            System.out.println(m);
        }
    }
}
