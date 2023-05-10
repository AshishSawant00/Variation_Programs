package Variation;
import java.util.*;
public class Merge_Two_Array_In_Third {

	public static void main(String[] args) 
	{

		int[] a = new int[] 
				{7, -5, 3, 8, -4, 11, -19, 21};
		int[] b = new int[] 
				{6, 13, -7, 0, 11, -4, 3, -5};
		myCode(a,b);
	}
	private static void myCode(int[] a,int[] b) 
	{
		int[] c=new int[a.length+b.length];
		int cnt=0;
		for(int i:a)
		{
			c[cnt++]=i;	
		}
		for(int i:b)
		{
			c[cnt++]=i;
		}
		TreeSet<Integer> al=new TreeSet<>();
		for(int i:c)
			al.add(i);
		for(int i:al)
			System.out.print(i+" ");
	}

}
