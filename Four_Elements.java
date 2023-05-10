package Variation;

public class Four_Elements {

	public static void main(String[] args) 
	{
	int[] a= {1, 4,3,2,1,2,3,4,5,6,3,4,5};
				int n=a.length;
				int x=8;
				myCode(a,n,x);
			}
			//EndOfMainMethod
			public static void myCode(int[] a,int n,int x) 
			{
				boolean ans=myans(a,x);
				System.out.println(ans);
			}
			private static boolean myans(int[] a,int x)
			{
				int cnt=0;
				for(int i=0;i<a.length-4;i++)
				{
					int sum=0;
					for(int j=i;j<i+4;j++)
					{
						sum=sum+a[j];
					}
					//System.out.println(sum);
					if(sum==x)
					cnt++;
				}
				if(cnt!=0)
				{
					return true;
				}
				return false;
			}
		}


