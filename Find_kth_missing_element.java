package Variation;

public class Find_kth_missing_element {

	public static void main(String[] args) 
	{
		int[] a={1, 2, 3, 4, 5};
		int[] b={5, 4, 3, 1, 2};
		int k=3;
		int n=a.length;
		myCode(a,b,n,k);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int[] b,int n,int k) 
	{
		int missingele=-1;
		for (int i =k; i < n; i++) 
		{
			int cnt=0;

			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0) {
				missingele=a[i];
				break;
			}
		}
		System.out.println(missingele);
	}
}

