package Variation;

public class Sieve_of_Sundaram {

	public static void main(String[] args) 
	{
		int n = 20;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{

		for(int i=2;i<n;i++)
		{
			int cnt=0;
			int a=i;
			for(int j=2;j<a;j++)
			{
				if(a%j==0)
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
