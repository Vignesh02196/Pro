package com.onesofts.day10_functions;

public class UseBike {
	public static void main(String [] args)
	{
	  Bike b1=new Bike();
	  b1.brand="R15";
	  b1.price=200000;
	  b1.color="RED";
	  b1.isPetrol=true;
	  
	  Bike b2=new Bike();
	  b2.brand="TVS";
	  b2.price=70000;
	  b2.color="BLACK";
	  b2.isPetrol=true;
	   
	  
	  
		  System.out.println("BRAND= "+b1.brand +" "+"NETPRICE="+b1.findNetPrice(10));
		  System.out.println("BRAND= "+b2.brand +" "+"NETPRICE="+b2.findNetPrice(18));
	  }
	  
	  
	}


