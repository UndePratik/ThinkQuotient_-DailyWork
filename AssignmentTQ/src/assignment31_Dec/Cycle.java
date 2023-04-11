package assignment31_Dec;

public class Cycle {
	int accountNo;
	int coOfWheels;
	
	Cycle(){
		
		System.out.println("I am default constructor");
	}
	
	Cycle(int accountNo,int coOfWheels){
		this();
		System.out.println("I am another constructor");
		
	}

	public static void main(String[] args) {
		Cycle c = new Cycle(1,23);
		
	}

}
