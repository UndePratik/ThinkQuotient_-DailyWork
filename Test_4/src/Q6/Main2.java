package Q6;

class Employee1 {
    private int id;
    private String name;
    private double salary;

    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void incrementSalary(double amount) {
        salary += amount;
    }
}

class Manager1 extends Employee {
    private String department;

    public Manager1(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void incrementSalary(double amount) {
        setSalary(getSalary() + amount * 1.5);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(1, "John Doe", 50000);
        Manager1 mgr = new Manager1(2, "Jane Doe", 80000, "Sales");

        System.out.println("Employee Information");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        emp.incrementSalary(5000);
        System.out.println("Updated Salary: " + emp.getSalary());

        System.out.println("\nManager Information");
        System.out.println("ID: " + mgr.getId());
        System.out.println("Name: " + mgr.getName());
        System.out.println("Salary: " + mgr.getSalary());
        System.out.println("Department: " + mgr.getDepartment());
        mgr.incrementSalary(5000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
