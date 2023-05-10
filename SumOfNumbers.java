package Variation;

public class SumOfNumbers {

	public static void main(String[] args) {

		String str = "1abc23";
		myCode(str);
	}
	//EndOfMainMethod
	public static void myCode(String str) 
	{
		int sum=0;
		String s="";
		String a="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) //check here to given value is integer
			{
				s+=ch;
			}
			else 
			{
				sum+=Integer.parseInt(s);//create string to integer 
				s="0";
			}
		}
		System.out.println(sum+ Integer.parseInt(s));
	}
}
