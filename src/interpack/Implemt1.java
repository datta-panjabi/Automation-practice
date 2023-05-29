package interpack;

public class Implemt1 implements Inter1,Inter2 {

	@Override
	public void method3() 
	{
		System.out.println("this method is implemented in the implementation class from the inter1");
		
	}

	@Override
	public void method4() 
	{
		
		System.out.println("this method is implemented in the implementation class from the inter1");
	}
        public static void main(String[] args) 
        {
        	Implemt1 x= new Implemt1();
        	x.method1();
        	Inter1.method2();
        	x.method3();
        	x.method4();
        	
        }
}
