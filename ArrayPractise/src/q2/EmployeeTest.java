package q2;

public class EmployeeTest {

	public static void main(String[] args) {
		JoinigDate d1 = new JoinigDate(2,3,2023);
		JoinigDate d2 = new JoinigDate(1,4,2023);
		JoinigDate d3 = new JoinigDate(5,7,2023);
		
		Employee e[] = new Employee[5];
		
		e [0] = new Employee(1,"Rohit",700025f,d3);
		e [1] = new Employee(2,"Pratik",500025f,d2);
		e [2] = new Employee(3,"Shivam",400025f,d1);
		e [3] = new Employee(4,"Datta",890025f,d3);
		e [4] = new Employee(5,"Adi",750025f,d2);
		
		JoinigDate date;
		
		for(int i=0; i<e.length; i++)
		{
			/*date =e[i].getJoinigDate();
			System.out.println("--------------");
			System.out.println("Joining date :"+date);
			System.out.println(e[i]);
			
			for(int j=i+1; j<e.length; j++) {
				
			}*/
			
			if(e[i].getJoinigDate()==null)
				continue;
			System.out.println("----------------");
			date=e[i].getJoinigDate();
			System.out.println(e[i]);
			for(int j=i+1; j<e.length; j++)
			{
				if(date==e[j].getJoinigDate())
				{
					System.out.println(e[j]);
					e[j].setJoinigDate(null);
				}
			}
		}
		 System.out.println("Joining Date :"+d2);
	      for(int i=0;i<e.length;i++)
	      {
	        if(e[i].getJoinigDate()==d2)
	        {
	        	System.out.println(e[i]);
	        }

	    	  
	      }
	      
		
	}

}
