package casting;

public class Child1 implements Parent1
{
	public void method3() 
	{
		System.out.println("this method is from  child class 3");
	}
    
	public void method4() 
	{
		System.out.println("this method is from  child class 4");
	}

	@Override
	public void method1() 
	{
		 System.out.println("interface method-1 ");
		
	}

	@Override
	public void method2() {
		 System.out.println("interface method-2 ");
		
	}
	
	public static void main(String[] args)
	{
		Parent1 y = new Child1();
		y.method1();
		y.method2();
		Child1 x = new Child1();
		x.method3();
		x.method4();
		
	}

}
