package Variation;

public class Minimum_move_to_front_operation {

	public static void main(String[] args) 
	{
		int a[]= {3, 2 , 1, 4};
		int num=0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;

			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					cnt++;
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}

			if(cnt!=num)
				num++;
		}
		System.out.println(num);
	}

}

