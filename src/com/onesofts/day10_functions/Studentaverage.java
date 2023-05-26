package com.onesofts.day10_functions;

public class Studentaverage {
	public int total(int tam,int eng,int math,int sci, int soc)
	{
		return tam+eng+math+sci+soc;
	}
	
	public void avg(int tam,int eng,int math,int sci,int soc)
	{
		System.out.println((tam+eng+math+sci+soc)/5);
	}

}
