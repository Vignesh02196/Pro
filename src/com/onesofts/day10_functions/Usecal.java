package com.onesofts.day10_functions;

public class Usecal {
	public static void main (String [] args)
	{
		Cal c=new Cal();
		System.out.println(c.add(10,20,30));
		System.out.println(c.sub());
		c.mul(10,20);
		c.div();
	}

}
