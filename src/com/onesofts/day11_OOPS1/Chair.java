package com.onesofts.day11_OOPS1;

public class Chair {
	private String brand;
	private int price;
	private Wood wood;
	public void SetBrand(String b) {
		brand = b;
	}
	public String getBrand() {
		return brand;
	}
	public void SetPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	public void SetWood(Wood w) {
		wood = w;
	}

	public Wood GetWood() {
		return wood;
	}
 public Chair(String brand,int price,Wood wood) {
	 this.brand=brand;
	 this.price=price;
	 this.wood=wood;
 }
 public String toString() {
	 return "Brand"+getBrand();
 }
}
