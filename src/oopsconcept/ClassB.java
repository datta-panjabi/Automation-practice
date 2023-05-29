package oopsconcept;

public class ClassB extends ClassA
{
      public void addition() 
      {
    	  int a;int b;int c;
    	 a=77;b=88;
    	 c= a*b;
    	 System.out.println(c);
      } 
    	  
    public static void main(String[] args) 
    {
    	ClassB h= new ClassB();
    	h.method1();
    	h.addition();
    	h.addition(90,110);
    	h.addition(500,500, 500);
    	
	}
	
	
	
}
