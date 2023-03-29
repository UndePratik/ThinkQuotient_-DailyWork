package Q1;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDetails s = new StudentDetails();
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("------Student Info-----");
		int choice=0;
		do {
			
			System.out.println("1.Student 1st.");
			System.out.println("2.Student 2nd");
			System.out.println("3.Exit");
			System.out.println("enter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
					System.out.println("Enter student id :");
					s1.setStudentId(sc.nextInt());
					System.out.println("Enter student name :");
					s1.setStudentName(sc.next());
					System.out.println("Enter student marks :");
					s1.setStudentMarks(sc.nextFloat());
					System.out.println("Enter student age :");
					s1.setStudentAge(sc.nextInt());
					System.out.println("=========================");
					System.out.println(s1.toString());
					//System.out.println("total number of student :"+Student.getCount());
					break;
			case 2:
					System.out.println("Enter student id :");
					s2.setStudentId(sc.nextInt());
					System.out.println("Enter student name :");
					s2.setStudentName(sc.next());
					System.out.println("Enter student marks :");
					s2.setStudentMarks(sc.nextFloat());
					System.out.println("Enter student age :");
					s2.setStudentAge(sc.nextInt());
					System.out.println("=========================");
					System.out.println(s2.toString());
					//System.out.println("total number of student :"+Student.getCount());
					break;
			case 3:
					System.exit(0);
			}
			System.out.println("total number of student :"+Student.getCount());

		}while(choice != 3);

	}

}
