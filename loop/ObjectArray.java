import java.util.Scanner;

class Employee{
	int id;
	float salary;
	String Name;
	
	
	public Employee(int id, float salary, String name) {
	
		this.id = id;
		this.salary = salary;
		this.Name = name;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", price=" + salary + ", Name=" + Name + "]";
	}
	
}
public class ObjectArray {

	public static void main(String[] args) {
		Employee e[]= new Employee[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<e.length;i++) {
			System.out.println("enter item "+i+1+" details");
			System.out.println("Enter id ");
			int id = sc.nextInt();
			System.out.println("Enter name ");
			String Name = sc.next();
			System.out.println("Enter Salary ");
			float salary = sc.nextFloat();
			
			e[i]=new Employee(id,salary,Name);
			System.out.println(e[i]);
			
		}
	/*	for(int i=0; i<e.length;i++) {
			System.out.println(e[i]);
		}*/
		
		for(Employee i:e) {
			System.out.println(i);
		}
		
		

	}

}
