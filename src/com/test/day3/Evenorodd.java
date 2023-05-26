package com.test.day3;

public class Evenorodd {
	public static void main(String []args)
	{
		int num=16;
		int count=0;
		for(int i=1;i<=num;i++)
			
		{
			if(i%2!=0) {
				continue;
			}
			count=count+i;
			System.out.println(count);
		}
	}

}
