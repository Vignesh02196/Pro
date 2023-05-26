package com.onesofts.day10_functions;

public class Bike {
	String brand;
	int price;
	String color;
	boolean isPetrol;
	public int findNetPrice(int discountpercentage) {
		return price-(price*discountpercentage/100);
		
	}

}
