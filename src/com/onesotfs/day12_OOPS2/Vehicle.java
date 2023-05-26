package com.onesotfs.day12_OOPS2;

public class Vehicle {
	String brand;
	int price;
	public String findnetprice(int price) {
		return "netprice: "+(price+(price*10/100));
	}

}
