package com.onesotfs.day12_OOPS2;

public class UseTelephone {
	public static void main(String []args) {
		Moto m=new Moto();
		m.colour="Yellow";
		m.isBluetooth=true;
		m.price=25000;
		Nokie n=new Nokie();
		n.colour="White";
		n.price=7500;
		n.message="HI";
		Samsung s=new Samsung();
		s.colour="BLACK";
		s.price=8500;
		s.camerapixel=8;
		System.out.println(m.price);
	}

}
