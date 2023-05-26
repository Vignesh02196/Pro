package Homework;

 class Ac {
	private String brand;
	private int price;
	private boolean isAutomatic;
	private Compressor compressor;
public void setbrand(String brand) {
		this.brand=brand;
		}
public String getbrand() {
		return brand;
	}
public void setprice(int price) {
		this.price=price;
			}
public int getprice() {
	return price;
}
public void setisAutomatic(boolean isAutomatic) {
	this.isAutomatic=isAutomatic;
}
public boolean getisAutomaic() {
	return isAutomatic;
}
public void setcompressor(Compressor compressor) {
	this.compressor=compressor;
}
public Compressor getcompressor() {
	return compressor;
}
 public Ac(String brand,int price,boolean isAutomatic,Compressor compressor) {
	 this.brand=brand;
	 this.price=price;
	 this.isAutomatic=isAutomatic;
	 this.compressor=compressor;
 }
 public String toString() {
	 return "Brand: "+brand+","+" Price:"+price+","+"isAutomatic: "+isAutomatic;
 }
 }
 class Compressor {
	 private String brand;
	 private int price;
	 private float capacity;
	 
	 public void setbrand(String brand) {
		 this.brand=brand;
	 }
	 public String getbrand() {
		 return brand;
	 }
	 public void setprice(int price) {
		 this.price=price;
	 }
	 public int getprice(){
		 return price;
		 }
	 public void setcapacity(float capacity) {
		 this.capacity=capacity;
		 }
	 public float getcapacity() {
		 return capacity;
	 }
	 public Compressor (String brand,int price,float capacity) {
		 this.brand=brand;
		 this.price=price;
		 this.capacity=capacity;
	 }
	 public String toString() {
		 return "Brand: "+brand+","+"Price: "+price+","+"Capacity: "+capacity;
	 }
 }

