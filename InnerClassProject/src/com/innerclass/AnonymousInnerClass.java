package com.innerclass;

interface Doable
{
	public void doIt();
}

class Car
{
	public void driver()
	{
		System.out.println("I am driving");
	}
}

abstract class Cake
{
	void doBaking()
	{
		System.out.println("I am Baking");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		//Using interface
		Doable d = new Doable()
				{

					@Override
					public void doIt()
					{
						System.out.println("I am Doing");
					}
			
				};
				d.doIt();
				
		//using concrete class
		Car c = new Car()
		{
			public void driver()
			{
				System.out.println("I am Driving fortuner");
			}
			
		};
		c.driver();
		
		//using abstract class
		Cake c1 = new Cake()
		{
			void doBaking()
			{
				System.out.println("I am baking");
			}
			
		};
		c1.doBaking();

	}

}
