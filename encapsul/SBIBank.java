package encapsul;

import java.util.Scanner;

public class SBIBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount a1 = new BankAccount();
		
		System.out.println("Enter the account id :");
		/*int id = sc.nextInt();
		a1.setAc_id(id);*/
		a1.setAc_id(sc.nextInt());
		System.out.println("Enter  Account Number :");
		a1.setAc_number(sc.nextLong());
		System.out.println("Enter  Account name :");
		a1.setName(sc.next());
		System.out.println("Enter  Account Balance :");
		a1.setDebitCard(sc.nextLong());
		
		}

}
