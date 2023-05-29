package interpack;

public interface Inter1
{
	public default void method1() 
	{
		System.out.println("this is complete default- method from inter1");
	}
	
	public static void method2() 
	{
		System.out.println("this is complete static method from inter1");
	}
	
	void method3();
	void method4();
	

}
