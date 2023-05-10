package Variation;

public class Array_contains_elements {

	public static void main(String[] args) 
	{
				int[] a={4, 5, 2, 3,3,5};
				int A=2;
				int B=5;
				myCode(a,A,B);
			}
			//EndOfMainMethod
			public static void myCode(int[] a,int A,int B)
			{
				boolean ans=myans(a,A,B);
				System.out.println(ans);
			}
			private static boolean myans(int[] a,int A,int B)
			{
				int cnt=0;
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>=A && a[i]<=B )
					cnt++;
				}
				if(cnt==a.length)
				{
					return true;
				}
				return false;
			}
		}

