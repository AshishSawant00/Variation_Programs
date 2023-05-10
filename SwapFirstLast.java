package Variation;

public class SwapFirstLast {

	public static void main(String[] args) 
	{
		//Given string str
		String str = "GeeksForGeeks";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str)
	{
		char[] ca = str.toCharArray();
		char temp = ca[0];
		ca[0] = ca[ca.length-1];
		ca[ca.length-1] = temp;
		for(char i:ca)
		{
			System.out.print(i+"");
		}			
	}
}
