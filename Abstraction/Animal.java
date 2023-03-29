package Abstraction;

abstract class animals 
{ 
    // They all love to eat. So let's implement them for everybody 
    void eat() 
    { 
        System.out.println("Eating..."); 
    } 
    // The make different sounds. They will provide their own implementation. 
    abstract void sound(); 
} 
 
class dog extends animals 
{ 
    void sound() 
    { 
        System.out.println("Woof Woof"); 
       // eat();
    } 
} 
 
class cat extends animals 
{ 
    void sound() 
    { 
        System.out.println("Meoww"); 
    } 
} 
public class Animal{
	public static void main(String[] args) {
		animals a;
		a=new dog();
		a.sound();
		//a.eat();
		a=new cat();
		a.sound();
	}
}