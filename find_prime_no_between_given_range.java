package Variation;

public class find_prime_no_between_given_range {

	public static void main(String[] args)
	{

		int Start=8;
		int end=50;
		myCode(Start,end);
	}
	//EndOfMainMethod
	private static void myCode(int start,int end) 
	{
		for(int i=start;i<end;i++)
		{
			int cnt=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==0)
				System.out.println(i);
		}
	}
}



