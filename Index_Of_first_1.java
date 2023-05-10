package Variation;

public class Index_Of_first_1 {

	public static void main(String[] args) 
	{
		int arr[] ={0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		myCode(arr);
	}
	public static void myCode(int[] arr) 
	{
		int ans=myans(arr);
		System.out.println(ans);
	}
	private static int myans(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				return i;
		}
		return -1;
	}
}
