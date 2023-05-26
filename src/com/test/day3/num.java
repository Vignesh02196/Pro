package com.test.day3;

public class num {
	public static void main(String []args)
	{
		int a=8;
		boolean isPrime=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				isPrime=false;
			}
			
		}
		if(isPrime==true)
		{
			System.out.println("is a Prime number");
		}
		else
		{
			System.out.println("not a prime no:");
		}
	}

}
