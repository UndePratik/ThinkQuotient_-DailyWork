package Q8;

public class EmployeeDetails {

	public static void main(String[] args) {
		 Department sales = new Department("Sales");
	      Department marketing = new Department("Marketing");
	      Department finance = new Department("Finance");
	      
	      Employee emp1 = new Employee("Pratik", 22, "Manager", sales);
	      Employee emp2 = new Employee("Shivam", 24, "Associate Manager", marketing);
	      Employee emp3 = new Employee("Datta", 23, "Associate", finance);
	      Employee emp4 = new Employee("Rohit", 21, "Assistant Manager", sales);
	      Employee emp5 = new Employee("Amol", 25, "Manager", marketing);
	      
	      System.out.println("Employee Details: ");
	      System.out.println("Name: " + emp1.getName() + ", Age: " + emp1.getAge() + ", Position: " + emp1.getPosition() + ", Department: " + emp1.getDepartment().getName());
	      System.out.println("Name: " + emp2.getName() + ", Age: " + emp2.getAge() + ", Position: " + emp2.getPosition() + ", Department: " + emp2.getDepartment().getName());
	      System.out.println("Name: " + emp3.getName() + ", Age: " + emp3.getAge() + ", Position: " + emp3.getPosition() + ", Department: " + emp3.getDepartment().getName());
	      System.out.println("Name: " + emp4.getName() + ", Age: " + emp4.getAge() + ", Position: " + emp4.getPosition() + ", Department: " + emp4.getDepartment().getName());
	      System.out.println("Name: " + emp5.getName() + ", Age: " + emp5.getAge() + ", Position: " + emp5.getPosition() + ", Department: " + emp5.getDepartment().getName());

	}

}
