package javabasic;

class A
{
    static String s = "AAA";
    String b;
  static
    {
        s = s + "BBB";
        //System.out.println("1."+s);
    }
 
    /*{
    	b="jsbfajsl";
        s = "AAABBB";
        //System.out.println("2."+s);
    }*/
   
}
 
class B extends A
{
    static
    {
    	
        s = s + "BBBAAA";
        //System.out.println("3."+s);
    }
 
    {
        //System.out.println("4."+s+" "+b);
    }
}
 
public class MainClass1
{
    public static void main(String[] args)
    {
   System.out.println(B.s);
   System.out.println(A.s);
        B b = new B();
    }
}