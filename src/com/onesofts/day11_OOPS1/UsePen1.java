package com.onesofts.day11_OOPS1;

public class UsePen1 {
	public static void main(String [] args)
	{
		Refil1 r=new Refil1("REY",10,"RED");
		Pen1 p=new Pen1("REYNOLDS",20,r);
		System.out.println(p.refil1.brand);	
	}

}
