package com.onesofts.day10_functions;

public class StringArray {
	
	public String min (String[]a)
	{   
		String tem=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i].length()<tem.length())
			{
				tem=a[i];
			}
		}
		return tem;
	}
	

}
