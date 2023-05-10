package Variation;

public class Front_Back_Transformation {

	public static void main(String[] args) 
	{
		String s = "Hello";
		myCode(s);
	}
	//EndOfMainMethod
	public static void myCode(String s)
	{
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				char ch=(char)(155-s.charAt(i));
				s2+=ch;
			}
			else
			{
				char ch=(char)(219-s.charAt(i));
				s2+=ch;
			}
		}
		System.out.println(s2);
	}
}
