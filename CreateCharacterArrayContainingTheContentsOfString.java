package Variation;

//import java.util.Arrays;

public class CreateCharacterArrayContainingTheContentsOfString {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="ab";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	public static void myCode(String s1,String s2) 
	{
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		String s="[";
		for (int i = 0; i < a.length; i++) 
		{
			if(i<a.length-1)
			{
				s+=a[i]+", ";
			}
			else
				s+=a[i];
		}
		System.out.println(s+"]");
		String s3="[";
		for(int j=0;j<b.length;j++)
		{
			if(j<b.length-1)
				s3+=b[j]+", ";
			else
				s3+=b[j];
		}
		System.out.println(s3+"]");

	}
	//System.out.println(Arrays.toString(ca1));
	//System.out.println(Arrays.toString(ca2));
}


