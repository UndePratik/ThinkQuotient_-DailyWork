package com.course;

public class CourseTest {
	
	public static void displaymarks(Student stud[])
	{
		for(int i=0; i<stud.length; i++)
		{
			int marks = stud[i].getMarks();
			if(stud[i].getMarks()== marks )
			{
				System.out.println(stud[i]);
				//stud[i].setMarks(null);
			}
		}
	}

	public static void main(String[] args) {
		Course c[] = new Course[3];
		
		c[0] = new Course(1,"Java");
		c[1] = new Course(2,"Python");
		c[2] = new Course(3,"Android");
		
		Student stud[] = new Student[8];
		
		stud[0] = new Student(1,"Pratik",95,c[0]);
		stud[1] = new Student(2,"Rohit",89,c[1]);
		stud[2] = new Student(3,"Shivam",85,c[0]);
		stud[3] = new Student(4,"Adi",95,c[2]);
		stud[4] = new Student(5,"Swapnil",99,c[2]);
		stud[5] = new Student(6,"Datta",95,c[0]);
		stud[6] = new Student(7,"Sagar",80,c[0]);
		stud[7] = new Student(8,"Harish",99,c[1]);
		
		displaymarks(stud);
	}
}
