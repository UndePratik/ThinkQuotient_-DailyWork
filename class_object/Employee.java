package class_object;

public class Employee {
	
	int e_id;
	String name="sonal";
	String designation="Stack Developer";
	float salary=15000;
	String department="I.T";
			
	String gender="female";
	
	
	void print()
	{
		System.out.println("id is"+e_id);
		System.out.println("name is"+name);
		System.out.println("designation is"+designation);
		System.out.println("salary is"+salary);
		System.out.println("department is"+department);
		System.out.println("gender is.."+gender);
		
	}
	
	void calculate_Salary()//created method
	{
		if(salary>1000)
		{
			salary=salary+2000;
		}
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();//object of employee is created
	System.out.println(emp1);
		//e.print();
	    emp1.e_id=10001;
	    emp1.salary=18000;
		System.out.println("------");
		emp1.print();//you have called the print method
		emp1.calculate_Salary();//you have called the calculate_salary method
		emp1.print();

	}

}