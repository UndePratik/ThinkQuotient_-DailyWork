package class_object;

public class Program2 {
	
	int id;
	String name;
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Program2 s = new Program2();
		System.out.println(s);
		
		s.display();
		s.id=101;
		s.name = "Pratik";
		System.out.println("00..........00");
		s.display();
	}

}
