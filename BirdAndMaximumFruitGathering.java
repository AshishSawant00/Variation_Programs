package Variation;

public class BirdAndMaximumFruitGathering {

	public static void main(String[] args) 
	{
		int[] a={2 ,1 ,3 ,5 ,0 ,1 ,4};
		int n=a.length;
		int m=3;
		myCode(a,n,m);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n,int m) 
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
				sum=sum+i;
		}
		System.out.println(sum);
	}

}

	




