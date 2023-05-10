package Variation;

public class Program_to_print_reciprocal_of_Letters {

	public static void main(String[] args) 
	{

		String s = "abC";
		myCode(s);
	}
	//EndOfMainMethod
	public static void myCode(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' &&  ch<='z')
			{
				s1=s1+(char)(219-ch);
			}
			else
			{
				s1=s1+(char)(155-ch);
			}
		}
		System.out.println(s1);
	}

}
