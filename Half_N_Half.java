package Variation;

public class Half_N_Half {

	public static void main(String[] args) {

		int N = 100, M = 4;
		myCode(N,M);
	}
	//EndOfMainMethod
	public static void myCode(int N,int M) 
	{
		int cnt=0;
		while(true)
		{
			cnt++;
			if(cnt==M)
			{
				System.out.println(N);
				break;
			}
			N=N/2;
		}
	}
}
