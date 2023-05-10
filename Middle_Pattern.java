package Variation;

public class Middle_Pattern {

	public static void main(String[] args) 
	{
				String s = "PROGRAM";
				myCode(s);
			}
			//EndOfMainMethod
			public static void myCode(String s) 
			{
				int mid=s.length()/2;
				String s1=s.substring(0, mid);
				String s2=s.substring(mid, s.length());
				s=s2+s1;
				for(int i=0;i<s.length();i++)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print(s.charAt(j));
					}
					System.out.println("$");
				}
			}
		}

	
