package Variation;

public class Delete_alternate_characters {

	public static void main(String[] args) 
	{
		String s1="hefshine";
		myCode(s1);
	}
	//EndOfMainMethod
	public static void myCode(String s1)
	{
		String s2="";
		for(int i=0;i<s1.length();i=i+2)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
}

