package Variation;

public class Maximum_Repeating_number {

	public static void main(String[] args) 
	{

		int k=3;
		int	arr[] = 
		{
			2, 2, 1, 2
		}
		;
		int n=arr.length;
		myCode(arr,n,k);
	}
	//EndOfMainMethod
	public static void myCode(int[] arr, int n, int k) 
	{
		//Arrays.sort(arr);
		int max=Integer.MIN_VALUE;
		int l=-1;
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				cnt++;
			}
			if(cnt==k)
			l=i;
		}
		if(l==-1)
		System.out.println(0);
		else
		System.out.println(arr[l]);
	}
}



