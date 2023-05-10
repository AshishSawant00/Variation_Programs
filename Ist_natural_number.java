package Variation;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;

public class Ist_natural_number {

	public static void main(String[] args) 
	{
		int x = 16;
		myCode(x);
	}
	//EndOfMainMethod
	private static void myCode(int x)
	{
		for (int i = 1; i < x; i++) 
		{
			BigInteger fact=findfacts(i);
			if(fact.mod(BigInteger.valueOf(x))==BigInteger.valueOf(0))
			{
				System.out.println(i);
				break;
			}
		}

	}
	private static BigInteger findfacts(int i) 
	{
		BigInteger fact=BigInteger.valueOf(1);
		while(i>0)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
			i--;
		}
		return fact;
	}
	int i=1;
	int fact=1;
	
}


