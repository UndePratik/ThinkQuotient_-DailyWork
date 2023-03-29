package Interface;

interface tax
{ public static final int a=10;


	public abstract void payTax();
}
interface loan
{
	void loanFacility();
}
 class Employee implements tax,loan
{
	 
	@Override
	public void payTax() {
		System.out.println("Employee paying tax");
		
	}

	@Override
	public void loanFacility() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 class Politician implements tax
 {

	@Override
	public void payTax() {
		System.out.println("Politician paying tax");
		
	}
	 
 }

public class InterfaceMain {

	public static void main(String[] args) {
		tax t;
		t=new Employee();
		t.payTax();
		t=new Politician();
		t.payTax();

	}

}
