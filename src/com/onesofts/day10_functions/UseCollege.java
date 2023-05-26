package com.onesofts.day10_functions;

public class UseCollege {
	public static void main(String [] args)
	{
		College c1=new College();
		c1.name="KOCAS";
		c1.location="KARUR";
		c1.fees=6500;
		c1.grade='A';
		
		College c2=new College();
		c2.name="JAIRAM";
		c2.location="DINDI";
		c2.fees=7500;
		c2.grade='C';
		
		College c3=new College();
		c3.name="VALUVAR";
		c3.location="GUINDY";
		c3.fees=8500;
		c3.grade='B';
		
		College [] colleges= {c1,c2,c3};
		
		System.out.println(c1.findMaxfee(colleges));
		c1.findMincollege(colleges);
	}

}
