package com.onesofts.day11_OOPS1;

public class UseMobile {

	public static void main(String args[]) {

		Display d1 = new Display(4000, 6, "oppo");
		Display d2 = new Display(4500, 5, "MOTO");
		Display d3 = new Display(6000, 4, "HONOR");

		Mobile m1 = new Mobile("Oppo", 12000, d1);
		Mobile m2 = new Mobile("MOTOROLA", 18000, d2);
		Mobile m3 = new Mobile("HAWAII", 15000, d3);

		Mobile mobiles[] = { m1, m2, m3 };

		for (int i = 0; i < mobiles.length; i++) {
			if (mobiles[i].display.price >= 5000) {
				System.out.println("BRAND= " + mobiles[i].brand + "PRICE= " + (mobiles[i].price + 500));
			}
		}

	}

}
