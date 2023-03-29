package Q10;

import java.util.Scanner;

public class HitCounter {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the hit counter application!");
        System.out.println("To increase the hit count, press 'Enter'");
        System.out.println("To exit, type 'exit'");

        while (true) {
            String line = input.nextLine();

            if (line.equals("exit")) {
                break;
            } else {
                count++;
                System.out.println("Hit count: " + count);
            }
        }
        System.out.println("Exiting hit counter application.");
    }
}
