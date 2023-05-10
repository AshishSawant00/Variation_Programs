package Variation;

public class Frist_natural_number {

	public static void main(String[] args) 
	{
		int x = 16;
		myCode(x);
	}
	//EndOfMainMethod
	private static void myCode(int x)
	{
		int n=5;
		while(true)
		{
			int fact=findFact(n);
			if(fact%x==0)
			{
				System.out.println(n);
				break;
			}
			n++;
		}
	}
	private static int findFact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

}
