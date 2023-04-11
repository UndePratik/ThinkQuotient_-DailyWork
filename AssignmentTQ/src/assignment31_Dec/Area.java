package assignment31_Dec;

public class Area {
	int side;
	int length;
	int breadth;
	
	public int Area(int side) {
		int area=side*side;
		return area;
	}
	public int Area(int length,int breadth) {
		int area=length*breadth;
		return area;
	}
	

	public static void main(String[] args) {
		Area a = new Area();
		int resultS = a.Area(4);
		System.out.println("Area of square is.."+resultS);
		
		int resultR = a.Area(5, 3);
		System.out.println("Area of rectangle is.."+resultR);

	}

}
