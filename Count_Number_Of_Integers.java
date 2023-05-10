package Variation;

public class Count_Number_Of_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []a= {65,86,71,12,13,14,15,11};
			
			int k=1;
			int cnt=0;
			int i = 0;
			while (  i < a.length  ) 
			{
				int b=a[i];
				while(b>0)
				{
					int c=b%10;
					//System.out.print(c+" ");
					if(c==k)
					{
						cnt++;
					}
					b=b/10;
				}
				i++;	
			}
			System.out.println(cnt);
	}

}
