package com.onesofts.day13_Dataabstract;

public class Cardiologist extends Doctor {
	public void sleep(String hour) {
		System.out.println(hour);
	}
	public void walk(int speed) {
		System.out.println(speed);
	}
	public void WorkgforLiving(String job) {
		System.out.println(job);
	}
	public void showSalary(int ex)
	{
		if(ex>0 && ex<4)
		{
			System.out.println("450000 per Annum");
		}
		else if(ex>5 && ex<9 )
		{
			System.out.println("7800000 per Annum");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
