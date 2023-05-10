package Variation;

public class Number_of_occurence {

	public static void main(String[] args) 
	{
				int arr[]={1,2,3,4,2,5,2};
				int x = 2;
				myCode(arr,x);
			}
			//EndOfMainMethod
			public static void myCode(int[] arr, int x) 
			{
				int uc=0;
				for(int i=0;i<arr.length;i++)
				{
					if(x==arr[i])
					uc++;
				}
				System.out.println("Occurence of "+x+" is : "+uc);
	}

}
