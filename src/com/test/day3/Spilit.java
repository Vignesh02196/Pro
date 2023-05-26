package com.test.day3;

public class Spilit {
	public static void main(String[]args)
	{
		String a="java,Python,c";
		String[]value=a.split(",");
		int c=value[0].length();
		int d=value[1].length();
		int e=value[2].length();
		String f=value[0].toLowerCase();
		String g=value[1].toLowerCase();
		String h=value[2].toLowerCase();
		System.out.println(c+"  "+d+"  "+e );
		System.out.println(f+"  "+g+"  "+h );
	}

}
