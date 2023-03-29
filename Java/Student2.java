import java.util.Scanner;

public class Student2 {
    int rno;
    String name;
    int s1;
    int s2;
    int s3;
    int tot;
    double per;

    Student2() {
        System.out.println("\nDefault Constructor");
        rno = 0;
        name = null;
        s1 = 0;
        s2 = 0;
        s3 = 0;
    }

    Student2(int r, String n, int sub1, int sub2, int sub3) {
        System.out.println("\nParameterized Constructor");
        rno = r;
        name = n;
        s1 = sub1;
        s2 = sub2;
        s3 = sub3;
    }

    Student2(int r, String n) {
        System.out.println("\nConstructor Overloading");
        rno = r;
        name = n;
    }

    Student2(Student2 a) {
        System.out.println("\nCopy Constructor");
        rno = a.rno;
        name = a.name;
        s1 = a.s1;
        s2 = a.s2;
        s3 = a.s3;
    }

    void display() {
        System.out.println("Roll no :" + rno);
        System.out.println("Name :" + name);
        System.out.println("subject 1 marks : " + s1);
        System.out.println("subject 2 marks : " + s2);
        System.out.println("subject 3 marks : " + s3);
    }

    void cal() {
        tot = s1 + s2 + s3;
        per = tot / 3;
        System.out.println("Student total : " + tot);
        System.out.println("Student Percentage : " + per);
        if (per > 50)
            System.out.println("Student is Pass");
        else
            System.out.println("Student is Fail");
    }

    public static void main(String[] args) {
        // Default constructor
        Student2 st1 = new Student2();
        st1.display();
        Scanner s = new Scanner(System.in);
        System.out.println("\n Enter Roll no :");
        int rno = s.nextInt();
        System.out.println("Enter Name :");
        String name = s.next();
        System.out.println("Enter subject 1 marks : ");
        int s1 = s.nextInt();
        System.out.println("Enter subject 2 marks : ");
        int s2 = s.nextInt();
        System.out.println("Enter subject 3 marks : ");
        int s3 = s.nextInt();
        // Parameterized Constructor
        Student2 st2 = new Student2(rno, name, s1, s2, s3);
        st2.display();
        st2.cal();
        // Copy Constructor
        Student2 st3 = new Student2(st2);
        st3.display();
        st3.cal();
        // Constructor Overloading
        System.out.println("\n Enter Roll no :");
        rno = s.nextInt();
        System.out.println("Enter Name :");
        name = s.next();
        Student2 st4 = new Student2(rno, name);
        st4.display();
    }
}
