package com.onesofts.day11_OOPS1;

public class Pen {
	
	private String brand;
	private int price;
	private Refil refil;
	
	public void setBrand(String brand)
	{
	  this.brand=brand;
	}
	
	public String getBrand() {
		return brand;
		
	}
	
	public void setPrice(int p)
	{
		price=p;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setRefil(Refil r)
	{
		refil=r;
	}
	
	public Refil getRefil() {
		return refil;
	}

}
