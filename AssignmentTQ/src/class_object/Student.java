package class_object;

public class Student {
	int id = 1;
	String name = "Pratik";
	
	int getId(int id) {
		
		System.out.println("id = "+id);
		return id;
	}
	void displayData() {
		getId(101);
		System.out.println("Second Method");
	}
	void display() {
		id=102;
		name= "Babu";
		System.out.println("Student Id = "+id);
		System.out.println("Student Name = "+name);
		
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.displayData();
		System.out.println("----------------");
		s.display();
	}

}
