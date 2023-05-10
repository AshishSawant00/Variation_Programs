package Variation;

public class Number_of_triangles_after_N_moves {

	public static void main(String[] args) 
	{
		int n = 2;
		myCode(n);

	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int rr=loopi(n);
		System.out.println(rr);
	}
	private static int loopi(int n) 
	{
		int []a=new int [n+1];
		a[0]=1;
		for(int i=1;i<=n;i++)
		{
			a[i]=a[i-1]*3+2; //formula
		}
		return a[n];
	}
}



