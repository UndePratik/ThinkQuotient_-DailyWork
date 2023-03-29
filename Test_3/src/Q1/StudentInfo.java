
package Q1;

public class StudentInfo {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Pratik",453,23);
		Student s2 = new Student(2,"Babu",456,22);
		System.out.println("-------Student Info--------");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("---------------");
		System.out.println("Total number of Student :"+Student.getCount());
	}

}
