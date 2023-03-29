package javabasic;

abstract class X
{
    int i = 11;
 
    int methodOneOfX()
    {
    	System.out.println("1."+i);
        return i *= i /= i;
    }
 
    abstract void methodTwoOfX(int i);
}
 
class Y extends X
{
    @Override
    void methodTwoOfX(int i)
    {
        System.out.println(i);
    }
}

 
 

public class Test
{
	 int i = 10;
	 
	    static Test t;
	    static double d;
	    static
	    {
	    	
	        d = 10;
	 
	        System.out.println(d);
	    }
	 
	    
    public static void main(String[] args)
    {
        new Y().methodTwoOfX(new Y().methodOneOfX());
        System.out.println("----------------");
        System.out.println(Test.t.t.t.t.t.t.i);
        System.out.println("----------------");
       
        try
        {
            System.out.println("This is try block");
        }
 
       // System.out.println("statement after try block");
 
        catch(Exception ex)
        {
            System.out.println("This is catch block");
        }
 
        // System.out.println("statement after catch block");
 
        finally
        {
            System.out.println("This is finally block");
        }
    }
}
