package casting;

public interface Parent1 
{
	void method1() ;
	void method2();
	public static void main(String[] args) 
	{
		Parent1 y = new Child1();
		y.method1();
		y.method2();
		
		
	}
}
