package Variation;

public class Max_J_minas_I {

	public static void main(String[] args) 
	{
		int arr[] ={9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		myCode(arr);
	}
	//EndOfMainMethod
	private static void myCode(int[] a)
	{
		int m=-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[i]<a[j] && m<(j-i))
					m=j-i;
			}
		}
		System.out.println(m);
	}
}


