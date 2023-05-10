package Variation;

public class number_of_consecutive {

	public static void main(String[] args) 
	{
		int arr[] ={100, 10, 5, 25, 35, 14};
		int n = 6;
		myCode(arr,n);
	}
	//EndOfMainMethod
	private static void myCode(int a[],int n)
	{
		int sum=1;
		for(int i=0;i<a.length;i++)
		{
			sum=sum*a[i];
		}
		System.out.println(sum);
		int cnt=0;
		int s=0;
		while(sum>0)
		{
			int rem=sum%10;
			if(rem==0)
			{
				cnt++;
			}
			sum=sum/10;
		}
		System.out.println(cnt);
	}
}


