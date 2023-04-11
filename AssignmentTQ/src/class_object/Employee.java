package class_object;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(101);
		e.setName("Pratik");
		e.setSalary(20000);
		System.out.println("---Welcome to Google---");
		System.out.println("Employee id     : "+e.getId());
		System.out.println("Employee name   : "+e.getName());
		System.out.println("Employee Salary : "+e.getSalary());
	}

}
