package encapsul;

class CheckPassword
{
	String user = "Pratik";
	//String pass = "1234"; 
	
	String check() {
		return "1234";
	}
}

public class Username {

	
	public static void main(String args[])
	{
		CheckPassword c = new CheckPassword();
		String s1 = c.check();
		System.out.println(c.check());
		if(s1.equals("1234"))
		{
			System.out.println("Welcome "+c.user);
		}else{
			System.out.println("not a correct user");
		}
	}

}
