package Variation;

public class FirstNPrimeNo {

	public static void main(String[] args)
	{

		int num=20;
		myCode(num);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		int sum=1;
		int numOfprime=0;
		int num=2;
		while(true)
		{

			int cnt=0;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					cnt++;
				}
			}

			if(cnt==0)
			{
				//System.out.println(numOfprime+" "+num);
				sum+=num;
				numOfprime++;
			}

			num++;

			if(numOfprime==n-1)
			{
				break;
			}

		}
		System.out.println(sum);
	}
}



