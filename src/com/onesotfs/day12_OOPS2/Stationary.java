package com.onesotfs.day12_OOPS2;

public class Stationary {
	String brand;
	int price;
	String color;
	
	public Stationary(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		
	}
public String toString() {
	return "Brand:"+brand+","+" Price: "+price+","+"Color: "+color;
}
}
