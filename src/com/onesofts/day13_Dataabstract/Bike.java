package com.onesofts.day13_Dataabstract;

public class Bike implements Sportbike,ElectricBike{
	public void mileage(int m) {
		System.out.println(m);
	}
	 public void enginecc(int s) {
		 System.out.println(s);
	 }
	 public void batterpercenatge(int b) {
		 System.out.println(b);
	 }

}
