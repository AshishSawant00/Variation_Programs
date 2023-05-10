package Variation;

public abstract class Krishnamurthy_Number {

	public static void main(String[] args)
	{
		int n=145;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n) 
	{
		int sum=0;
		int num=n;
		while(n>0)
		{
			int d = n%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n=n/10;
		}
		if(sum==num)
			System.out.println(sum+ " is a krishnamurthy number");
		else
			System.out.println("10is not a krishnamurthy number");
	}
}




