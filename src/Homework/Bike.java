package Homework;

public class Bike {
	
	private String model;
	private int price;
	private String noplate;
	private int mileage;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNoplate() {
		return noplate;
	}
	public void setNoplate(String noplate) {
		this.noplate = noplate;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Bike(String model, int price, String noplate, int mileage) {
		super();
		this.model = model;
		this.price = price;
		this.noplate = noplate;
		this.mileage = mileage;
	}
	
	public String toString() {
		return "Bike [model=" + model + ", price=" + price + ", noplate=" + noplate + ", mileage=" + mileage + "]";
	}	

}
