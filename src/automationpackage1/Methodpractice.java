package automationpackage1;

public class Methodpractice {
	public static void method1() 
	{
		System.out.println("this is without argument method and non returning static method");
		
	}
	
	public void method2() 
	{
		System.out.println("this is without argument method and non returning  not static method");
	}
	
	public static int method3() 
	{
		System.out.println("this is without argument method and  returning  static method");
		int a=50;
		int b=30;
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	public  float method4()
	{
		System.out.println("this is without argument method and  returning non static method");
		double b,c,d;
		b=10.10;
	    c=11.11;
	    d=b+c;
       System.out.println(d);
       return 10;
	}
	
	public static void method5(int x, int y)
	{
		System.out.println("this is with argument method and  non returning static method");
		int n=x;
		int m=y;
		int f= n+m;
		System.out.println(f);
	}
	
	    public static void method6(String x,char z)
	    {
			System.out.println("this is with argument method and  non returning static method");
 	
	    }
	    
	
	}
