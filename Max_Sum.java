package Variation;

public class Max_Sum {

	public static void main(String[] args) 
	{
		int	a[] ={1,8,2,4};
		int n =a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	public static void myCode(int a[], int n) 
	{
		int sum=0;
		int subtra=0;
		for(int i=0;i<a.length-1;i++)
		{
			subtra=a[i]-a[i+1];
			if(subtra<0)
			{
				subtra=subtra*(-1);
				sum=sum+subtra;
				subtra=0;
			}
			else
			{
				sum = sum + subtra;
				subtra=0;
			}
		}
		subtra = a[a.length-1]-a[0];
		if(subtra<0)
		{
			subtra = subtra *(-1);
			sum = sum + subtra;
		}
		else
		{
			sum = sum + subtra;
		}
		System.out.println(sum);
	}
}



