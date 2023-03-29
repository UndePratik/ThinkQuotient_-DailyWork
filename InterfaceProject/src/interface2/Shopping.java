package interface2;

class CreditCard implements Card
{
	float balance;
	
	public void payBill(float amount)
	{
		if(this.balance - amount>0)
		{
			balance=balance-amount;
			System.out.println("ammount paid :"+amount);
		}else
		{
			System.out.println("Insufficient balance !!!");
		}
	}
}
public class Shopping {
	
	void doShopping(CreditCard c,float amount)
	{
		c.payBill(amount);
	}

	public static void main(String[] args) {
		
		Shopping s = new Shopping();
		Card card;
		card = new CreditCard();
		//s.doShopping(card, 1230);
	}

}
