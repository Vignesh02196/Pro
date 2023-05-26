package com.onesofts.day11_OOPS1;

public class UseCar {
	public static void main(String [] args)
	{
		Engine e=new Engine();
		e.brand="FORD";
		e.price=180000;
		e.enginecc=170;
		
		Engine e1=new Engine();
		e1.brand="TATA";
		e1.price=15000;
		e1.enginecc=170;
		
		Engine e2=new Engine();
		e2.brand="SKODA";
		e2.price=17000;
		e2.enginecc=250;
		
		Car c=new Car();
		c.brand="BMW";
		c.price=18000000;
		c.engine=e;
		
		Car c1=new Car();
		c1.brand="NISSIAN";
		c1.price=2500000;
		c1.engine=e1;
		
		Car c2=new Car();
		c2.brand="AUDI";
		c2.price=5000000;
		c2.engine=e2;
		
		Car cars[]= {c,c1,c2};
		//Engine engines[]= {e,e1,e2};
		//Engine temp=engines[0];
		
		for(int i=0;i<cars.length;i++) 
		{
			if(cars[i].engine.brand.startsWith("S"))
			{
				System.out.println("BRAND = "+cars[i].brand+","+" PRICE= "+cars[i].price+","+"  ENGINE BRAND="+cars[i].engine.brand);
			}
		}
	}

}
