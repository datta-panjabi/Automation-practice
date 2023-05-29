package oopsconcept;

public class Parentclass 
{
     public void mehthod1()
     {
    	 System.out.println("this is parent1 class mehtod ");
	
     }
     
     int a=20;
     public static void main(String[] args)
     {
    	 Parentclass x= new Parentclass();
    	 x.mehthod1();
    	 System.out.println(x.a);
		
	 }
}
