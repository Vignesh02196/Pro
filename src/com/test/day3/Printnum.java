package com.test.day3;

public class Printnum {
	public static void main(String[] args) {
		String a = "Karur60093";
		int count=0;
		for (int i = 0; i < a.length(); i++) {
			
			if (a.charAt(i) >='0' && a.charAt(i) <='9') {
				count++;
				
			}
		}
		System.out.println(count);
	}
}
