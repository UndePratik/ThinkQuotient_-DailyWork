package Interface;

interface student
{ 


	public abstract void s_class();
}
interface techer
{
	void t_department();
}
 class School implements student,techer
{
	 
	@Override
	public void s_class () {
		System.out.println("Third Year Class");
		
	}

	@Override
	public void t_department() {
		System.out.println("Chemistry Department");
		
	}
	
}
 
 class Department implements student
 {

	@Override
	public void s_class() {
		System.out.println("Student Class is 3rd Year");
		
	}
	 
 }

public class CollegeMain {

	public static void main(String[] args) {
		student s;
		techer t;
		t = new School();
		t.t_department();
		s=new School();
		s.s_class();
		s=new Department();
		s.s_class();

	}

}
