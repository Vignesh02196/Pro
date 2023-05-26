package com.test.day3;

public class Vow {
	public static void main(String args[])
	{
		String word="education";
		
		for (int i=0;i<word.length();i++)
			
		{
			char c=word.charAt(i);
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				
				System.out.println(c);
			}
			
			
		}
	}

}
