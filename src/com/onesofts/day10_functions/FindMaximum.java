package com.onesofts.day10_functions;

public class FindMaximum {
	public int findMax()
	{
	int a=10;
	int b=25;
	int c=35;
	
	if(a>b && a >c)
	{
		return a;
		
	}
	else if(b>a&& b>c)
	{
		return b;
	}
	else
	{
	  	return c;
	}
	}

}
