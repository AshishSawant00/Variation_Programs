package Variation;

public class Find_difference_between_sum_of_diagonals {

	public static void main(String[] args) 
	{
		int N=3;
		int	Grid[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
		myCode(N,Grid);
	}
	//EndOfMainMethod
	public static void myCode(int n, int[][] a) 
	{
		int c=0;
		int c1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
					c+=a[i][j];
				if(i==n-j-1)
					c1+=a[i][j];
			}
		}
		System.out.println(Math.abs(c-c1));
	}
}


