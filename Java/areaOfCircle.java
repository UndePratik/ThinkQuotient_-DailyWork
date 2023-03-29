import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();
        double pie = 3.14;
        double areaOfCircle = pie * r * r;

        System.out.println(areaOfCircle + " is the area of circle");
    }
}
