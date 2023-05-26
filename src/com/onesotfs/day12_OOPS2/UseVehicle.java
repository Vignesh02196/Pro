package com.onesotfs.day12_OOPS2;

public class UseVehicle {
	
	public static void main(String []args) {
		Sportscar s=new Sportscar();
		s.brand="TATA";
		s.price=25000;
		s.isPetrol=true;
		s.enginecc=5000;
		s.weight=900.50f;
		
		System.out.println("BRAND="+s.brand+","+"PRICE"+s.price+","+"NETPRICE:"+s.findnetprice(s.price));
	}

}
