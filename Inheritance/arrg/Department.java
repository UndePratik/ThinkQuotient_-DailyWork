package inheritance.arrg;

public class Department {
	
	int d_id;
	String d_name;
	String d_course;
	
	public Department(int d_id,String d_name,String d_course)
	{
		this.d_course=d_course;
		this.d_id=d_id;
		this.d_name=d_name;
	}
	
	public String toString() {
		return d_id+" "+d_name+" "+d_course;
	}

}
