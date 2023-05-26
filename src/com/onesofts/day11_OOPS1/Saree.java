package com.onesofts.day11_OOPS1;

public class Saree {
	private String brand;
	private int price;
	private String color;
	private boolean isHeavyweight;

	public void Setbrand(String brand) {
		this.brand = brand;

	}

	public String GetBrand() {
		return brand;
	}

	public void SetPrice(int price) {
		this.price = price;

	}

	public int GetPrice() {
		return price;
	}

	public void SetColor(String color) {
		this.color = color;

	}

	public String GetColor() {
		return color;
	}

	public void SetisHeavyweight(boolean isHeavyweight) {
		this.isHeavyweight = isHeavyweight;

	}

	public boolean getIsHeavyweight() {
		return isHeavyweight;
	}

	public Saree(String brand, int price, String color, boolean isHeavyweight) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isHeavyweight = isHeavyweight;
	}

	public String toString() {
		return ("BRAND=" + brand + "," + " PRICE=" + price + "," + " COLOR=" + color + "," + " IsHEAVYWEGHT="
				+ isHeavyweight);
	}

}
