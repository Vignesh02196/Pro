package com.test.day3;

public class Pali {
	public static void main(String []args)
	{
		String word="Mad";
		String tem="";
		for(int i=word.length()-1;i>=0;i--)
		{
			tem=tem+word.charAt(i);
		}
		if (word.equalsIgnoreCase(tem))
		{
			System.out.println("The given String is Palindrome");
		}
		else {
			System.out.println("The given String is not a Palindrome");
		}
	}

}
