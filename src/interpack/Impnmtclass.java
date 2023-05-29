package interpack;

public class Impnmtclass implements Firstinterface
{

	@Override
	public void addition(int a, int b) {
		int j= a;
		int l=b;
		System.out.println(j+l);
		
	}

	@Override
	public void multi(int x, int y)
	{
		int n=x;
		int m=y;
		System.out.println(n*m);
	}
	public static void main(String[] args) 
	{
		Impnmtclass h= new Impnmtclass();
		h.addition(10, 20);
		h.multi(400, 100);
	}

}
