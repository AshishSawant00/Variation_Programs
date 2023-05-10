package Variation;
public class KSubArray {

	public static void main(String[] args) 
	{
		int	n = 4, k = 4;
		int arr[]={100, 200, 300, 400};
		myCode(k,arr,n);
	}
	//EndOfMainMethod
	public static void myCode(int k, int[] arr,int n) 
	{

		int max=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+arr[j];
			}
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
	}
}
