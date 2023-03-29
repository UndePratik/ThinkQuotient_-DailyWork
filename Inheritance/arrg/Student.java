package inheritance.arrg;

public class Student {
	int s_id;
	String s_name;
	Department d;
	
	public Student(int s_id, String s_name,Department d) {

		this.s_id = s_id;
		this.s_name = s_name;
		this.d = d;
	}
	

	@Override
	public String toString() {
		return s_id + " " + s_name + " "+ d ;
	}


	public static void main(String[] args) {
		Department d = new Department(101,"MCA","Post Graduation");
		Student s = new Student(1,"Pratik",d);
		System.out.println(s);

	}

}
