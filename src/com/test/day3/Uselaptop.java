package com.test.day3;

public class Uselaptop {
	public static void main(String [] args)
	{
	Laptop l=new Laptop();
	l.brand="dell";
	l.color="blue";
	l.price=60000;
	l.iswarranty=true;
	String a=l.brand.toUpperCase();
	boolean b=l.brand.startsWith("h");
	char c=l.brand.charAt(3);
	String d=l.color.toLowerCase();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
}
