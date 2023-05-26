package com.onesofts.day11_OOPS1;

public class UseBike {
	public static void main(String [] args)
	{
		Battery b=new Battery();
		b.Brand="ULTRON";
		b.price=3000;
		b.isWarranty=true;
		
		Battery b1=new Battery();
		b1.Brand="EXIDE";
		b1.price=2500;
		b1.isWarranty=false;
		
		Battery b2=new Battery();
		b2.Brand="POWERON";
		b2.price=2800;
		b2.isWarranty=true;
		
		Bike n=new Bike();
		n.brand="R15";
		n.price=250000;
		n.battery=b;
		
		Bike n1=new Bike();
		n1.brand="YAMAHA";
		n1.price=150000;
		n1.battery=b1;
		
		Bike n2=new Bike();
		n2.brand="HERO";
		n2.price=75000;
		n2.battery=b2;
		
		
		System.out.println("BIKE BRAND=" +n.brand);
		System.out.println("BATTERY PRICE=" +n.battery.price);
	}

}
