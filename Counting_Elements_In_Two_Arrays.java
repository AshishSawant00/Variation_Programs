package Variation;

import java.util.Arrays;

public class Counting_Elements_In_Two_Arrays {

	public static void main(String[] args) 
	{

		int[] a={1,2,3,4,7,9,2};
		int[] b={0,1,2,1,1,4};
		myCode(a,b);
	}
	private static void myCode(int[] a,int[] b) 
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<b.length;j++)
			{
				if(b[j]<=a[i])
					cnt++;
			}
			a[i]=cnt;
		}
		//for(int i=0;i<a.length;i++)
			//System.out.print(a[i]+" ");
		System.out.println(Arrays.toString(a));
	}

}
