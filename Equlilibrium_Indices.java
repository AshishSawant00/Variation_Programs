package Variation;

public class Equlilibrium_Indices {

	public static void main(String[] args) 
	{
		int[] nums = 
			{
					-7, 1, 5, 2, -4, 3, 0
			}
		;
		myCode(nums);
	}
	//EndOfMainMethod
	public static void myCode(int[] nums) 
	{
		for(int i=0;i<nums.length;i++)
		{
			int leftsum=calculateSum(0,i,nums);
			int rightsum=calculateSum(i+1,nums.length,nums);
			if(leftsum==rightsum)
			{
				System.out.println("Equilibrium indices found at : " +i);
			}
		}
	}
	private static int calculateSum(int start,int end,int[] nums)
	{
		int sum=0;
		for(int i=start;i<end;i++)
		{
			sum=sum+nums[i];
		}
		return sum;
	}
}


