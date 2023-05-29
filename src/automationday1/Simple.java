package automationday1;

public class Simple 
{
	public int a=4;
	public int b=1;
	void getsum(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a+this.b);
	
	}
	public static void main(String[] args) 
	{
		Simple t =new Simple();
		t.getsum(3, 5);
	}

	

}
