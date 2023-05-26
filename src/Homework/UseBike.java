package Homework;
import java.util.*;
public class UseBike {
	public static void main(String args[]) {
		Bike b1=new Bike("R15",2000000,"TN22AC8585",35);
		Bike b2=new Bike("HONDA",250000,"TN23AC8586",40);
		Bike b3=new Bike("PULSAR",100000,"TN22AC8585",35);
		Bike b4=new Bike("DIO",1200000,"TN47AC8787",35);
		Bike b5=new Bike("APRILA",1500000,"TN50AC8585",40);
		Bike b6=new Bike("APACHE",1500000,"TN22AC9722",35);
		Bike b7=new Bike("SHINE",900000,"TN22AC9789",50);
		Bike b8=new Bike("UNICORN",1000000,"TN37AC9722",35);
		HashMap<String,Bike>b=new HashMap<>();
		b.put(b1.getNoplate(), b1);
		b.put(b2.getNoplate(), b2);
		b.put(b2.getNoplate(), b3);
		b.put(b4.getNoplate(), b4);
		b.put(b5.getNoplate(), b5);
		b.put(b6.getNoplate(), b6);
		b.put(b7.getNoplate(), b7);
		b.put(b8.getNoplate(), b8);
		/*for(Bike x:b.values()) {
			if(x.getMileage()>45) {
				System.out.println("Good Mileage");
			}
			else
			{
				System.out.println("ok Mileage");
			}
		}*/
		int max=0;
		for(String y:b.keySet()) {
			//if(y.getPrice()>max)
			{
				
				
			}
		}
		System.out.println(max);
	}
		//b.forEach((x,y)->System.out.println(x));
		//b.keySet().forEach(x->System.out.println(x));
		//b.values().forEach(y->System.out.println(y));
	}


