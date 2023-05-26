package com.test.day3;

public class Upper {
	public static void main(String args[])
	{
		String a="Vignesh";
		int tem=0;
		String b=a.toUpperCase();
		for (int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				tem++;
			}
			
		}
		System.out.println(tem);
		}

}
