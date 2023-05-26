package com.test.day3;

public class Positve {
	public static void main(String[] args)
	{
		int num1=-10;
		int num2=8;
		int pos=0;
		int neg=0;
		for(int i=0;i<=num2;i++)
		{
			if(num1<=0)
			{
				pos++;
			}
			else if(num2>=0)
			{
				neg++;
			}
		}
		System.out.println(pos);
		System.out.println(neg);
	}

}
