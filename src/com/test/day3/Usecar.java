package com.test.day3;

public class Usecar {
	public static void main(String[]args)
	{
	Car c=new Car();
	c.brand="skoda";
	c.model="X";
	c.price=400000;
	c.ispetrol=true;
	Car c1=new Car();
	c1.brand="tata";
	c1.model="10";
	c1.price=50000;
	c1.ispetrol=true;
	Car c2=new Car();
	c2.brand="mahendira";
	c2.model="X";
	c2.price=50000;
	c2.ispetrol=false;
	int a =c.brand.length();
	int b =c1.brand.length();
	int d =c2.brand.length();
	int total=c.price+c1.price+c2.price;
	String e=c.brand.toUpperCase();
	String f=c1.brand.toUpperCase();
	String g=c2.brand.toUpperCase();
	System.out.println(e+"   " +c.model+"  "+c.price +"  "+c.ispetrol);
	System.out.println(f+"   " +c1.model+"  "+c1.price +"  "+c1.ispetrol);
	System.out.println(g+"   " +c2.model+"  "+c2.price +"  "+c2.ispetrol);
	}

}
