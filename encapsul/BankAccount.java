package encapsul;

public class BankAccount {
	
	private int ac_id;
	private long ac_number;
	private String name;
	private double ac_balance;
	private long debitCard;
	
	
	public int getAc_id()
	{
		return ac_id;
	}


	public void setAc_id(int ac_id)
	{
		this.ac_id = ac_id;
	}


	public long getAc_number()
	{
		return ac_number;
	}


	public void setAc_number(long ac_number)
	{
		this.ac_number = ac_number;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public double getAc_balance()
	{
		return ac_balance;
	}


	public void setAc_balance(double ac_balance)
	{
		this.ac_balance = ac_balance;
	}


	public long getDebitCard() 
	{
		return debitCard;
	}


	public void setDebitCard(long debitCard) 
	{
		this.debitCard = debitCard;
	}


	@Override
	public String toString() {
		return "BankAccount [ac_id=" + ac_id + ", ac_number=" + ac_number + ", name=" + name + ", ac_balance="
				+ ac_balance + ", debitCard=" + debitCard + ", getAc_id()=" + getAc_id() + ", getAc_number()="
				+ getAc_number() + ", getName()=" + getName() + ", getAc_balance()=" + getAc_balance()
				+ ", getDebitCard()=" + getDebitCard() + "]";
	}
	

}
