package com.test.day3;

public class palindrome {
	public static void main(String args[])
	{
		String a="adam";
		String tem="";
		for(int i=a.length()-1;i>=0;i--) {
			
		
			tem=tem+a.charAt(i);
		}
			if(a.equalsIgnoreCase(tem)) 
			{
					System.out.println("The given String is palindrome");
		}
			else {
				System.out.println("The given String is Not palindrome");
			}
	}
		}

