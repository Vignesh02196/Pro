package com.onesotfs.day12_OOPS2;

public class Note extends Stationary {
	boolean isLongsize;
	
	public Note(String brand,int price,String color,boolean isLongsize) {
		super ( brand, price,color);
		this.isLongsize=isLongsize;
	}
public String toString() {
	return super.toString()+"  isLongsize: "+ isLongsize ;
}
}
