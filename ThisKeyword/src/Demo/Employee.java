package Demo;

public class Employee {
	int e_id;
	String e_name;
	float e_salary;
	String c_name;
	
	

	public Employee()
	{
	System.out.println("Employee Details ");
	System.out.println("-----------------");
	}
	
	
	public Employee(String c_name) {
		this();
		this.c_name = c_name;
	}


	public Employee(String c_name,int e_id, String e_name, float e_salary) {
		this(c_name);
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
	}



	public static void main(String[] args) {
		Employee e1 = new Employee("google",101,"Pratik",750000);
		System.out.println(e1);
	}

}
