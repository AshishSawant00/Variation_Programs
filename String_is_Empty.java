package Variation;

public class String_is_Empty {

	public static void main(String[] args) 
	{
		String str1 = "GeeksforGeeks";
		myCode(str1);
	}
	//EndOfMainMethod
	private static void myCode(String str1)
	{
		boolean ans=myans(str1);
		System.out.println("Is string \""+str1+"\" empty? "+ans);
	}
	private static boolean myans(String str1)
	{
		for(int i=0;i<str1.length();i++)
		{
			if(str1.length()!=0)
				return true;
		}
		return false;
	}
}
