package q1;

public class EmployeeTest {
	
	public static void sortSalary(Employee emp[])
	{
		for(int i=0; i<emp.length; i++)
		{
			if(emp[i].getSalary()=='\0')
				continue;
			System.out.println("----------------");
			System.out.println(emp[i]);
			for(int j=i+1; j<emp.length; j++)
			{
				if(emp[i].getSalary()==emp[j].getSalary())
				{
					System.out.println(emp[j]);
					emp[j].setSalary('\0');
				}
			}
		}
	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[5];
		
		emp[0] = new Employee(1,"Pratik",50000f);
		emp[1] = new Employee(2,"Rohit",60000f);
		emp[2] = new Employee(3,"Shivam",50000f);
		emp[3] = new Employee(4,"Swapnil",80000f);
		emp[4] = new Employee(5,"Datta",90000f);
		
		sortSalary(emp);
	}
}
