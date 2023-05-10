package Variation;
import java.util.Arrays;
public class Min_sum_formed_by_digits {

	public static void main(String[] args) 
	{
		int[] a= 
			{
					6, 8, 4, 5, 2, 3
			}
		;
		myCode(a,a.length);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		Arrays.sort(a);
		String s1="";
		String s2="";
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				s1=s1+a[i];
			else
				s2=s2+a[i];
		}
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		System.out.println(num1+num2);
	}
}






