import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int original[][] = new int[3][3];
        System.out.println("Enter elements of matrix 3*3 ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                original[i][j] = s.nextInt();
        int transpose[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
