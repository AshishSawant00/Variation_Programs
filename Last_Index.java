package Variation;

public class Last_Index {

	public static void main(String[] args) 
	{
		String s="00001";
		myCode(s);
	}
	//EndOfMainMethod
	public static void myCode(String s) 
	{
		int ans=myans(s);
		System.out.println(ans);
	}
	private static int myans(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='1')
				cnt++;
		}
		if(cnt!=1) 
		{
			return cnt;
		}
		return -1;
	}
}
