package Variation;

public class Swap_kth_elements {

	public static void main(String[] args) 
	{
		int[] a={5, 3, 6, 1, 2,6,2,4,5,9};
		int k=4;
		myCode(a,k);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int k) 
	{
		int findex=k-1;
		int sindex=a.length-1;
		if(k<=a.length)
		{
			int temp=a[findex];
			a[findex]=a[sindex];
			a[sindex]=temp;
		}
		for(int i:a)
			System.out.print(i+" ");	
	}
}





