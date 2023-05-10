package Variation;

public class Sylvesters_sequence {

	public static void main(String[] args)
	{
		int n = 6;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		int prod=1;
		int cnt=0;
		while(cnt<n)
		{
			int ele=prod+1;
			System.out.print(ele+" ");
			prod=prod*ele;
			cnt++;
		}
	}
}


