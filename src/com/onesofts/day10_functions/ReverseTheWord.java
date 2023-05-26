package com.onesofts.day10_functions;

public class ReverseTheWord {
	
	public String reverseWord(String name)
	{ 
		String tem="";
		for(int i=name.length()-1;i>=0;i--)
		{
			  tem=tem+name.charAt(i); 
		}
		return tem;
	}
	
	public char findLastChar()
	{
		String name1="Vignesh";
		return name1.charAt(name1.length()-1);
		
		
	}

}
