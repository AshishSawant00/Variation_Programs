package Variation;

public class Missing_element_of_AP {

	public static void main(String[] args)
	{
		int[] a= {2, 4, 8, 10, 12, 14};
		myCode(a,a.length);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		int diff=a[1]-a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]!=diff)
			{
				System.out.println(a[i]+diff);
				break;
			}
		}
	}

}
