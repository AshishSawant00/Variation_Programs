package Variation;

public class find_X_Y {

	public static void main(String[] args)
	{
		int a = 2, b = 3, n = 7;
		myCode(a,b,n);
	}
	//EndOfMainMethod
	private static void myCode(int a,int b,int n)
	{
		int cnt=0;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if((a*i)+(b*j)==n)
				{
					System.out.println("x="+i+" "+"y="+j);
					cnt++;					
					break;
				}
			}
		}
	if(cnt==0)
		{
			System.out.println("No solution");
		}
	}
}


