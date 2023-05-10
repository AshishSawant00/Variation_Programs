package Variation;
 
public class remove_characters_2nd_From_1 {
	//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1="abcdabcdabcd";
				String s2="bc";
				myCode(s1,s2);
			}
	//EndOfMainMethod

	private static void myCode(String s1,String s2) 
	{
		//write code here
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				cnt++;
			}
			if(cnt==0)
			s=s+s1.charAt(i);
		}
		System.out.println(s);
	}
}

 