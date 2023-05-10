package Variation;

public class Red_OR_Green {

	public static void main(String[] args) 
	{
		int N=5;
		String	S="RGRGR";
		myCode(N, S);
	}
	//EndOfMainMethod
	public static void myCode(int N, String S)
	{
		int cnt=0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)=='R')
				cnt++;
		}
		int a=N-cnt;
		if(cnt<a)
			System.out.println(cnt);
		else
			System.out.println(a);
	}
}





