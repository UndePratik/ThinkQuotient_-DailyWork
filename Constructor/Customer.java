package Constructor;

public class Customer {
	private int c_id;
	private String c_name;
	private String item_name;
	private float item_price;
	private String status;
	private String phone_number;
	public Customer()
	{
		//System.out.println("Default constructor");
	}
	

	public Customer(int c_id, String c_name,String phone_number)
	{	
		//System.out.println("Counstructor 1st");
		this.c_id = c_id;
		this.c_name = c_name;
		this.phone_number=phone_number;
	}


	public Customer(int c_id, String c_name, String item_name, float item_price,String phone_number, String status)
	{
		//System.out.println("Counstructor 2nd");
		this.c_id = c_id;
		this.c_name = c_name;
		this.item_name = item_name;
		this.item_price = item_price;
		this.phone_number=phone_number;
		this.status = "Unknown";
	}

	public int getC_id()
	{
		return c_id;
	}

	public void setC_id(int c_id)
	{
		this.c_id = c_id;
	}

	
	
	public String getC_name() 
	{
		return c_name;
	}

	public void setC_name(String c_name) 
	{
		this.c_name = c_name;
	}

	
	
	public String getItem_name()
	{
		return item_name;
	}

	public void setItem_name(String item_name)
	{
		this.item_name = item_name;
	}
	
	

	public float getItem_price()
	{
		return item_price;
	}

	public void setItem_price(float item_price)
	{
		this.item_price = item_price;
	}

	
	public void setPhone_number(String phone_number)
	{
		this.phone_number=phone_number;
	}
	public String getPhone_number()
	{
		return phone_number;
	}
	
	
	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	

	public String toString() {
		return "Customer id: " + c_id + ",Customer name: " + c_name + ", item name: " + item_name + ", item price: "
				+ item_price + ", status: " + status + "]";
	}
	
	
	
}
