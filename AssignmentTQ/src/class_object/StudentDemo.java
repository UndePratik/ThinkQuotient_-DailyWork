package class_object;

public class StudentDemo{//class declaration
	int id = 101;
	String name = "Pratik";
	
	public static void main(String[] args) {
	/*	//Without object creation we can not 
		//print the inctance variable
		System.out.println(id);
		System.out.println(name);
	*/
		
		StudentDemo s = new StudentDemo();//object creation using new keyword
		//Student s1 = new Student();//Multiple object creation
		
		//Printing instance variable
		System.out.println(s.id);
		System.out.println(s.name);

	}	

}
