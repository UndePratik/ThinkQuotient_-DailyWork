package Abstraction;


 abstract class Mobile
{
	static String name="Samsung";
	int price=3000;
	Mobile(String color)
	{
		System.out.println("construtor called");
	}
	public void frontCamera()
	{
		System.out.println("Mobile with front camara");
	}
	 abstract public void frontFlash();
}
  class CameraWithFlash extends Mobile
 {

	CameraWithFlash(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void frontFlash() {
	   System.out.println("provinding functionality");
	   System.out.println("provinding 5px mega camera with flash option");
		
	}
	 
 }
 
	 
 

public class CameraMain {

	public static void main(String[] args) {
		Mobile m=new CameraWithFlash("silver");
		m.frontCamera();
		m.frontFlash();
		
		
		

	}

}
