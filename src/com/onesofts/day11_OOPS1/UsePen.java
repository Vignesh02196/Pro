package com.onesofts.day11_OOPS1;

public class UsePen {
	public static void main (String [] args)
	
	{
	 Refil r=new Refil();
	 r.setBrand("REY");
	 r.setPrice(5);
	 r.setColor("RED");
	 
	 Pen p=new Pen();
	 p.setBrand("REYNOLDS");
	 p.setPrice(10);
	 p.setRefil(r);
	 
	 System.out.println(p.getRefil().getPrice());
	 System.out.println(p.getBrand());
	}

}
