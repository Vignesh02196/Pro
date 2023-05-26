package com.onesofts.day12_poly;

public class UseCheckmax {
	
	public static void main(String args[]) {
		
		Checkmax m=new Checkmax();
		m.findmax(11);
		m.findmax(10,20);
		m.findmax(10, 20, 30);
		String [] values= {"vikiss","Jana","Bala"};
		m.findmax(values);
	 
	}

}
