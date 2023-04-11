package assignment31_Dec;

import java.util.Scanner;

public class Student {
	
	private int studentId;
	String studentName, studentAddress, collegeName; 


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	Student(int studentId,String studentName,String studentAddress){
		this.studentId=studentId;
		this.studentAddress = studentAddress;
		this.studentName = studentName;
		
	}
	void display() {
		System.out.println("Student id      : "+studentId);
		System.out.println("Student Name    : "+studentName);
		System.out.println("Student Address : "+studentAddress);
	}


	public static void main(String[] args) {
		Student s = new Student(1,"Pratik","Pune");
		String collegeName = "NIT";
		String Choice;
		//s.display();
		Scanner sc = new Scanner(System.in);
		do
		{
		
		
		System.out.println(" Are you belongs to NIT college..");
		System.out.println(" Enter yes or no");
		
		System.out.println("enter choice");
		Choice=sc.next();
		switch(Choice) {
		case "Yes":
			System.out.println("College Name is.."+collegeName);
			System.out.println("Student id      : "+s.getStudentId());
			System.out.println("Student Name    : "+s.getStudentName());
			System.out.println("Student Address : "+s.getStudentAddress());
			    break;
		case "No":
			System.out.println("Enter your college name...");
			s.display();
	        break;
		case "Exit":
		{
			System.exit(0);
		}
		
		}
		}while(Choice!="Yes"|| Choice != "No");//while(true);
	/*else
		System.out.println("******WRONG INPUT******");
	*/
		
	}

}
