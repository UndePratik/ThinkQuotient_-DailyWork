package inheritance.arrg;

public class Company {
	String c_name;
	String c_location;
	
	public Company(String c_name,String c_location) {
		this.c_location=c_location;
		this.c_name=c_name;
		
	}
	
	public Company()
	{
		
	}

	public void setC_name(String c_name) {
		this.c_name=c_name;
	}
	public String getC_name() {
		return c_name;
	}
	
	public void setC_location(String c_location) {
		this.c_location=c_location;
	}
	public String getC_location() {
		return c_location;
	}


}
