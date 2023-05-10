package Variation;

public class Equal_Parts {

	public static void main(String[] args) 
	{
		String str = "aaaabbbbcccc";  
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str) 	
	{
		if(str.length()%3==0)
		{
			int set=str.length()/3;
			int start=0;
			while(start<str.length())
			{
				for(int i=start;i<start+set;i++)
				{
					System.out.print(str.charAt(i));
				}
				System.out.println();
				start=start+set;
			}
		}
		else
			System.out.println(-1);
	}
}


