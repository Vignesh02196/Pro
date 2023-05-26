package com.onesofts.day12_poly;

public class Checkmax {
	public void findmax(int a) {
		if(a>10) {
			System.out.println("a is Highest");
		}
		else {
			System.out.println("a is smallest");
		}
	}
	public void findmax(int a,int b) {
		if(a>b) {
			System.out.println("a is Highest");
		}
		else {
			System.out.println("a is smallest");
		}
	}
	
	
	public void findmax(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("a is Highest");
		}
		else if(b>c && b>a) {
			System.out.println("b is Highest");
		}
		else if(c>b && c>a) {
			System.out.println("c is Highest");
		}
		else {
			System.out.println("invalid data");
		}
	}
	public void findmax(String [] args) {
		int max=args[0].length();
		String tem="";
		for(int i=0;i<args.length;i++) {
			if(args[i].length()>=max) {
				max=args[i].length();
				tem=args[i];
			}
		}
		System.out.println(tem);
	}

}
