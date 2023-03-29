package Q6;
//Q6. Write a program to implement inheritance for Employee which 
//is inherited by Manager. Override the  method incrementSalary.
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void incrementSalary(double amount) {
        salary += amount;
    }

	@Override
	public String toString() {
		return "Employee id: " + id + ", Name: " + name + ",salary: " + salary;
	}
    
}

class Manager extends Employee {
    String department;

    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

   @Override
    public void incrementSalary(double amount) {
        salary += amount * 1.5;
    }

@Override
public String toString() {
	return "Department: " + department + ", Id: "+id+", Name: "+name+", Salary: "+salary;
}
   
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Pratik", 50000);
        Manager m1 = new Manager(2, "Babu", 80000, "Sales");

        System.out.println("Employee Information");
        System.out.println(e1.toString());
        System.out.println("-------------");
        System.out.println("Manager Information");
        System.out.println(m1.toString());
        System.out.println("**********************");
        e1.incrementSalary(5000);
        m1.incrementSalary(4000);
        System.out.println("Employee Information");
        System.out.println(e1.toString());
        System.out.println("-------------");
        System.out.println("Manager Information");
        System.out.println(m1.toString());
    }
}

