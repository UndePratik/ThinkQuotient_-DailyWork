package assignment31_Dec;

public class ThisKeyword {
	int s_id;
	String s_name;
	
//instance Variable
	//if local variable and instance variable are different 
	//then there is no use of this keyword,But they are same the
	//we use this keyword
//With constructor
	ThisKeyword()
	{
		
		System.out.println("I am default constructor");
	}
	
	ThisKeyword(int s_id)
	{
		this();//it is used to reuse code
		System.out.println("I am another constructor");
	}
	
	
	//Used in Method
	public void ThisKeyword(int s_id, String s_name) {

		this.s_id = s_id;
		this.s_name = s_name;
	}
	void print() {
		this.ThisKeyword(1,"Pratik");
		System.out.println("Hello Guys,I am "+s_name);
	}
	

	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword();
		t.print();

	}

}
