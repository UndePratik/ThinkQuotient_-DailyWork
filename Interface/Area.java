package Interface;
interface Shape 
{ 
    void display(); 
    double area(); 
} 
  
class Rectangle implements Shape  
{ 
	//The variables declared in interface are by default static.
    int length, width; 
    Rectangle(int length, int width) 
    { 
        this.length = length; 
        this.width = width; 
    } 
    @Override
    //Members of interface public by default
	public void display()  
    { 
        System.out.println("****\n*  *\n*  *\n****");  
    } 
    @Override 
    public double area()  
    { 
        return (double)(length*width); 
    } 
}  
  
class Circle implements Shape  
{ 
	//variable is by default final
    double pi = 3.14; 
    int radius; 
    Circle(int radius) 
    { 
        this.radius = radius; 
    } 
    @Override 
    public void display()  
    { 
        System.out.println("O"); // :P 
    } 
    @Override 
    public double area()  
    {  
        return (double)((pi*radius*radius)/2); 
    } 
} 
public class Area {

	public static void main(String[] args) {
		Shape s;
		s=new Rectangle(10,5);
		s.display();
		s.area();
		System.out.println("---------------");
		s=new Circle(5);
		s.display();
		System.out.println(s.area());
		

	}

}
