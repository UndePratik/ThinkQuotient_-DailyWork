package class_object;

public class ArithmeticOperation {
	int a;
	int b;
	
	

	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int div(int a,int b) {
		return a/b;
	}
	int mul(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		ArithmeticOperation a = new ArithmeticOperation();
		
		System.out.println("Addition       : "+a.add(10,30));
		System.out.println("Subtraction    : "+a.sub(100,20));
		System.out.println("Division       : "+a.div(100,20));
		System.out.println("Multiplication : "+a.mul(10,20));

	}

}
