package com.test.day3;

public class Prime {
	public static void main(String[] args)
	{
		int a=12;
		boolean isPrime=true;
		for(int i=1;i<a;i++)
		{
			if(a%2==0)
			{
				isPrime=false;
			}
			
		}
		if(isPrime=true)
		{
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("it is notprime");
		}
	}

}
