package Variation;
import java.util.*;
public class Union_of_two_arrays {

	public static void main(String[] args) 
	{
		int[] a ={1,4,5};
		int[] b ={2,3,6,7};
		myCode(a,b);
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int[]b) 
	{
		TreeSet<Integer> al=new TreeSet<Integer>();
		for(int i:a)
		{
			al.add(i);
		}
		for(int i:b)
		{
			al.add(i);
		}
		for(int i:al)
			System.out.println(i);
	}
}




