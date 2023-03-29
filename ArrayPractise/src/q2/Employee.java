package q2;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private JoinigDate joinigDate;
	
	
	public Employee(int id, String name, float salary, JoinigDate joinigDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinigDate = joinigDate;
	}


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


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public JoinigDate getJoinigDate() {
		return joinigDate;
	}


	public void setJoinigDate(JoinigDate joinigDate) {
		this.joinigDate = joinigDate;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joinigDate=" + joinigDate + "]";
	}
	
	
	
	
}
