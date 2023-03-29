package Q2;

public class Account {
	
	private int accid;
	private String name;
	private double balance;
	private String bankname;
	private String pancard;
	
	public Account(int accid,String name,double balance,String bankname)
	{
		this.accid= accid;
		this.name=name;
		this.balance=balance;
		this.bankname=bankname;
	}
	
	public void setAccid(int accid)
	{
		this.accid=accid;
	}
	public int getAccid()
	{
		return accid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	
	public void deposite(double amount)
	{
		System.out.println("You successfully deposite :"+amount);
		balance += amount;
	}
	void deposite(double amount,String pancard)
	{
		if(balance+amount>=50000)
			this.pancard=pancard;
	}
	public void withdraw(double amount)
	{
		if(balance>500)
		{
			System.out.println("You successfully Withdraw :"+amount);
			balance -= amount;
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
	
	@Override
	public String toString() {
		return "Account Info :" + accid + ", " + name + ", " + balance + ", " + bankname
				+ ", " + pancard;
	}

	public static void main(String[] args) {
		Account a1 = new Account(101,"pratik",1000,"SBI");
		Account a2 = new Account(201,"rohit",1500,"HDFC");
		Account a3 = new Account(301,"datta",2000,"RBI");
		
		a1.deposite(6000);
		a2.deposite(5000,"PKIH1425M");
		a3.withdraw(100);
		
		System.out.println("-----Bank Details------");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("---------------");
		a1.setBankname("Punjab bank");
		a2.setBankname("Punjab bank");
		a3.setBankname("Punjab bank");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		
	}
}
