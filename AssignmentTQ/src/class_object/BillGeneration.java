package class_object;

import java.util.Scanner;

public class BillGeneration {
	
	static Scanner sc  = new Scanner(System.in);
	int n_pizza;
	int n_puffs;
	int n_cooldrinks;
	
	
	
	void print(int n_pizza,int n_puffs,int n_cooldrinks) 
	{
		System.out.println("total no pizza      : 	"+n_pizza);
		System.out.println("total no puffs      : 	"+n_puffs);
		System.out.println("total no cooldrinks :   "+n_cooldrinks);
		
	}
	void disply(int n_pizza,int n_puffs,int n_cooldrinks)
	{
		int t_pizza = n_pizza*100;
		System.out.println("total price of pizza      : "+t_pizza);
		int t_puffs = n_puffs*20;
		System.out.println("total price of puffs      : "+t_puffs);
		int t_cooldrinks = n_cooldrinks*10;
		System.out.println("total price of cooldrinks : "+t_cooldrinks);
		int total = t_pizza+t_puffs+t_cooldrinks;
		System.out.println("Total : "+total);

	}
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("***WELCOME TO PIZZA HUNT***");
		BillGeneration bg = new BillGeneration();
		
		System.out.println("Enter no of pizza you want...");
		int n_pizza = sc.nextInt();
		System.out.println("Enter no of puffs you want...");
		int n_puffs = sc.nextInt();
		System.out.println("Enter no of cooldrinks you want...");
		int n_cooldrinks = sc.nextInt();
		
		bg.print(n_pizza,n_puffs,n_cooldrinks);
		System.out.println("------------------");
		bg.disply(n_pizza, n_puffs, n_cooldrinks);
		System.out.println("***Enjoy the SHOW***");
		

	}

}
