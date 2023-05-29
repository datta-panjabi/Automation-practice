package oopsconcept;

public class Concreteclass extends Abstractclass
{
	int ok;
	
	public Concreteclass()
	{
		ok=50;
	}
	
	public void method2(int ok)
	{
		this.ok =ok;
		
		System.out.println(this.ok);
		
	}
	public void method3()
	{
		System.out.println("hiii this is completed method from abstract class:-2");
		
	}
	   
	 public static void main(String[] args) 
	{
		Concreteclass x= new Concreteclass();
		x.method1();
		x.method2(60);
		x.method3();
	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}
