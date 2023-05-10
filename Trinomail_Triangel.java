package Variation;

public class Trinomail_Triangel {

	public static void main(String[] args) 
	{
		int n = 4;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int[][] a=new int[n][n*2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j+i==n || j-i==n)
					a[i][j]=1;
				else if(j+i>=n && j-i<n)
				{
					a[i][j]=a[i-1][j]+a[i-1][j-1]+a[i-1][j+1];
				}
			}
		}
		printArr(a,n);
	}
	private static void printArr(int[][] a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j+i>=n && j-i<=n)
					System.out.print(a[i][j]+" ");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}
}




