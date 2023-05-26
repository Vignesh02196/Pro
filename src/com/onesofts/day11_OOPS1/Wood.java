package com.onesofts.day11_OOPS1;

public class Wood {
	private String brand;
	private int price;
	private String color;

	public void SetBrand(String b) {
		brand = b;
	}

	public String GetBrand() {
		return brand;
	}

	public void SetPrice(int p) {
		price = p;
	}

	public int GetPrice() {
		return price;
	}

	public void SetColor(String c) {
		color = c;
	}

	public String GetColor() {
		return color;
	}

	public Wood(String brand,int price,String color){
		this.brand=brand;
		this.color=color;
		this.price=price;
		
	}
	public String toString() {
		return "Brand"+GetBrand();
		
	}
}
