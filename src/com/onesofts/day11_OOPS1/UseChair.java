

package com.onesofts.day11_OOPS1;

public class UseChair {
	public static void main(String args[]) {
		Wood w=new Wood("THEKU",5000,"BROWN");
		///w.SetBrand();
		//w.SetPrice();
		//w.SetColor();
		
		Chair c = new Chair("WOODLAND",7500,w);
	
		
		System.out.println(c.GetWood().GetColor());
		
	}

}
