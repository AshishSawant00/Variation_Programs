package Variation;

public class RemoveFirstLast {

	public static void main(String[] args) 
	{

		//Given string str
		String str = "GeeksForGeeks";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str)
	{
		for(int i=1;i<str.length()-1;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}





