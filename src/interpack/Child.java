package interpack;

public class Child extends Parent
{
	String s = "Abhishek";
	
//	public void getdata()
//	{
//		System.out.println("this is child class Variable"+ " "+ s);
//		System.out.println("this is parent class variable"+" "+ super.s);
//		
//	}
	public static void main(String[] args) 
	{
		Child x=new Child();
		//x.getdata();
		System.out.println(x.s);
		System.out.println("--------------------------------");
		System.out.println("");
		System.out.println("");
		
	}
	

}
