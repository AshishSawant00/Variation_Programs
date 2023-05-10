package Variation;

public class Compute_sum_of_digits_in_all_numbers_from_1_to_n {

	public static void main(String[] args) 
	{
		int n = 328;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int num=i;
			while(num>0)
			{
				sum=sum+(num%10);
				num=num/10;
			}
		}
		System.out.println("Sum of digits in numbers from 1 to "+n+" is " +sum);
	}
}

